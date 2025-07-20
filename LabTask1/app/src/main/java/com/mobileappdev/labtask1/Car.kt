package com.mobileappdev.myapplication

class Car {
    private var model: String
    private var numberOfWheel: Int
    private var fuelCapacity: Int

    constructor(model: String, numberOfWheel: Int, fuelCapacity: Int){
        this.model = model
        this.numberOfWheel = numberOfWheel
        this.fuelCapacity = fuelCapacity
    }

    constructor() {
        this.model = ""
        this.numberOfWheel = 0
        this.fuelCapacity = 0
    }

    fun getModel(): String {
        return model
    }

    fun setModel(model: String) {
        this.model = model
    }

    fun getWheel(): Int {
        return  numberOfWheel
    }

    fun setWheel(numberOfWheel: Int) {
        this.numberOfWheel = numberOfWheel
    }

    fun getFuelCapacity(): Int {
        return fuelCapacity
    }

    fun setFuelCapacity(fuelCapacity: Int) {
        this.fuelCapacity = fuelCapacity
    }

    fun showDetails() {
        println("Model: ${getModel()}")
        println("Numbers of Wheel: ${getWheel()}")
        println("Fuel Capacity: ${getFuelCapacity()} L")
    }
}
