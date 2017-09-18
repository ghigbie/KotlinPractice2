fun main(args: Array<String>){

    var name: String = "Batman"
    //name = null // A vaiable with a value cannot be declared null after not defined as nullable

    var nullableName: String? = "Do I really exist?"

    println(name)
    println(nullableName)

    println("Length: ${name.length}")

    if(nullableName != null){
        println("Length nullable: ${nullableName.length}")
    }
    //println("Length nullable: ${nullableName.length}")

    //Null Check
    var length = 0
    if(nullableName != null){
        length = nullableName.length
    }else{
        length = -1
    }
    println(length)


}