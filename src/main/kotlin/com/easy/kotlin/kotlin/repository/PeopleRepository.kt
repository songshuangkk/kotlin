package com.easy.kotlin.kotlin.repository

import com.easy.kotlin.kotlin.entity.People
import org.springframework.data.repository.CrudRepository

interface PeopleRepository: CrudRepository<People, Long> {
  fun findByLastName(lastName: String): List<People>?
}