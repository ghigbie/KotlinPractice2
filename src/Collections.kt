fun main(args: Array<String>){

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Govenor Tarkin", "Kailo Ren" ) //this is an immutable version of the arrray, we can't add t it nor can we change it
    println("Size: ${imperials.size}")
    println("Sorted:  ${imperials.sorted()} ")
    println("imperials[2]: ${imperials[2]}")
    println("first: ${imperials.first()}")
    println("last: ${imperials.last()}")
    println("contains: ${imperials.contains("Emperor")}")
    println(imperials)

    val rebels = arrayListOf("Leia", "Luke", "Han Solo", "Mon Mothma", "Yoda") //This collection type is mutable
    println("Size: ${rebels.size}")
    println("Add: ${rebels.add("Chebaca")} ${rebels}")
    println("Add at specific index: ${rebels.add(0, "Lando")} $rebels")
    println("Where is Luke: ${rebels.indexOf("Luke")}")
    println("Who is at 3: ${rebels.get(3)}")
    println("Han Solo is not there: ${rebels.remove("Han Solo")}")
    println("The rebels now have only: $rebels")

    //the below collection type is immutable
    val rebelVehicles = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Reg" to "X-wing")
    println("The ${rebelVehicles["Solo"]} is a fast ship")
    println("The ${rebelVehicles["Luke"]} is a fast car thing")
    println("The ${rebelVehicles["Reg"]} is a destructive ship")
    println(rebelVehicles.getOrDefault("Leiah", "This ship does not exist"))
    println("The ${rebelVehicles.get("Solo")} is a fast ship")
    println("The ${rebelVehicles.get("Luke")} is a fast land car")
    println(rebelVehicles.getOrDefault("Akbar", "This ship does not exist"))
    println("The keys are ${rebelVehicles.keys}")
    println("The values are ${rebelVehicles.values}")

    //the below collection type is mutable
    val vehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Reg" to "X-wing", "Bobba Fett" to "Rocket Pack")
    vehicles["Luke"] = "X-wing"
    vehicles.put("Leiah", "Tantive IV")
    println("The vehicles are: $vehicles")
    println("The vehicles only are: ${vehicles.values}")
    println("The owners of the vehicles are ${vehicles.keys}")
    vehicles.remove("Bobba Fett")
    println("The owners of the vehicles are all rebels: ${vehicles.keys}.")
    println("It is ${vehicles.isEmpty()} that there are no rebel vehicles.")
    vehicles.clear();
    println("It is ${vehicles.isEmpty()} that there are no rebel vehicles.")


}