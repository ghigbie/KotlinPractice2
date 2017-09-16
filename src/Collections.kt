fun main(args: Array<String>){

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Govenor Tarkin", "Kailo Ren" ) //this is an immutable version of the arrray, we can't add t it nor can we change it
    println("Sorted:  ${imperials.sorted()} ")
    println("imperials[2]: ${imperials[2]}")
    println("first: ${imperials.first()}")
    println("last: ${imperials.last()}")
    println(imperials)

}