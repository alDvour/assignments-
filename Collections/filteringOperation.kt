package Collections

fun main() {

    var num1= mutableListOf<Int>(1,2,3,4,5,6)

    println(num1.drop(3))
    println()
    println(num1.drop(5))
    println()
    println(num1.dropLast(2))
    println()
    println(num1.dropWhile { it<4 })
    println()
    var filteredList = num1.filter { it % 2==0 }
    println("filtered List : $filteredList")
    println("opposite of filter")
    println(num1.filterNot { it % 2 ==0 })

    println(num1.take(2))
    println(num1.takeLast(2))
    println(num1.takeWhile { it <4 })
    println("================")
    println(num1.takeWhile { it > 4 }) // if first element try only,it will return
    println(num1.takeLastWhile { it > 4 })




}