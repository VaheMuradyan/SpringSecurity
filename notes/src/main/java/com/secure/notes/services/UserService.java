package com.secure.notes.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.secure.notes.dtos.UserDTO;
import com.secure.notes.models.User;

public interface UserService {

    void updateUserRole(Long userId, String roleName);
    List<User> getAllUsers();
    UserDTO getUserById(Long id);
    User findByUsername(String username);
   
}
