import java.util.Scanner
fun main(){
    var sc= Scanner(System.`in`)
    print("Enter number to find its fibonacci series: ")
    var num = sc.nextInt()
    var num1 = 0
    var num2 = 1
    var sum:Int
    for(i in 1..num){
        print("$num1 ")
        sum = num1 + num2
        num1 =num2
        num2= sum
    }
}