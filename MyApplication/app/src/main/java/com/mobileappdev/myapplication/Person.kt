package com.mobileappdev.myapplication

abstract class Person {
    private var name: String
    private var email: String

    constructor(name: String, email: String) {
        this.name = name
        this.email = email
    }

    constructor() {
        this.name = ""
        this.email = ""
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
    }

    abstract fun displayInfo()
}
