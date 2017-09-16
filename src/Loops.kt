fun main(args: Array<String>){

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Govenor Tarkin", "Kailo Ren" ) //this is an immutable version of the arrray, we can't add t it nor can we change it
    val rebels = arrayListOf("Leia", "Luke", "Han Solo", "Mon Mothma", "Yoda")
    val vehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Reg" to "X-wing", "Bobba Fett" to "Rocket Pack")
    val rebelVehicles = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Reg" to "X-wing")

    for(imp in imperials){
        println("Imperial: $imp")
    }
    println("//////////////////")
    for(rebel in rebels){
        println("Rebel Name: $rebel")
    }

    for((key, value) in vehicles){
        println("$key flies the $value")
    }

    for((key, value) in rebelVehicles){
        println("$key owns a $value")
    }

}