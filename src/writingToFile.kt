import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>){

    println("Select Read or Write operation")
    var op:String = readLine()!!
    when(op){

       "write" -> {
           println("Write String")
           writeToFile(readLine()!!)
       }
       "read" -> readFile("random.txt")
    }


}

fun writeToFile(str:String){

    try {
        var writer = FileWriter("random.txt")
        writer.write(str)
        writer.close()
    }catch(ex:Exception)
    {
        println(ex.message)
    }
}

fun readFile(file:String){
    var reader = FileReader(file)
    var ch:Int?
    do {
        ch = reader.read()
        print(ch.toChar())
    }while (ch!=-1)
}