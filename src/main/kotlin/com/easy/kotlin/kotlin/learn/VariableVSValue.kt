package com.easy.kotlin.kotlin.learn

class VariableVSValue {
  fun declareVar() {
    var a = 1
    a = 2
    println("num a = $a")
    println(a::class)
    println(a::class.java)

    var x = 5
    x += 1
  }

  fun declareVal() {
    val b = "a"
    // b = "b" val cannot be reassigned
    println(b)

    println(b::class)

    println(b::class.java)

    val c: Int = 1
    val d = 2
    val e: Int
    e = 3

    println("c = $c, d = $d, e = $e")

    println(b is String)
  }
}

fun main(args: Array<String>) {
  val variableVSValue = VariableVSValue()
  variableVSValue?.declareVal()
  variableVSValue?.declareVar()

  val rawString = """fun helloWorld(val name:String) {println("Hello, World!"")}"""
}