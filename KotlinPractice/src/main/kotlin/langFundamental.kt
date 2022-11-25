//From 1 to 100 number, count the number is divisible by and 3 and 5.and print those number.




fun main(args: Array<String>){
    println("Numbers divisible by 3 and 5 are:")
    var count =0
    for (num in 1..100)
    {
        if(num %3 ==0 && num % 5 ==0 ) {
            println("$num is divisible by 3 and 5")
            count++
        }

    }
    println("$count numbers are divisible by 3 and 5 in the range 1 to 100")
}
