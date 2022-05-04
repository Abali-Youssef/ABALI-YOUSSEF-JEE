package com.projet.etudiant.security;

import com.projet.etudiant.security.entities.Role;
import com.projet.etudiant.security.entities.User;

public interface SecurityService {
    User saveNewUser (String username, String password, String rePassword);
    Role saveNewRole(String roleName, String description);
    void addRoleToUser(String username, String roleName);
    void removeRoleFromUser (String username, String roleName);
    User loaduserByUserName (String username);
}
