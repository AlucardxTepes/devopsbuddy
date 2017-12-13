package com.alucard.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {

  @Bean
  public ReloadableResourceBundleMessageSource messageSource() { // name must be messageSource
    ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
    resourceBundleMessageSource.setBasename("classpath:i18n/messages"); // messages.properties file under the resources folder
    // Checks for new messages every 30 minutes
    resourceBundleMessageSource.setCacheSeconds(1800);
    return resourceBundleMessageSource;
  }

}
