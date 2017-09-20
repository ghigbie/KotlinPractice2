fun main(args: Array<String>){

    val printStuff = {message: String -> println(message)}
    printStuff("happy stuff")

    val printThings = {things: String -> println(things)}
    printThings("some things")

    val returnStuff = {stuff: String -> stuff}
    println(returnStuff("Bubba Patty"))

    val sumA = {a: Int, b: Int, c: Int -> a+b+c}
    println(sumA(5, 4, 3))

    val multiplyA = {a: Int, b: Int, c: Int -> a*b*c }
    println(multiplyA(5, 4, 3))

    val divideA = {a: Int, b: Int -> a/b}
    println(divideA(12,3))

    val concatString : (String, String) -> String = {a,b -> "$a $b"}
    println(concatString("The", "dog"))
    val concatStrings : (String, String, String) -> String = {a,b,c -> "$a $b $c"}
    println(concatStrings("The", "dog", "runs"))
    val writeSentence : (String, String, String, String) -> String = {a,b,c,d -> "$a $b $c $d"}
    println(writeSentence("The", "dog", "runs", "away"))

    val sumB : (Int, Int) -> String = {a, b -> (a+b).toString()}
    println(sumB(4, 4))

    val multiplyB : (Int, Int) -> String = {a,b -> (a/b).toString()}
    println(multiplyB(8, 4))


    //make async request

    fun downloadData(url: String, completion: () -> Unit){ //Unit is the same as void in Java
        //sent a download request
        //we got back data
        //there were no network errors
        completion()
    }

    downloadData("fakeUrl.com",{
        println("The code is this block will only run after \"completion function\"")
    })



}