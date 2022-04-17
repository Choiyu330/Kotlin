package com.example.kotlin.Kotlin


fun main(array: Array<String>) {

    val cal: Cal = Cal(10, 2)
    cal.plus()
    cal.min()
    cal.mul()
    cal.div()
    println()

    val bkaccount = BankAccount()
    bkaccount.create("최유진", "990330")
    bkaccount.deposit(2000)
    bkaccount.withdraw(400)
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

// 2) 이행 계좌 만들기
//      - 계좌생성 기능 (이름, 생년월일)
//      - 잔고확인 기능
//      - 출금 기능
//      - 예금 기능
class BankAccount {

    var account: Int = 0

    fun create(name: String, birth: String) {
        println("=== 계좌생성완료 ===")
        println("이   름 : $name")
        println("생년월일 : $birth")
        println()
    }

    fun deposit(money: Int) {
        account += money
        println("=== 계좌예금입력 ===")
        println("입금 금액 : $money 원")
        println("현재 잔액 : $account 원")
        println()
    }

    fun withdraw(money: Int) {
        account -= money
        println("=== 걔좌출금입력 ===")
        println("출금 금액 : $money 원")
        println("현재 잔액 : $account 원")
        println()
    }
}

// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기채널은 (S사, M사, K사 총 3개)
