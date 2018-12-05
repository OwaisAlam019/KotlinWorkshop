package OOP
/*inner classes are nested classes marked inner
 * it can access outer class properties
  * */

class clothes {
    var brand:String = "Levis"

    inner class winterClothes{
        var type:String = "Hoodie"
        var size:String = "Small"
        fun showDetails(){

            println("Brand $brand")
            println("Type $type")
            println("size $size")
        }
    }
}


fun main(args: Array<String>) {

    var shopeItem = clothes().winterClothes()
    shopeItem.showDetails();

}