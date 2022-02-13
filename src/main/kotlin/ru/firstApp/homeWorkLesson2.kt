package ru.firstApp

import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main() {
    /**
     * Урок 2, задание 1
     * Комиссия в ВК:
     */

    val amount = 22345.78
    val minCommission = 35.00
    val sumOfCommission = (amount * 0.75) / 100
    if (amount <= 0) {
        println("transaction is impossible. Sum of transaction less or equal then 0")
    } else if (sumOfCommission <= minCommission) {
        println("Sum of commission equals 35.00 rubles")
    } else {
        println(String.format("Sum of commission equals %.2f", sumOfCommission) + " rubles")
    }

    /**
     * Урок 2, задание 2
     * Леди и Человеки:
     */
    val likes = 52455
    if ((likes === 1) || (likes > 20 && likes % 10 === 1))
        println("Понравилось $likes человеку")
    else if (likes == 0)
        println("Еще нет ни одного сердечка")
    else
        println("Понравилось $likes людям")

    /**
     * Урок 2, задание 3
     * Меломан:
     */

    val isRegularCustomer = false
    val sumOfBuy = 15000
    val freeForRegularCustomer = sumOfBuy * 0.99
    val freeForSecondHall = 100
    val freeForThirdHall = 0.95

    val sumOfBuyWithFree =
        if (isRegularCustomer || sumOfBuy !in 0..1000) {
            if (isRegularCustomer && sumOfBuy in 0..1000)
                "Sum of buy with free is $freeForRegularCustomer"
            else if (!isRegularCustomer && sumOfBuy in 1001..10000)
                sumOfBuy - 100
            else if (isRegularCustomer && sumOfBuy in 1001..10000)
                freeForRegularCustomer - freeForSecondHall
            else if (!isRegularCustomer && sumOfBuy >= 10001)
                sumOfBuy * freeForThirdHall
            else if (isRegularCustomer && sumOfBuy >= 10001)
                sumOfBuy * freeForThirdHall * freeForRegularCustomer
            else "Without Free"
        } else
            "Sum of buy with free is $sumOfBuy"
    println(sumOfBuyWithFree)


}

