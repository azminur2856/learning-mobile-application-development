package com.mobileappdev.myapplication

class Student : Person {
    private var studentId: Int
    private var course: String
    private var semester: Int

    constructor(name: String, email: String, studentId: Int, course: String, semester: Int)
            : super(name, email) {
        this.studentId = studentId
        this.course = course
        this.semester = semester
    }

    constructor() : super() {
        this.studentId = 0
        this.course = ""
        this.semester = 0
    }

    fun getStudentId(): Int {
        return studentId
    }

    fun setStudentId(id: Int) {
        this.studentId = id
    }

    fun getCourse(): String {
        return course
    }

    fun setCourse(course: String) {
        this.course = course
    }

    fun getSemester(): Int {
        return semester
    }

    fun setSemester(semester: Int) {
        this.semester = semester
    }

    override fun displayInfo() {
        println("Name: ${getName()}")
        println("Email: ${getEmail()}")
        println("Student ID: $studentId")
        println("Course: $course")
        println("Semester: $semester")
    }
}
