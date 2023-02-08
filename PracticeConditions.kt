fun main(){

    /*
    val weekday = "Friday"
    println("On $weekday, the opening hours are:")
    if(weekday == "Monday"){
        println("8 AM to 12 PM")
    }
    else if(weekday == "Tuesday"){
        println("8 AM to 6 PM")
    }
    else if(weekday == "Wednesday"){
        println("8 AM to 6 PM")
    }
    else if(weekday == "Thursday"){
        println("8 AM to 6 PM")
    }
    else if(weekday == "Friday"){
        println("8 AM to 9 PM")
    }
    else if(weekday == "Saturday"){
        println("8 AM to 4 PM")
    }
    else{
        println("8 AM to 4 PM")
    }
    */

    /*
    val weekday = "Friday"
    println("On $weekday, the opening hours are:")
    when{
        weekday == "Monday" -> println("8 AM to 12 PM")
        weekday == "Tuesday" -> println("8 AM to 6 PM")
        weekday == "Wednesday" -> println("8 AM to 6 PM")
        weekday == "Thursday" -> println("8 AM to 6 PM")
        weekday == "Friday" -> println("8 AM to 9 PM")
        weekday == "Saturday" -> println("8 AM to 4 PM")
        weekday == "Sunday" -> println("8 AM to 4 PM")
    }
     */

    /*
    val weekday = "Friday"
    println("On $weekday, the opening hours are:")
    when (weekday) {
        "Monday" -> println("8 AM to 12 PM")
        "Tuesday" -> println("8 AM to 6 PM")
        "Wednesday" -> println("8 AM to 6 PM")
        "Thursday" -> println("8 AM to 6 PM")
        "Friday" -> println("8 AM to 9 PM")
        "Saturday" -> println("8 AM to 4 PM")
        "Sunday" -> println("8 AM to 4 PM")
    }
    */

    val weekday = "Friday"
    println("On $weekday, the opening hours are:")
    val hour = 20
    val isOpen = when(weekday){
        "Monday" -> hour in 8..12
        "Tuesday" -> hour in 8..18
        "Wednesday" -> hour in 8..18
        "Thursday" -> hour in 8..18
        "Friday" -> hour in 8..21
        "Saturday" -> hour in 8..16
        "Sunday" -> hour in 8..16
        else -> {}
    }
}
