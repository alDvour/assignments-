//Create a lamda function which takes int as parameter and return string as a output.
//Eg:-
//Age as input,
//<18
//Non –adult
//>=18  and <=55
//Adult
//>55
//Senior citizen
import java.util.Scanner


fun main (args: Array<String>) {
    var sc = Scanner(System.`in`)
    println("Enter the age")
    var age = sc.nextInt()
    var result:String = mylamda(age)
    println("$result")
}
fun mylamda(age: Int):String{
    if (age < 18)
        return "Non adult"
    else if (age >= 18 && age <= 55)
        return "Adult "
    else
        return "Senior"
}
