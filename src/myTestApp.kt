fun main (){
   /* val fina = Dog("Fina",15,"Saluki")
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
    }*/
    /*var animal1 = Animal()
    // animal1.makeNoise()
    var animal2 = Hippo ()
    animal2.eat()
    animal2.roam()*/
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals){
        item.makeNoise()
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}
abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise() /*{
        println("Make some noise")
    }*/
    abstract fun eat() /*{
        println("Lets eat")
    }*/
    override fun roam(){
        println("We are roaming. $image")
    }
    fun sleep(){
        println("Lets sleeeeeeep")
    }
}
class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Arrrghhhhh! Hippo is making noise.")
    }

    override fun eat() {
        println("The Hippo is eating $food. He lives in $habitat")
    }
}
abstract class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}
class Wolf : Canine(){
    override val image: String
        get() = "wolf.jpg"
    override val food: String
        get() = "meat"
    override val habitat: String
        get() = "forest"

    override fun makeNoise() {
        println("Woooooooooo. Wolf is making noise.")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}
 class Vet {
     fun giveShot (animal: Animal){
         //some code
         animal.makeNoise()
     }
 }
interface Roamable {
    fun roam()
}
class Vehicle : Roamable {
    override fun roam() {
        println ("The Vehicle is roaming")
    }
}