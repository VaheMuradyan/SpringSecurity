package com.secure.notes.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.notes.models.AppRole;
import com.secure.notes.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByRoleName(AppRole appRole);
}
