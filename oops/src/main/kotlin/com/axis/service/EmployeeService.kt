package com.axis.service

import  com.axis.modal.Employee


class EmployeeService {


    /*
        description: this method is used to display employee details
        param : It takes employee objects are param
        returns : It returns unit
     */
    fun displayEmployeeDetails(employee: Employee)
    {
        println("====employee info======")
        println("id = ${employee.id}")
        println("name = ${employee.name}")
        println("salary =${employee.salary}")
    }

    /*
        to find perday salary
     */
    fun perDaySalary(employee: Employee):Int
    {
        return employee.salary/30
    }

    fun increaseSalaryByTenPercentage(employee: Employee):Double
    {
        var incrementedSalary = employee.salary*0.10
        println("10 % salary is $incrementedSalary")

        return incrementedSalary+employee.salary
    }


}