package com.example.kotlin.Kotlin

// 1번 문제
// List 를 2개 만든다
// 첫 번째 List 에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두 번째 List 에는 첫 번째 List 의 값을 하나씩 확인한 후
// 짝수면 True 홀수면 False 를 넣어준다

// 2번 문제
// 학점을 구하기
// 80 - 90 -> A
// 70 - 79 -> B
// 60 - 69 -> C
// 나머지 F

// 3번 문제
// 전달받은 숫자의 각 자리 수의 합 구하기
// 조건 : 전달받은 숫자는 무조건 두 자리 숫자이다

// 4번 문제
// 구구단 출력하기

fun main(args: Array<String>) {

    first()
    second(80)
    third(12, 23)
    fourth()
}


// 1번 문제
fun first() {

    val numberList = mutableListOf<Int>()
    val stringList = mutableListOf<String>()

    for (i in 0 until 10) {
        numberList.add(i)
    }
    println(numberList)

    for (i in 0 until numberList.size) {
        if (numberList.get(i) % 2 == 1)
            stringList.add("False")
        else
            stringList.add("True")
    }
    println(stringList)
}


// 2번문제
fun second(score: Int) {

    if (score <= 90 && score >= 80)
        println("A")
    else if (score <= 79 && score >= 70)
        println("B")
    else if (score <= 69 && score >= 60)
        println("C")
    else
        println("F")
}


// 3번 문제
fun third(num1: Int, num2: Int) {

    println("num1 + num2 : " + (num1 + num2))
}


// 4번 문제
fun fourth() {

    var i = 1
    var j = 1
    for (item in 1..9) {
        i++

        for (item in 1..9) {
            j++
        }
        println(i + " x " + j + " = " + i*j)
    }

}
