package com.axis.service

import com.axis.database.EmployeeStore
import com.axis.modal.Employee

class EmployeeService {

    var employeeUtil = EmployeeStore()
    fun viewAllEmployees(){
        var employees = employeeUtil.data()
        for(employee in employees){
            println("${employee.id} | ${employee.name} | ${employee.salary} | ${employee.department}" )

        }



    }

    fun addNewEmp(employee: Employee):String{
        employeeUtil.data().add(employee)
        return "Successfully added!!!"
    }
}