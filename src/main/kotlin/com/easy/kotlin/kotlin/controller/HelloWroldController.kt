package com.easy.kotlin.kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWroldController {

  @GetMapping(value = *arrayOf("/helloworld", "/"))
  fun helloworld(): Any {
    return "Hello, World!"
  }
}