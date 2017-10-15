package com.easy.kotlin.kotlin.learn

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PackageDemoTest {
  @Test
  fun testWhat() {
    what();
  }

  fun getLength(obj: Any): Int? {
    var result = 0

    if (obj is String) {
      println(obj::class)
      result = obj.length
      println(result)
    }

    println(obj::class)
    return result
  }

  @Test
  fun testGetLenth() {
    val obj = "abcdef"
    val len = getLength(obj)

    Assert.assertTrue(len == 6)

    val obj2: Any = Any()
    getLength(obj2)
  }
}