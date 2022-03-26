package com.example.kotlin.Kotlin

// 16. Iterable

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법 (1)
    for (item in a) {
        if (item == 5) {
            println("Item is Five")
        } else {
            println("Item is Not Five")
        }
    }
    println()

    // 반복하는 방법 (2)
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나 = 문자열
    }
    println()

    // 반복하는 방법 (3)
    a.forEach {
        println(it)
    }
    println()

    // 반복하는 방법 (4)
    // it 대신 item 으로 변수를 바꿔서 사용하고 싶을 때
    a.forEach { item ->
        println(item)
    }
    println()

    // 반복하는 방법 (5)
    // (2)번과 동일한 기능
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }
    println()

    // 반복하는 방법 (6)
    // 인덱스만 순회하는 for 문
    println(a.size)
    println()

    for (i in 0 until a.size) {
        // until 은 마지막을 포함하지 않는다
        // 0부터 8까지 출력된다
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (7)
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (8)
    for (i in a.size - 1 downTo (0)) {
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (9)
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (10)
    // ..은 마지막을 포함한다
    for (i in 0..a.size) {
        println(i)
    }
}
