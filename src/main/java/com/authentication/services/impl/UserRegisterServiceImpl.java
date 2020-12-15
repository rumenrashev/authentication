package com.authentication.services.impl;

import com.authentication.persistance.repositories.RoleRepository;
import com.authentication.persistance.repositories.UserRepository;
import com.authentication.services.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public UserRegisterServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

}
