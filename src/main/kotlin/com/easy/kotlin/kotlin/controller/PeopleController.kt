package com.easy.kotlin.kotlin.controller

import com.easy.kotlin.kotlin.service.PeopleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PeopleController {

  @Autowired
  val peopleService: PeopleService?=null

  @GetMapping(value = "/hello")
  fun hello(@RequestParam(value = "lastName") lastName:String): Any {

    val peoples = peopleService?.findByLastName(lastName)
    val map = HashMap<Any, Any>()
    map.put("hello", peoples!!)

    return map
  }
}