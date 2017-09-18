
class Car constructor(make: String, model: String){
    val make = make
    val model = model
}

class Truck(val make: String, val model: String, val is4WD: Boolean)

fun main(args: Array<String>){
    val car = Car("Toyota", "Yaris")
    println("The car's make is: ${car.make}")
    println("The car's model is: ${car.model}")

    val truck = Truck("Ford", "F-150", true)
    println("The truck's make is: ${truck.make}")
    println("The truck's model is: ${truck.model}")
    println("It is ${truck.is4WD} that the truck has a 4 wheel drive")

}