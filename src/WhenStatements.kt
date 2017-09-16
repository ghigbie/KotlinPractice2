fun main(args: Array<String>){
    val x = 10

    when (x) {
        1 -> println("x = 1")
        2 -> println("x = 2")
        3 -> println("x = 3")
        4 -> println("x = 4")
        5 -> println("x = 5")
        else -> println("x is not in range")
    }

    fun jediIsFeeling(jedi: String = "vader", mood: String = "angry"){
        when (mood){
            "angry" -> println("${jedi} is feeling ${mood}, so he chokes the person nearby.")
            "happy" -> println("${jedi} is feeling ${mood}, so he dances for a bit.")
            "hungry" -> println("${jedi} is feeling ${mood}, so he eats a hamburger.")
            else -> println("${jedi} just sits there because he is feeling ${mood}.")
        }
    }

    jediIsFeeling("Vader", "happy")
    jediIsFeeling("Obiwon", "hungry")
}