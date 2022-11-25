import java.util.Scanner

class Account(amount: Int,accNo: Int, balance:Int= 1000, accType: String){
    var amount: Int = amount
    var aacNo:Int = accNo
    var balance: Int = balance
    var accType: String = accType

    fun withdraw(){
        var bal =balance - amount
        print("Balance after withdrawing $amount is $bal")

    }
    fun deposit(){
        var bal = balance - amount
        print("Balance after deposit of  $amount is $bal")
    }
    fun calRateOfInterest(){
        if(accType == "savings") {
            var bal = balance * 0.06
            print("Rate of Interest in $bal")
        }
        else if(accType == "current"){
            var bal = balance * 0.10
            print("Rate of Interest in $bal")
        }
    }
    fun getbalance(){
        if(accType=="savings"){
            var intrst=balance*0.06
            var totalbalance=intrst+balance
            println("Total balance=$totalbalance")
        }
        else{
            var intrst=balance*0.1
            var totalbalance=intrst+balance
            println("Total balance=$totalbalance")
        }
    }

}
fun main(){
    var sc = Scanner(System.`in`)

    println("Enter the account number: ")
    var accNo = sc.nextInt()
    println("Enter the balance : ")
    var balance = sc.nextInt()
    println("Enter the account type: ")
    var accType:String = sc.next()
    println("Enter the amount : ")
    var amount = sc.nextInt()
    var acc = Account(amount,accNo,balance,accType)

    println("Enter your choice\n 1.withdraw\n 2.Deposit\n 3.Calculate the rate of interest\n 4.Get balance")
    var choice = sc.nextInt()
    when (choice){
        1 -> acc.withdraw()
        2 -> acc.deposit()
        3 -> acc.calRateOfInterest()
        4 -> acc.getbalance()
    }


}
