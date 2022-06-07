package com.projet.etudiant.security;

import com.projet.etudiant.security.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private  SecurityService securityService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = securityService.loaduserByUserName(username);
         Collection<GrantedAuthority> authorities = new ArrayList<>();
         user.getRoles().forEach( role ->{
             SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
             authorities.add(authority);});

                org.springframework.security.core.userdetails.User springScurityuser=new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities);
        return springScurityuser;
    }
}
