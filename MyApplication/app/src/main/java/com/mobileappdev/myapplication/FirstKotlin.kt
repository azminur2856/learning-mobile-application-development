package com.mobileappdev.myapplication

fun add(num1: Int, num2: Int, num3: Int )
{
    println("Summation: "+(num1+num2+num3))
}

fun calculateLetterGrade(marks: Double): String {
    if (marks >= 90) {
        return "A+"
    } else if (marks >= 85) {
        return "A"
    } else if (marks >= 80) {
        return "B+"
    } else if (marks >= 75) {
        return "B"
    } else if (marks >= 70) {
        return "C+"
    } else if (marks >= 65) {
        return "C"
    } else if (marks >= 60) {
        return "D+"
    } else if (marks >= 50) {
        return "D"
    } else {
        return "F"
    }
}


fun main()
{
    add(10,20,30)

    val gradesArray = arrayOf("A+", "A", "B+", "B", "C+", "C", "D+", "D", "F")

    println("Printing from Array:")
    for (grade in gradesArray) {
        println(grade)
    }

    println("Size of grades Array: "+ gradesArray.size)

    val gradesList = mutableListOf("A+", "A", "B+", "B", "C+", "C", "D+", "D")

    println("Size of grades List: "+ gradesList.size)

    gradesList.add("F")

    println("Size of grades List after add F: "+ gradesList.size)

    println("Grade calculation:")
    println("Grade for mark 90 is: "+ calculateLetterGrade(90.0))
    println("Grade for mark 89.9 is: "+ calculateLetterGrade(89.9))
    println("Grade for mark 49 is: "+ calculateLetterGrade(49.0))

    val name = "Azminur"
    println("Name: $name")

    // name = "Rahman" // Error: Val cannot be reassigned

    var age = 20
    println("Age: $age")

    age = 21 // This is allowed
    println("New Age: $age")


    val stu1 = Student("Azminur Rahman", "azminur@gmail.com", 101, "CSE", 6)
    stu1.displayInfo()

    println("--------")

    val stu2 = Student()
    stu2.setName("ASHANUR RAHMAN")
    stu2.setEmail("ashanur@gmail.com")
    stu2.setStudentId(202)
    stu2.setCourse("WPE")
    stu2.setSemester(3)
    stu2.displayInfo()
}