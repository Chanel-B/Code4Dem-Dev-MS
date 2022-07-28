package com.employee.employee.controller;

import com.employee.employee.model.UserEntity;
import com.employee.employee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.Instant;
import java.util.Collection;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Collection<UserEntity> register(final Model model){
        return userRepository.findAll();
    }

    @PostMapping("/register")
    public UserEntity userRegistration(@PathVariable UserEntity userEntity){

        UserEntity userEntity1 = new UserEntity();
        userEntity1.setId(userEntity.getId());
        userEntity1.setEmail(userEntity.getEmail());
        userEntity1.setFirstName(userEntity.getFirstName());
        userEntity1.setLastName(userEntity.getLastName());
        userEntity1.setPassword(userEntity.getPassword());
        userEntity1.setStartValidity(Instant.now());

        return userRepository.save(userEntity1);
    }
}
