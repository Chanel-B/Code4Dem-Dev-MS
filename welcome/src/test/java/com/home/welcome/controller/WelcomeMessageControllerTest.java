package com.home.welcome.controller;

import com.home.welcome.modelEntity.WelcomeMessage;
import com.home.welcome.repository.WelcomeMessageRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.UUID;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class WelcomeMessageControllerTest {

//    private WelcomeMessageRepository welcomeMessageRepository = Mockito.mock(WelcomeMessageRepository.class);;
    private WelcomeMessageRepository welcomeMessageRepository;
    private WelcomeMessageController welcomeMessageController;

//    @Test
//    void getAllUsers() {
//        WelcomeMessage welcomeMessage = new WelcomeMessage();
//        welcomeMessage.setMessage("Welcome to Code4Dem.");
//        welcomeMessage.setName("Welcome");
//        welcomeMessage.setUuid(UUID.randomUUID());
//
//        when(welcomeMessageRepository.save(welcomeMessage)).thenReturn(any());
//
//        WelcomeMessage welcomeMessageResult  = welcomeMessageController.saveMessage(welcomeMessage);
//
//        Assertions.assertThat(welcomeMessageResult.getMessage()).isEqualTo(welcomeMessage.getMessage());
//
//        verify(welcomeMessageRepository, times(1)).save(welcomeMessage);
//
//    }

//    @Test
//    void saveMessage() {
//        WelcomeMessage welcomeMessage = new WelcomeMessage();
//        welcomeMessage.setMessage("Welcome to Code4Dem.");
//        welcomeMessage.setName("Welcome");
////        welcomeMessage.setUuid(UUID.randomUUID());
//        welcomeMessage.setId(anyLong());
//
//        welcomeMessage = welcomeMessageRepository.save(welcomeMessage);
//
//        WelcomeMessage welcomeMessageResult  = welcomeMessageController.saveMessage(welcomeMessage);
//
//        Assertions.assertThat(welcomeMessageResult.getMessage()).isEqualTo(welcomeMessage.getMessage());
//
////        verify(welcomeMessageRepository, times(1)).save(welcomeMessage);
//    }
}