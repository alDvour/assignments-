package  oops

import java.util.Scanner

fun main(){
    var sc=Scanner(System.`in`)
    print("1.ADD\n 2.Subtract\n 3.Multilpication\n 4.Division\n")
    println("Enter Choice: ")
    var ch=sc.nextInt()

    println("Enter num1: ")
    var num1=sc.nextInt()
    println("Enter numb2: ")
    var num2=sc.nextInt()





    var calc =Calculation(num1,num2)
    when(ch){
        1-> println(calc.add())
        2-> println(calc.sub())
        3-> println(calc.mul())
        4-> println(calc.div())
        else->
            println("Wrong Choice!!!")
    }



}


class Calculation(var num1: Int, var num2: Int){

    fun add():Int{
        println("The sum of the numbers is ")
        return num1+num2
    }
    fun sub():Int{
        println("The subtraction of the numbers is ")
        return num1-num2
    }
    fun mul():Int{
        println("The multiplicaton of the numbers is ")
        return num1*num2
    }
    fun div():Int{
        println("The division of the numbers is ")
        return num1/num2
    }

}