package com.alucard.devopsbuddy.backend.service;

import com.alucard.devopsbuddy.web.domain.frontend.FeedbackPojo;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

  /**
   * Sends an email with the content in the Feedback Pojo.
   */
  void sendFeedbackEmail(FeedbackPojo feedbackPojo);

  /**
   * Sends an email with the content of the simple Mail Message object.
   * @param message Object containing the email content
   */
  void sendGenericEmailMessage(SimpleMailMessage message);
}
