package com.mobileappdev.labtask1

import com.mobileappdev.myapplication.Car
import com.mobileappdev.myapplication.Student

fun largest()
{
    print("Enter 3 numbers by space: ")

    val input = readln().split(" ")

    val num1 = input[0].toInt()
    val num2 = input[1].toInt()
    val num3 = input[2].toInt()

    val largest = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    println("The largest number is: $largest")
}

fun findMin() {
    val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var min = arr[0]

    for (num in arr) {
        if (num < min) {
            min = num
        }
    }

    println("Minimum value is: $min")
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}

fun main()
{
    largest()
    findMin()
    print("Enter a year: ")
    val year = readln().toInt()

    if (isLeapYear(year)) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }


    val stu1 = Student(1, "AZMINUR RAHMAN", 3.89)
    stu1.showDetails()

    val car1 = Car()
    car1.setModel("Honda Civic")
    car1.setWheel(4)
    car1.setFuelCapacity(50)
    car1.showDetails()
}