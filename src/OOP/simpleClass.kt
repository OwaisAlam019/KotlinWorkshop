package OOP

class employee{
    var name:String = ""
    var age :Int = 0
    var salary:Int = 0

    fun attendance(name:String){
        println("Attendance marked for $name")
    }

    fun applyForLeave(){
        //leave applied
    }
}

fun main(args:Array<String>){
    var emp = employee()
    emp.name = "Owais"
    println(emp.name)
    emp.attendance(emp.name)
}