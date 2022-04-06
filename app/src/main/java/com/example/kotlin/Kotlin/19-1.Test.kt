package com.example.kotlin.Kotlin


// 2) 이행 계좌 만들기
//      - 계좌생성 기능 (이름, 생년월일)
//      - 잔고확인 기능
//      - 출금 기능
//      - 예금 기능

// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기채널은 (S사, M사, K사 총 3개)

fun main(array: Array<String>) {

    val cal: Cal = Cal(10, 2)
    cal.plus()
    cal.min()
    cal.mul()
    cal.div()
}

// 1) 사칙 연산을 수행할 수 있는 클래스 ( +, -, *, / )
class Cal(var num1: Int, var num2: Int) {

    fun plus() {
        var result: Int = num1 + num2
        println("$num1 + $num2 = $result")
    }

    fun min() {
        var result: Int = num1 - num2
        println("$num1 - $num2 = $result")
    }

    fun mul() {
        var result: Int = num1 * num2
        println("$num1 * $num2 = $result")
    }

    fun div() {
        var result: Int = num1 / num2
        println("$num1 / $num2 = $result")
    }
}

