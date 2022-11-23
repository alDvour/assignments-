package oops

fun main(args: Array<String>) {

    var car=Car("2018","red",400000,1200000)
    car.displayCarInfo()
    println(car.checkCarStatus())


}

class Car
{

    var modelNo:String=""
    var color:String=""
    var price:Int=0
    var kilometerDriver=0
    constructor(modelNo:String,color:String,price:Int,kilometerDriver:Int)
    {
        this.modelNo=modelNo
        this.color=color
        this.price=price
        this.kilometerDriver=kilometerDriver
    }

    fun checkCarStatus():String
    {
        if(kilometerDriver<=5000)
            return "car is in new condition"
        else if(kilometerDriver>5000 && kilometerDriver<=20000)
            return "car is in good condition"
        return "car is old"
    }

    fun displayCarInfo()
    {
        println("$modelNo $price $kilometerDriver $color")
    }

}