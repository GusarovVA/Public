import kotlin.math.sqrt
fun main() {

    // Задание 1. Функция расширения возведения в квадрат целого числа.
    fun Int.square(): Int {
        return this * this
    }

    // Задание 2. Функция расширения конкатенации строк.
    fun String.concat(other: String): String {
        return this + other
    }

    // Задание 3. Функция расширения определения последнего индекса в строке.
    fun String.lastIndex(): Int {
        return if (this.isEmpty()) -1 else this.length - 1
    }

    // Задание 4. Функция расширения получения квадратного корня из целого числа.
    fun Int.sqrt(): Double {
        if (this < 0) {
            throw IllegalArgumentException("Квадратный корень из отрицательного числа не может быть извлечен")
        }
        return sqrt(this.toDouble())
    }

    val number = 5
    println("$number в квадрате: ${number.square()}")

    val str1 = "Hello"
    val str2 = " World"
    println("Конкатенация строк: ${str1.concat(str2)}")
    val text = "Kotlin"
    println("Последний индекс строки '$text': ${text.lastIndex()}")

    val emptyString = ""
    println("Последний индекс пустой строки '$emptyString': ${emptyString.lastIndex()}")

    val numForSqrt = 25
    println("Квадратный корень из $numForSqrt: ${numForSqrt.sqrt()}")

    val negativeNum = -5;
    try {
        println("Квадратный корень из $negativeNum: ${negativeNum.sqrt()}")
    } catch (e: IllegalArgumentException){
        println("Ошибка: ${e.message}")
    }
}