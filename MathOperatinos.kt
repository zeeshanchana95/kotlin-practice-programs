fun main() {
    println("Hello, world!!!")

    //Task 1: Perform operations on numbers
    println("Task 1: Perform operations on numbers")
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    println(13530.0 / 1.23)

    //Task 2: Perform math operations on variables
    println("Task 2: Perform math operations on variables")
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86
    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3
    println(totalScore)
    println(averageScore)

    //Task 3: Perform more operations on variables
    println("Perform more operations on variables")
    val boostMultiplier= 4
    val scoreBoost= totalScore * boostMultiplier
    val finalBoostedScore = totalScore+scoreBoost
    println(scoreBoost)
    println(finalBoostedScore)
}