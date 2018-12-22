package OOP

interface IbankAccount {
    fun deposit(){

    }
    fun withdraw(amount:Double)
    fun depositInterest()
}

interface IBFT{
    fun interbankTrnsfer()
    fun outboundTransfer()
}

class budgetSavingAccount:IbankAccount,IBFT{
     override fun deposit() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun withdraw(amount: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun depositInterest() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun interbankTrnsfer() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun outboundTransfer() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}