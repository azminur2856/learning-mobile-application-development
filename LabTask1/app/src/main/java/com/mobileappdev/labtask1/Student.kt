package com.mobileappdev.myapplication

class Student {
    private var id: Int
    private var name: String
    private var cgpa: Double

    constructor(id: Int, name: String, cgpa: Double){
        this.id = id
        this.name = name
        this.cgpa = cgpa
    }

    constructor() {
        this.id = 0
        this.name = ""
        this.cgpa = 0.0
    }

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getName():  String {
        return  name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getCgpa(): Double {
        return cgpa
    }

    fun setCgpa(cgpa: Double) {
        this.cgpa = cgpa
    }

    fun showDetails() {
        println("Name: ${getName()}")
        println("ID: ${getId()}")
        println("CGPA: ${getCgpa()}")
    }
}
