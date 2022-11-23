package arrayTask

import java.util.Scanner
fun main(args:Array<String>) {
    var sc = Scanner(System.`in`)
    println("Enter the size of the array")
    var size = sc.nextInt()
    var arr = Array(size, { 0 })
    //taking user input values
    for (i in 0..(size - 1)) {
        println("enter value at $i index")
        arr.set(i, sc.nextInt())
    }
    var sum = 0
    println("Array is")
    for (i in 0..(size - 1)) {
        print(" ${arr[i]}")
        sum = sum + arr[i]
    }
    println()
    println("The sum of the array elements is $sum")
}