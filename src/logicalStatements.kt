
fun main(args: Array<String>){
    // Traditional usage
    var a = 10
    var b = 20
    var maximum = a
    if (a < b) maximum = b
    println("traditional usage Maximum is $maximum")

    // With else
        var maximum2: Int
        if (a > b) {
            maximum2 = a
        } else {
            maximum2 = b
        }
    println(" With else Maximum is $maximum2")
    // As expression
        val maximumExpression = if (a > b) a else b
    println("As expression Maximum is $maximumExpression")

}