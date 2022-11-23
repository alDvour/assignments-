
package oops

fun main(args: Array<String>) {

    var student=Student("john", dept = "computer science")
    student.displayStudentInfo()
}


class Student(name:String,dept:String)
{
    var name:String=name
    var dept:String=dept
    var stuInfo:String=""
    init {
        println("init block called")
        stuInfo=name + dept
    }

    fun displayStudentInfo()
    {
        println("name $name")
        println("dept $dept")
        println("stuInfo $stuInfo")
    }

}
