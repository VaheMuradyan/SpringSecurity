package com.secure.notes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.notes.models.User;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByUserName(String userName);

    Boolean existsByUserName(String user);

    Boolean existsByEmail(String email);
}
