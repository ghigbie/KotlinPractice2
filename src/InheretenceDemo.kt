fun main(args: Array<String>){

}
//using the key word open allows the class to be inherited
open class Vehicle(val make: String, val model: String, val doors: Int){

    fun accelerate(){
        println("vroom vroom")
    }

    fun stop(){
        println("screech!")
    }

    fun basicInfo(){
        println("This vehicle is a $make $model with $doors doors")
    }
}

class Car : Vehicle