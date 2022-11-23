package arrayTask

import java.util.Scanner
fun main(args:Array<String>){
    var sc=Scanner(System.`in`)
    println("Enter the size of the array")
    var size=sc.nextInt()
    var arr=Array(size,{0})
    //taking user input values
    for(i in 0..(size-1)){
        println("enter value at $i index")
        arr.set(i,sc.nextInt())
    }
    println("Array is")
    for(i in 0..(size-1) ){
        print(" ${arr[i]}")
    }
    var large=-1000
    var seclarge=-1000
    for(i in 0..(size-1)){
        if(arr[i]>large){
            seclarge=large
            large=arr[i]
        }
        else{
            if(arr[i]>seclarge && arr[i]<large){
                seclarge=arr[i]
            }
        }
    }
    println()
    println("The Second largest element in the array is  $seclarge")
}