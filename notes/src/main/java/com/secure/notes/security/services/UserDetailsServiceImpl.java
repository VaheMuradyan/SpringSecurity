package com.secure.notes.security.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.secure.notes.models.User;
import com.secure.notes.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    private UserRepository userRepository;
    
    public UserDetailsServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username)
        .orElseThrow(() -> new UsernameNotFoundException("User not found whith username: " + username));
        return UserDetailsImpl.build(user);
    }
    
}
