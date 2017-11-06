package com.easy.kotlin.kotlin.learn

fun main(args: Array<String>) {
  val array = arrayOf(1, 2, 3)

  array.iterator().forEach {
    println("number is ${it}")
  }

  val multiArray = arrayOf(1, "2", "3")

  multiArray.iterator().forEach { println("number is ${it}") }

  arrayOfNulls<Int>(10);
}