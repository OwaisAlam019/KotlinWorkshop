package OOP

import kotlin.math.roundToInt

open class bankAccount(val accountNumber:Int,val accountName:String ){
    open var balance:Double = 0.0

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

open class savingAccount(accountNumber: Int,accountName: String,val interesstRate:Float):
        bankAccount(accountNumber,accountName){
    open fun depositInterest(){
        val interest = this.balance * interesstRate / 100
        deposit(interest)
    }

}

class savingPlusAccount(accountNumber: Int,accountName: String):
        savingAccount(accountNumber,accountName,10.00F){

    init {
        balance = 200.00
    }
    override fun depositInterest() {
        val interest = balance*interesstRate/100
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

    println("Overriding deposit Interest")

    var ac2 = savingPlusAccount(223344,"Ali")
    ac2.deposit(100.00)
    println("Balance after deposit ${ac2.balance}")
    ac2.depositInterest()
    println("Balance after depositing interest ${ac2.balance}")



}
