fun main (){
    val fina = Dog("Fina",15,"Saluki")
    dogInfo(fina,fina.dogWeight)
    println("Enter new dogs weight:")
    var newDogWeight = readLine()?.toInt()
    if (newDogWeight != null) {
        dogInfo(fina,newDogWeight)
    }
}
fun dogInfo(fina: Dog,newDogWeight:Int) {
    fina.dogWeight = newDogWeight
    println("Dogs name is ${fina.dogName}. Dogs weight ${fina.dogWeight}kg (~${fina.weightInPnd.toInt()} pnd). Breed is ${fina.dogBreed}.")
}
class Dog (val dogName: String, dogWeight_param: Int, dogBreed_param: String){
    init {
        println ("We get the dog $dogName.")
    }
    val dogBreed = dogBreed_param.toUpperCase()
    val weightInPnd: Double
    get() = dogWeight * 2.2
    var dogWeight = dogWeight_param
    set(value) {
        if (value > 0) field = value
    }
}
open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println("Make some noise")
    }
    open fun eat(){
        println("Lets eat")
    }
    open fun roam(){
        println("We are roaming")
    }
    fun sleep(){
        println("Lets sleeeeeeep")
    }
}
