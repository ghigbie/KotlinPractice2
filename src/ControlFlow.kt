fun main(args: Array<String>){
    val a = 2
    val b = 3
    val accountBalance = 100
    val price = 50
    val degrees = 32

    if(a == b){
        println("Yo! A does equal B")
    }

    if (a != b){
        println("Yo mama! A does not equal B")
    }

    if(price <= accountBalance){
        println("You can buy this")
    }else{
        println("Get a job!")
    }

    if(degrees == 70){
        println("This is some nice weather. It's ${degrees} degrees outside.")
    }else if(degrees <= 70 && degrees >= 50){
        println("It's kind of nippy outside. It's ${degrees} degrees outside.")
    }else if(degrees >= 71){
        println("It's hot out there. It's ${degrees} degrees outside")
    }else if(degrees < 49){
        println("It's so cold you're gonna die. It's ${degrees} degrees outside.")
    }else{
        println("The end is near. It's ${degrees} degrees outside")
    }
}