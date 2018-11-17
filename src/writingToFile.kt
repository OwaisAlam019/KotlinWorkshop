import java.io.FileWriter

fun main(args:Array<String>){

    println("Enter string to write in file")
    writeToFile(readLine()!!)

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