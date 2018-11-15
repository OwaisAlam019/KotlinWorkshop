
/*
* Kotlin ArrayList class is used to create a dynamic array.
 * Which means the size of ArrayList class can be increased
 * or decreased according to requirement.
 * ArrayList class provides both read and write functionalities.*/



fun main(args:Array<String>){

    val arrayList1 = ArrayList<String>()//Creating an empty arraylist

    arrayList1.add("Ali")//Adding object in arraylist
    arrayList1.add("Raheel")
    arrayList1.add("Anas")

    println(".......print ArrayList.......")

    for (i in arrayList1) {
        println(i)
    }

//    with iitial capacity
    println("size of arrayList1 = "+arrayList1.size)
    val arrayList2 = ArrayList<Int>(5)
    arrayList2.add(14)
    arrayList2.add(20)
    arrayList2.add(80)
    println("......print ArrayList2......")
    for (i in arrayList2) {
        println(i)
    }
    println("size of arrayList2 = "+arrayList2.size)


//    gettig and setting values in arrayList

    println("value at 0"+ arrayList1.get(0))
    println("value at 0"+ arrayList1.set(0,"Rayan"))
    println("=============Updated Array===========")
    for (i in arrayList1) {
        println(i)
    }

    //search
    if(arrayList1.contains("Rayan"))
        println("Result found")
    else
        println("Not Found")
    


}