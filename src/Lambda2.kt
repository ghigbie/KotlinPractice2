fun main(args: Array<String>){

    val printStuff = {message: String -> println(message)}
    printStuff("happy stuff")

    val printThings = {things: String -> println(things)}
    printThings("some things")

    val returnStuff = {stuff: String -> stuff}
    println(returnStuff("Bubba Patty"))

}