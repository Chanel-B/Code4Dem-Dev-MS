//package com.EndUser.users.controller;
//
//
//import com.EndUser.users.model.EndUserEntity;
//import com.EndUser.users.repository.EndUserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.time.Instant;
//import java.util.Collection;
//
//@Controller
//public class EndUserController {
//
//    @Autowired
//    private EndUserRepository endUserRepository;
//
//    @GetMapping("/users")
//    public Collection<EndUserEntity> register() {
//        return endUserRepository.findAll();
//    }
//
//    @PostMapping("/register")
//    public EndUserEntity userRegistration(@PathVariable EndUserEntity userEntity) {
//
//        EndUserEntity userEntity1 = new EndUserEntity();
//        userEntity1.setId(userEntity.getId());
//        userEntity1.setEmail(userEntity.getEmail());
//        userEntity1.setFirstName(userEntity.getFirstName());
//        userEntity1.setLastName(userEntity.getLastName());
//        userEntity1.setPassword(userEntity.getPassword());
//        userEntity1.setStartValidity(Instant.now());
//
//        return endUserRepository.save(userEntity1);
//    }
//}
