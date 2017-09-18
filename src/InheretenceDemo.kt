fun main(args: Array<String>){

    val tesla = CarType("Tesla", "ModelS", 2, "Midnight Blue")
    tesla.accelerate()
    tesla.stop()
    tesla.park()
    tesla.basicInfo()
    tesla.loadPassengers(4)

}
//using the key word open allows the class to be inherited
open class Vehicle(val make: String, val model: String, val doors: Int){

    fun accelerate(){
        println("vroom vroom")
    }

    fun stop(){
        println("screech!")
    }

    fun park(){
        println("parking the vehicle")
    }

    fun basicInfo(){
        println("This vehicle is a $make $model with $doors doors")
    }
}

class CarType(make: String, model: String, doors: Int, var color: String ) : Vehicle(make, model, doors){
    fun loadPassengers(numberPassengers: Int){
        println("The $make is loading $numberPassengers passengers into the car.")
    }

}