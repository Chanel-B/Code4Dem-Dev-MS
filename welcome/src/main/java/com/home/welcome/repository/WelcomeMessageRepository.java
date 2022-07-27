package com.home.welcome.repository;

import com.home.welcome.modelEntity.WelcomeMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface WelcomeMessageRepository extends JpaRepository<WelcomeMessage, Long> {
}
