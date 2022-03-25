package com.example.kotlin.Kotlin

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)
    println(a)

    a.add(0, 100)
    println(a)

    a.set(0, 200)
    println(a)

    a.removeAt(0)
    println(a)

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    println()
    // Set 은 인덱스가 없다
    b.add(2)
    println(b)

    b.remove(2)
    println(b)

    // 없는 값을 지워도 오류가 발생하지 않는다
    b.remove(100)
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)
    println()
    c.put("two", 2)
    println(c)

    // value 값 변경
    c.replace("two", 3)
    println(c)

    // keys, values 값만 각각 보기
    println(c.keys)
    println(c.values)

    // Map 의 모든 값 삭제
    c.clear()
    println(c)
}
