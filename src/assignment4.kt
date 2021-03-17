import java.util.*

fun main() {
    string("to","comes","is","are")
    country()
    weight()
    var name=car("keyboard","mouse","microphone")
    println(name)
}




fun string(where:String, how:String,what:String,why:String){
    var String= arrayOf(where,how,what,why)
    println(Arrays.toString(String))
}
fun country() {
    var citiesArray = arrayOf("harare","mumbai","dodoma","jakarta")
    println(citiesArray[0].capitalize()+","+citiesArray[1].capitalize()+","+citiesArray[2].capitalize()+","+citiesArray[3])

}
fun weight(){
    var weightArrays= arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var total=weightArrays[2]+weightArrays[5]
    println(total)
    var index= weightArrays.indexOf(158)
    println(index)
    var int=(weightArrays.sortedArray())
    for (numbers in int) {
        println(numbers)

    }}

fun car(name1:String,name2:String,name3:String):String{
    var String=arrayOf(name1,name2,name3)
    return (Arrays.toString(String))
}




