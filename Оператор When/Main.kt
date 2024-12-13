fun main() {

    // Задание 1
    val number = 12
    when (number) {
        1 -> println("Зима: январь")
        2 -> println("Зима: февраль")
        3 -> println("Весна: март")
        4 -> println("Весна: апрель")
        5 -> println("Весна: май")
        6 -> println("Лето: июнь")
        7 -> println("Лето: июль")
        8 -> println("Лето: август")
        9 -> println("Осень: сентябрь")
        10 -> println("Осень: октябрь")
        11 -> println("Осень: ноябрь")
        12 -> println("Зима: декабрь")
        else -> println("Такого месяца не существует")
    }

    //Задание 2
    val number1 = 6.0
    val rounded = when {
        number1 - number1.toInt().toFloat() > 0f -> number1.toInt() + 1
        number1 - number1.toInt().toFloat() < 0f -> number1.toInt() - 1
        else -> number1.toInt()
    }
    println("$number1 округлен до $rounded")

    //Задание 3
    val hour = 6
    when (hour) {
        in 0..5 -> println("Раннее утро")
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 18..20 -> println("Вечер")
        in 21..23 -> println("Поздний вечер")
        else -> println("Неверное значение")
    }

    //Задание 4
    var a = 8
    var b = 5
    when {
        true -> {
            val swap = a
            a = b
            b = swap
        }
    }
    println("a = $a, b = $b")
}
