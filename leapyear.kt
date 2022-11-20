import java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    print("Enter the year: ")
    var year = sc.nextInt()
    if((year%4 == 0 && year%100!=0) || year%400 == 0)
        print("$year is leap year")
    else
        print("$year is not a leap year")
}