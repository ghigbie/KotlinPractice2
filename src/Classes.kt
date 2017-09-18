
class Car constructor(make: String, model: String){
    val make = make
    val model = model

    fun accelerate(){
        println("vroom vroom")
    }

    fun done(){
        println("/////////////////////")
    }
}

class Truck(val make: String, val model: String, val is4WD: Boolean, val towingCapacity: Int){
    fun accelerate(){
        println("vroom vroom")
    }

    fun done(){
        println("/////////////////////")
    }
}

fun main(args: Array<String>){
    val car = Car("Toyota", "Yaris")
    println("The car's make is: ${car.make}")
    println("The car's model is: ${car.model}")
    car.accelerate()
    car.done()

    val truck = Truck("Ford", "F-150", true, 2500)
    println("The truck's make is: ${truck.make}")
    println("The truck's model is: ${truck.model}")
    println("It is ${truck.is4WD} that the truck has a 4 wheel drive")
    println("The truck's towing capacity is: ${truck.towingCapacity}")
    truck.accelerate()
    truck.done()


}