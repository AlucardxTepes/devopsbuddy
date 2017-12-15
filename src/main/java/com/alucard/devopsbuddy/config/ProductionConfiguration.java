package com.alucard.devopsbuddy.config;

import com.alucard.devopsbuddy.backend.service.EmailService;
import com.alucard.devopsbuddy.backend.service.SmtpEmailService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("file://${user.home}/.devopsbuddy/application-prod.properties")
public class ProductionConfiguration {

  @Bean
  public EmailService emailService() {
    return new SmtpEmailService();
  }
}
