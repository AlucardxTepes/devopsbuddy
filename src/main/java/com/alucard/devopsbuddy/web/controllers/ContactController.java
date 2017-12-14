package com.alucard.devopsbuddy.web.controllers;

import com.alucard.devopsbuddy.web.domain.frontend.FeedbackPojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

  /** The application logger */
  private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);

  // The key which identifies the feedback payload in the Model
  private static final String FEEDBACK_MODEL_KEY = "feedback";

  // The Contact Us view name
  private static final String CONTACT_US_VIEW_NAME = "contact/contact";

  @GetMapping("/contact")
  public String contactGet(ModelMap m) {
    FeedbackPojo feedbackPojo = new FeedbackPojo();
    m.addAttribute(FEEDBACK_MODEL_KEY, feedbackPojo);
    return CONTACT_US_VIEW_NAME;
  }

  @PostMapping("/contact")
  public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPojo feedback) {
    LOG.debug("Feedback POJO content: {}", feedback);
    System.out.println("Feedback: " + feedback);
    return CONTACT_US_VIEW_NAME;
  }
}
