package com.easy.kotlin.kotlin.learn

fun main(args: Array<String>): Unit {
  returnDemo_4()

  val a = 1

  "" + a
}

fun returnDemo_3() {
  println("START" + ::returnDemo_3.name)

  val intArray = intArrayOf(1, 2, 3, 4, 5)

  intArray.forEach here@ {
    if (it == 3) return@here

    println(it)
  }

  println("END" + ::returnDemo_3.name)
}

fun returnDemo_4() {
  println("START" + ::returnDemo_4.name)

  val intArray = intArrayOf(1, 2, 3, 4, 5)

  intArray.forEach {
    if (it == 3) return@forEach
    println(it)
  }

  println("END" + ::returnDemo_4.name)
}

fun breakDemo_3() {
  println("-------- breakDemo_3 ----------")
  outter@for (outter in 1..5)
    inner@ for (inner in 1..10) {
      println("inner=" + inner)
      println("outer=" + outter)

      if (inner % 2 == 0) {
        break@outter
      }
    }
}