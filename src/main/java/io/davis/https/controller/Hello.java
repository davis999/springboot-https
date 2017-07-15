package io.davis.https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Davis on 17/7/15.
 */
@RestController
public class Hello {

  @GetMapping("/")
  public String sayHello() {
    return "hello world";
  }
}
