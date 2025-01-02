@file:Suppress("UNREACHABLE_CODE")

fun main() {

        //Задание 2. Дана строка «Шумоизоляция». Посчитать количество повторяющихся символов.

        fun countRepeatingChars(inputString: String): Map<Char, Int> {

                val charCounts = mutableMapOf<Char, Int>()
                for (char in inputString) {
                        charCounts[char] = charCounts.getOrDefault(char, 0) + 1
                }

                return charCounts.filterValues { it > 1 }
        }

        val inputString = "Шумоизоляция"
        val result = countRepeatingChars(inputString)

        if (result.isNotEmpty()) {
                result.forEach { (char, count) ->
                        println("Символ '$char' повторяется $count раз(а)")
                }
        } else {
                println("В строке нет повторяющихся символов.")
        }
        println("---------------------------------------------------------")

        //Задание 1. Написать программу, которая будет включать несколько классов и enum. Ход работы следующий. При запуске среда просит ввести месяц года. После ввода месяца и нажатия на enter, на консоль выводится время года, которому соответствует этот месяц. После этого программа вновь спросит желаете продолжить или закончить программу: 1. Продолжить; 2. Закончить программу. Если нажимаем продолжить, то программа вновь просит ввести месяц и цикл повторяется.
        val monthChecker = MonthChecker()

        while (true) {
                print("Введите месяц года: ")
                val inputMonth = readLine() ?: ""
                val season = monthChecker.getSeasonForMonth(inputMonth)

                if (season != null) {
                        println("Время года: $season")
                } else {
                        println("Некорректный ввод месяца.")
                }

                while(true){
                        print("Желаете продолжить? (1. Продолжить; 2. Закончить программу): ")
                        when (readLine()) {
                                "1" -> break
                                "2" -> {
                                        println("Программа завершена.")
                                        return
                                }
                                else -> println("Некорректный ввод. Пожалуйста, выберите 1 или 2.")
                        }
                }
        }
}