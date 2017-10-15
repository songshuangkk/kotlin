package com.easy.kotlin.kotlin.learn

fun main(args: Array<String>):Unit {
  println(max(1, 2))
  case(1L)
  forIndexWithValueTest(arrayOf(1, 2, 3))
}

fun max(a: Int, b: Int): Int {
  return if (a > b) b else a
}

fun case(obj: Any) {
   when (obj) {
    1 -> println("第一项")
    "hello" -> println("这是一个字符串hello")
    is Long -> println("这是一个Long类型数据")
    !is String -> println("这不是一个String类型的数据")
    else -> println("else 类型于Java中的default")
  }
}

fun forTest(collection: Array<Int>) {
  for (item in collection) {
    println(item)
  }
}

fun forIndexTest(collection: Array<Int>) {
  for (index in collection.indices) {
    println(collection[index])
  }
}

fun forIndexWithValueTest(collection: Array<Int>) {
  for ((index, value) in collection.withIndex()) {
    print("index is $index value is $value").apply { println() }
  }
}