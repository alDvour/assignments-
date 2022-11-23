package Collections

class Employee(Emp_id:Int,Emp_name:String,Emp_dept:String,Emp_age:Int,Emp_salary:Double)
{
    var id:Int=Emp_id
    var name:String=Emp_name
    var dept:String=Emp_dept
    var age:Int=Emp_age
    var salary:Double=Emp_salary

}
fun main() {
    var Employeeinfo= mutableListOf<Employee>()
    Employeeinfo.add (Employee(101,"Mao","IT",24,85000.00))
    Employeeinfo.add(Employee(102,"Ravi","HR",28,45000.00))
    Employeeinfo.add(Employee(103,"Prash","PR",30,20000.00))
    Employeeinfo.add(Employee(104,"sou","IT",24,32000.00))
    Employeeinfo.add(Employee(105,"Divya","Accounts",33,54000.00))

    for (Employee in Employeeinfo)
        println("Employee Id: ${Employee.id} \nEmployee Name:${Employee.name} \nEmployee Dept: ${Employee.dept}  Employee Age:${Employee.age} Employee Salary:${Employee.salary}")


}