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

    //nullableName = null
    //Null Check
    var length = 0
    if(nullableName != null){
        length = nullableName.length
    }else{
        length = -1
    }
    println(length)

    //Concise method for null check
    val l = if (nullableName !=null) nullableName.length else -1

    //Second method for null check
    println(nullableName?.length)

    //Third method is Elvis Operator
    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me"

    println(noName)

    //!! operator, no seriously that's what it's called
    //The !! operator should only be used when you know the variable has a value
    println(nullableName!!.length)  //this will crash the app if the variable is null



}