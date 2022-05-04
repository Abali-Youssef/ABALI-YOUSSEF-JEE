package com.projet.userrole.service;

import com.projet.userrole.entities.Role;
import com.projet.userrole.entities.User;

public interface UserService {
User addNewUser(User user);
Role addNewRole(Role role);
    User findUserByUserName (String userName);
    Role findRoleByRoleName (String roneName);
    void addRoleTOUser(String username, String roleName);
    User authenticate(String userName, String password);

}
