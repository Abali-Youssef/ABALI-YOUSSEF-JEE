package com.projet.etudiant.security.repositories;

import com.projet.etudiant.security.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByRoleName(String roleName);
}
