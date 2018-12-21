package OOP

import kotlin.math.roundToInt

open class bankAccount(val accountNumber:Int,val accountName:String ){
    var balance:Double = 0.0

    fun deposit(amount:Double):Boolean{
        if(amount>0){
            balance += amount
            return true
        }
        else
            return false
    }

    fun withdraw(amount: Double):Boolean{
        if(balance >= amount)
        {
            balance = balance-amount
            return true
        }
        else
            return false
    }

}

class savingAccount(accountNumber: Int,accountName: String,val interesstRate:Float):
        bankAccount(accountNumber,accountName){
    fun depositInterest(){
        val interest = this.balance * interesstRate / 100
        deposit(interest)
    }

}

fun main(args: Array<String>) {
    var ac1 = savingAccount(112233,"OwaisAlam",2.2F)
    ac1.deposit(100.2)
    println("Balance before interest: ${ac1.balance.roundToInt()}")
    ac1.depositInterest()
    println("Balance after interest: ${ac1.balance.roundToInt()}")
    ac1.withdraw(10.00)
    println("Balance after withdraw : ${ac1.balance.roundToInt()}")



}
