package com.example.kotlin.Kotlin

fun main(args: Array<String>) {

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is NULL")
    } else {
        println("a is not NULL")
    }

    if (b + c == 110) {
        println("b + c = 110")
    } else {
        println("b + c != 110")
    }

    // - 엘비스 연산자
    // var number2 에 number 가 들어갈건데
    // 만약에 number 가 null 인 경우 10이 들어간다
    val number: Int? = null
    var number2 = number ?: 10

    println()
    println(number2)

    val num1: Int = 10
    val num2: Int = 20

    val max = if (num1 > num2) {
        num1
    } else if (num1 == num2) {
        num2
    } else {
        100
    }

    println()
    println(max)

}
