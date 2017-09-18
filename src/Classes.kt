
class Car constructor(make: String, model: String, color: String){
    val make = make
    val model = model
    val color = color

    fun accelerate(){
        println("vroom vroom")
    }

    fun details(){
        println("This is a $color $make $model")
    }

    fun done(){
        println("/////////////////////")
    }
}

class Truck(val make: String, val model: String, val is4WD: Boolean, val towingCapacity: Int){
    fun accelerate(){
        println("vroom vroom")
    }

    fun tow(){
        println("Taking the horses to the rodeo in a truck")
    }

    fun details(){
        println("This is a $make $model with a towing capacity of $towingCapacity Lbs.")
    }

    fun done(){
        println("/////////////////////")
    }
}

fun main(args: Array<String>){
    val car = Car("Toyota", "Yaris", "Midnight Blue")
    println("The car's make is: ${car.make}")
    println("The car's model is: ${car.model}")
    println("The car's color is ${car.color}")
    car.details()
    car.accelerate()
    car.done()

    val truck = Truck("Ford", "F-150", true, 25000)
    println("The truck's make is: ${truck.make}")
    println("The truck's model is: ${truck.model}")
    println("It is ${truck.is4WD} that the truck has a 4 wheel drive")
    println("The truck's towing capacity is: ${truck.towingCapacity}")
    truck.details()
    truck.tow()
    truck.accelerate()
    truck.done()


}