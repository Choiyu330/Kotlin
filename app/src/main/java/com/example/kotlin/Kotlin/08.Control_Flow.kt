package com.example.kotlin.Kotlin

// 08. 제어흐름
// - if, else, else if

fun main(args: Array<String>) {
    val a: Int = 5;
    val b: Int = 10;

    // if / else 사용방법 (1)
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }

    // if / else 사용방법 (2)
    if (a > b) {
        println("a가 b보다 크다")
    }

    // if / else / else if 사용방법 (3)
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else if (a == b) {
        println("a가 b보다 같다")
    } else {

    }

    // 값을 리턴하는 if 사용방법
    val max = if (a > b) {
        a       // 5
    } else {
        b       // 10
    }

    // 위를 줄이면 이렇게 된다
    val max1 = if (a > b) a else b

    println()
    println(max)
    println(max1)

}
