import java.util.Scanner
fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the number to be reversed: ")
    var num = sc.nextInt()
    var reverse = 0
    var remainder: Int
    while( num != 0){
        remainder = num % 10
        reverse = reverse*10 + remainder
        num/= 10
    }

    println("Reversed number is $reverse")
}