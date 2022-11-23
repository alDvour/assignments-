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
    println("Before sort,array is")
    for(i in 0..(size-1) ){
        print(" ${arr[i]}")
    }
    var temp=0
    for(i in 0..(size-1)){
        for(j in 0..(size-2)){
            if(arr[j]<arr[j+1]){
                temp=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp

            }
        }
    }
    println()
    println("After sort, array is")
    for(i in 0..(size-1) ){
        print(" ${arr[i]}")
    }
}