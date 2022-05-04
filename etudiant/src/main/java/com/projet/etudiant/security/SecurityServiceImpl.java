package com.projet.etudiant.security;

import com.projet.etudiant.security.entities.Role;
import com.projet.etudiant.security.entities.User;
import com.projet.etudiant.security.repositories.RoleRepository;
import com.projet.etudiant.security.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class SecurityServiceImpl implements SecurityService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository ;
    @Autowired
    PasswordEncoder passwordEncoder;



    @Override
    public User saveNewUser(String username, String password, String rePassword) {
        if(!password.equals(rePassword)) throw new RuntimeException ("Passwords not match");
        String hashedPWD=passwordEncoder.encode (password);
        User appuser=new User();
        appuser.setUserId(UUID.randomUUID().toString());
        appuser.setUsername (username);
        appuser.setPassword (hashedPWD);
        appuser.setActive(true);
        userRepository.save(appuser);
        return appuser;
    }

    @Override
    public Role saveNewRole(String roleName, String description) {
        Role appRole =roleRepository.findByRoleName (roleName);
        if(appRole!=null) throw new RuntimeException("Role "+roleName+" already exist");
        appRole=new Role();
        appRole.setRoleName (roleName);
        appRole.setDesc(description);

        return roleRepository.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User appUser=userRepository.findByUsername (username);
        if(appUser==null) throw new RuntimeException("User not found");
        Role appRole=roleRepository.findByRoleName (roleName);
        if(appRole==null) throw new RuntimeException("Role not found");
        appUser.getRoles().add(appRole);
    }

    @Override
    public void removeRoleFromUser(String username, String roleName) {
        User appUser=userRepository.findByUsername (username);
        if(appUser==null) throw new RuntimeException("User not found");
        Role appRole=roleRepository.findByRoleName (roleName);
        if(appRole==null) throw new RuntimeException("Role not found");
        appUser.getRoles().remove(appRole);
    }

    @Override
    public User loaduserByUserName(String username) {
        return userRepository.findByUsername(username);
    }
}
