fun main() {
        // Задание 1
        val a = -6
        val result = if (a > 0) a + 1 else a
        println("Полученное число: $result")

        //Задание 2
        val numbers = listOf(4, 45, -2, 8)
        var result2 = 0
        for (nuber in numbers){
                if (nuber > 0) {
                        result2++
                }else{
                }
        }
        println("Количество положительных чисел: $result2")

        //Задание 3
        val b = 13
        val c = 12
        val result3 = if (c > b)c else b
        println("Большее число: $result3")

        //Задание 4
        val days = listOf("понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье")
        val day = 7

        val result4 = if (day in 1..7) days[day - 1] else "Неправильно введено число, введите от 1 до 7"
        println("Порядковому номеру $day соответствует: $result4")

        //Задание 5
        val K = 5
        val mark = listOf("плохо", "неудовлетворительно", "удовлетворительно", "хорошо", "отлично")
        val result5 = if (K in 1..5) mark[K - 1] else "Ошибка!"
        println("Ваша оценка: $result5")

        //Задание 6
        val d = 1.5
        val e = 2.5
        val action = 2
        val calculation = if (e.toDouble() != 0.0) {
                listOf(d + e, d - e, d * e, d / e)
        } else {
                listOf(d + 0.0, d - 0.0, d * 0.0, throw ArithmeticException("Делить на ноль нельзя"))
        }
        val result6 = if (action in 1..4) calculation[action - 1] else "Ошибка!"
        println("Результат для арифметического действия № $action равен: $result6")
}