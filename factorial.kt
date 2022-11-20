import java.util.Scanner
fun main(){
    var sc= Scanner(System.`in`)
    print("Enter the number to find its factorial: ")
    var num = sc.nextInt()
    var fact = 1
    for(i in 1..num)
        fact = fact*i
    println("Factorial of $num is $fact")


}