data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}



class Quiz {
    val question1 = Question<String>(
        questionText = "Речка с пятила с ума - По домам пошла сама. ___",
        answer = "Водопровод",
        difficulty = Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        questionText = "Небо зеленое. Правда или ложь",
        answer = false,
        difficulty = Difficulty.EASY
    )
    val question3 = Question<Int>(
        questionText = "Сколько дней между полнолуниями?",
        answer = 28,
        difficulty = Difficulty.HARD
    )
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) {print("▓")}
    repeat(Quiz.total - Quiz.answered) { print("▒")}
    println()
    println(Quiz.progressText)
}

val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"

fun main(){


//    println(question1.answer)
//    println(question2.answer)
//    println(question3.answer)
//    println(question1.toString())

    println("${Quiz.progressText}")

    Quiz.printProgressBar()
}