package com.axis.app

import com.axis.modal.Employee
import com.axis.service.EmployeeService

fun main(){

    var employeeService = EmployeeService()


    var employee = Employee(5,"prash", 50000,"Technical")
    employeeService.addNewEmp(employee)
    employeeService.viewAllEmployees()
}