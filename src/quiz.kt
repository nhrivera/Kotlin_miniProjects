fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Quiz Questions
    println("What is 75 / 5?")
    var studentAnswer1 = Integer.valueOf(readLine())

    println("What is the value of y for 6 * 2y = 36?")
    var studentAnswer2 = Integer.valueOf(readLine())

    println("The _________ triangle has 2 equal sides.")
    var studentAnswer3 = readLine()

    println("8 * 6 - (3 - 2) = __")
    var studentAnswer4 = Integer.valueOf(readLine())

    // Grading Quiz
    var points = 0

    //Question 1
    if (studentAnswer1 == quizAnswer1) {
        points += 25
    }

    // Question 2
    if (studentAnswer2 == quizAnswer2) {
        points += 25
    } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
        points += 20
        println("The answer $studentAnswer2 is within 1 point of $quizAnswer2")
    } else {
        points += 1
    }

    // Question 3
    if (studentAnswer3 == quizAnswer3) {
        points += 25
    } else if (studentAnswer3 == "equilateral") {
        points += 10
    } else {
        points += 1
    }

    //Question 4
    if (studentAnswer4 == quizAnswer4) {
        points += 25
    } else if (studentAnswer4 in 44..54) {
        points += 20
    } else {
        points += 1
    }

    // Returning Final Grade
    when (points) {
        in 0..59 -> println("$points points, Grade: F")
        in 60..69 -> println("$points points, Grade: D")
        in 70..79 -> println("$points points, Grade: C")
        in 80..89 -> println("$points points, Grade: B")
        in 90..100 -> println("$points points, Grade: A")
        in 101..110 -> println("$points points, Grade: A+")
    }
}