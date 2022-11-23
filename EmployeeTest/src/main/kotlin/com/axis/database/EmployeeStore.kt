package com.axis.database

import com.axis.modal.Employee

class EmployeeStore {

    var employees = mutableListOf<Employee>()
    init {
        employees.add(Employee(1,"mao",45000,"IT"))
        employees.add(Employee(1,"souchan",45000,"HR"))
        employees.add(Employee(1,"divya",45000,""))
    }

    fun data(): MutableList<Employee>{
    return employees
    }
}

