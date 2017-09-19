fun main(args: Array<String>){

    val printMessage = { message: String -> println(message)}
    //lambda expression is always surrounded by curly braces
    //lambda expression is a function literal. it is declaired but passed immdiate;ly as an express
    printMessage("Yo Bubba!")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(45, 44))
    val sumB : (Int, Int) -> Int = {x,y -> x+y}
    println(sumB(3,7))

    val divide = {x: Int, y: Int -> x/y}
    println(divide(9,3))
    val divide2 : (Int, Int) -> Int = {x,y -> x/y}
    println(divide2(45, 5))


}