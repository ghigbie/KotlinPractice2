fun main(args: Array<String>){

    var name: String = "Batman"
    //name = null // A vaiable with a value cannot be declared null after not defined as nullable

    var nullableName: String? = "Do I really exist?"

    println(name)
    println(nullableName)

    println("Length: ${name.length}")
    println("Length nullable: ${nullableName.length}")



}