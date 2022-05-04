package com.projet.userrole.repositories;

import com.projet.userrole.entities.Role;
import com.projet.userrole.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByRoleName(String roleName);
}
