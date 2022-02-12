package ru.firstApp

fun main() {

    val amount = (500) * 100
    if (amount <= 0) {
        println("transaction is impossible. Sum less then 0")
    } else {
        println("Sum of transaction equals ${(amount * 0.75 / 100) * 100 + 3500} pennies")
    }


}