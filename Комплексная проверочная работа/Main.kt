fun main() {
        //Задание 5. Загадка про "Троллейбус"
        println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
        val maxAttempts = 3
        for (attempt in 1..maxAttempts) {
                print("Попытка $attempt: ")
                val answer = readln()

                when (answer.lowercase()) {
                        "троллейбус" -> {
                                println("Правильно!")
                                return
                        }
                        "сдаюсь" -> {
                                println("Правильный ответ: троллейбус.")
                                return
                        }
                        else -> println("Подумай еще.")
                }
        }
        println("Попытки закончились. Правильный ответ: троллейбус.")

        //Задание 1. Найти значение
        var n = 5
        var sum = 0.0

        if (n <= 0) {
                println("Ошибка! n должно быть больше нуля")
                return
        }

        for (i in 1..n) {
                sum += 1.0 / i
        }

        println("Полученное значение: $sum")

        //Задание 2. Сумма квадратов
        val a = 2
        val b = 100
        var square = 0

        for (i in a..b){
                square += i*i
        }

        println("Сумма квадратов равна: $square")

        //Задание 3. Вывод чисел
        val A = 2
        val B = 6

        if (A <= B){
                println("Ошибка! А должно быть меньше В")
        }

        for (i in A..B){
                for (j in 1..i - A + 1)
                        println("$i")
        }

        //Задание 4. Проверка является ли число простым

        val number = 3

        if (number <= 1) {
                println("$number - это не простое число")
                return
        }

        if (number <= 3) {
                println("$number - это простое число")
                return
        }

        if (number % 2 == 0 || number % 3 == 0) {
                println("$number - это не простое число")
                return
        }

        var i = 5
        while (i * i <= number) {
                if (number % i == 0 || number % (i + 2) == 0) {
                        println("$number - это не простое число")
                        return
                }
                i += 6
        }
        println("$number - это простое число")
}
