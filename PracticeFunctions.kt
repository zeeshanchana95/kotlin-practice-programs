//Add your function below this line
fun getPoints(basePoints: Int, boost: Int):Int {
    return basePoints*boost
}

fun main() {
    var score = 0;
    println(score)
    score += getPoints(10, 1)
    println(score)

    score += getPoints(20, 2)
    println(score)

    score += getPoints(-10, 1)
    println(score)

    score += getPoints(5, 3)
    println(score)
    score += getPoints(-15, 2)
}