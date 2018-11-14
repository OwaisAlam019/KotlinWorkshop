
/*
High order function (Higher level function)
function which accepts function as a parameter or returns a function or can do both.
Means, instead of passing Int, String, or other types as a parameter in a function
 we can pass a function as a parameter in other function.
* */


fun myFun(org: String,portal: String, fn: (String,String) -> String) {
    val result = fn(org,portal)
    println(result)
}

fun main(args: Array<String>){

    // Lambdas are code blocks enclosed in curly braces.
    var lambdaFunc:(String,String)->String = {org,portal->
        if (org=="IT Retina")
            "$org develop $portal"
        else
            "Nothing"
    }
    myFun("IT Retina","login",lambdaFunc)
}