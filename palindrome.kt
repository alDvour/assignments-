import java.util.Scanner
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("Enter the number: ")
    var num = sc.nextInt()
    var x : Int
    x = num
    var temp = 0
    val y=0
    while(num != 0){
        x = num % 10
        num /=10
        temp = (temp  * 10) + x

    }
    if(temp==y)
        println("Number is palindrome")
    else
        println("Number is not palindrome")
}