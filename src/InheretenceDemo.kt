fun main(args: Array<String>){

    val tesla = CarType("Tesla", "ModelS", 2, "Midnight Blue")
    tesla.accelerate()
    tesla.stop()
    tesla.park()
    tesla.basicInfo()
    tesla.loadPassengers(4)
    tesla.end()

    val ford = TruckType("Ford", "F-250", 2, 35000)
    ford.accelerate()
    ford.stop()
    ford.park()
    ford.basicInfo()
    ford.towStuff()
    ford.end()
}
//using the key word open allows the class to be inherited
open class Vehicle(val make: String, val model: String, val doors: Int){

    open fun accelerate(){
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

    fun end(){
        println("**************************")
    }
}

class CarType(make: String, model: String, doors: Int, var color: String ) : Vehicle(make, model, doors){
    fun loadPassengers(numberPassengers: Int){
        println("The $make is loading $numberPassengers passengers into the car.")
    }
    override fun accelerate(){
        println("We are going ludicrous mode!")
        super.accelerate()
    }


}

class TruckType(make: String, model:String, doors: Int = 2, var towingCapacity: Int) : Vehicle(make, model, doors){
    fun towStuff(){
        println("The $make is towing a barn because it has a towing capacity of $towingCapacity Lbs.")
    }
}