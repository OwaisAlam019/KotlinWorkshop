
/*
Simple for loop
Nested for loop
while loop
do-while loop
* */
fun main(args: Array<String>){
    //simple for loop
    for(item in 1..5)
    {
        println("Hello with value $item")
    }

    //nested for loop
    for (item in 1..3)
    {
        println("outer Loop $item")
        for (item in 1..2)
        {
            println("inner Loop $item")
        }

    }

    //while Loop
    var i = 1

    while (i<5)
    {
        println("while Iteration $i")
        i++
    }

    //do-while loop
     i = 1
    do {
        println("Do-While "+i)
        i++
    }
    while (i<=5)
}