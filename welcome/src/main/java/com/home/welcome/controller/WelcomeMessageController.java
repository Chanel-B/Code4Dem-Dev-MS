package com.home.welcome.controller;

import com.home.welcome.modelEntity.WelcomeMessage;
import com.home.welcome.repository.WelcomeMessageRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@NoArgsConstructor
@RequestMapping("/welcome")
public class WelcomeMessageController {

    @Autowired
    private WelcomeMessageRepository welcomeMessageRepository;

    @GetMapping
    public List<WelcomeMessage> getAllUsers(){
        return welcomeMessageRepository.findAll();
    }

    @PostMapping("")
    public WelcomeMessage saveMessage(@RequestBody WelcomeMessage welcomeMessageIn){

        WelcomeMessage welcomeMessage = new WelcomeMessage();
        welcomeMessage.setMessage(welcomeMessageIn.getMessage());
//        welcomeMessage.setUuid(UUID.randomUUID());

        return welcomeMessage;
    }

}
