
fun main(args:Array<String>){
//    Mutable collections
    val arrayList: ArrayList<String> = ArrayList<String>(2)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("A")
    list.add("B")
    list.add("C")

    arrayList.addAll(list)
    println("......print ArrayList......")
    arrayList.forEachIndexed { index, s ->
        println("index $index and value $s")
    }

    val itr = arrayList.iterator()
    while(itr.hasNext()) {
        println(itr.next())
    }
    println("size of arrayList = "+arrayList.size)
//    =============================== Hash Maps ======================= //
    val hashMap:HashMap<Int,String> = HashMap<Int,String>()
    hashMap.put(1,"Pakistan")
    hashMap.put(3,"Dubai")
    hashMap.put(4,"China")
    hashMap.put(2,"India")

    println(".....traversing hashmap.......")
    for(key in hashMap.keys){
        println("Element at key $key = ${hashMap[key]}")
    }

    hashMap.replace(3,"Ashu")
    hashMap.put(2,"Raj")
    println(".....hashMap.replace(3,\"Ashu\")... hashMap.replace(2,\"Raj\").......")
    for(key in hashMap.keys){
        println("Element at key $key = ${hashMap[key]}")
    }
}