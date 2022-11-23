package oops

import java.awt.Color
fun main(args: Array<String>) {
    var emp:Employee=Employee(135,"Mao",40000,26)
    emp.displayInfo()
    var perday=emp.calculatePerDaySalary()
    println("Per day salary = $perday")
    var total=emp.totalSalary()
    println("Total salary $total")
}

class Employee(var id: Int, var name: String, var salary: Int, noOfDaysPresent: Int) {

    var noOfDaysPresent: Int = noOfDaysPresent

    fun displayInfo() {
        println("$id $name $salary $noOfDaysPresent")
    }

    fun calculatePerDaySalary(): Int {
        return (salary / 30)
    }

    fun totalSalary(): Int {
        var sal = calculatePerDaySalary()
        return (noOfDaysPresent * sal)

    }
}