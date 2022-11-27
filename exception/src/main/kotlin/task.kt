import java.util.InputMismatchException
import java.util.Scanner
fun main(){
    val scanner=Scanner(System.`in`)
    println("enter number1: ")
    var num1:Int=scanner.nextInt()
    println("enter number2: ")
    var num2:Int=scanner.nextInt()
    try{
        println(num1/num2)
    }
    catch(e:ArithmeticException){
        println("zero divison exception")
    }
    catch(e:InputMismatchException){
        println("only enter the numbers")
    }
}