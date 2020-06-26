package com.example.jwt.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlexController {

  @RequestMapping("/jwt")
  public String display() {
    return "welcome to jwt";
  }
}
