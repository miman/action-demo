package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RootController {

  RootController() {
  }

  // Aggregate root

  @GetMapping("/")
  String all() {
    return "Hello World";
  }
  
}
