fun main() {
        //Задание 1. Создать класс Human(человек). В нем создать несколько внутренних классов, например, head(голова), legs(ноги), в каждом из классов напишите функции этой части тела. В главной функции опишите модель человека, вызвав всю функциональность написанных классов.
        val name = Human("Дима Петров")
        val body = Human.Head()
        val body1 = Human.Legs()
        val body2 = Human.Hands()

        println("Части тела человека: ${name.name}, выполняют следующие операции:")
        println("$body")
        println("$body1")
        println("$body2")

        // Задание 2. Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов". Написать программу поиска и вывода на экран элементов массива по вводимым символам.
        val names = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")

        while(true) {
                print("Введите символы для поиска совпадений в фамилиях (или 'выход' что бы завершить работу программы): ")
                val input = readlnOrNull() ?: ""

                if (input.equals("выход", ignoreCase = true)) {
                        println("Поиск завершен.")
                        break
                }

                val matchingNames = names.filter { it.contains(input, ignoreCase = true) }

                if (matchingNames.isNotEmpty()) {
                        println("Совпадающие символы найдены в фамилиях:")
                        matchingNames.forEach { println(it) }

                } else {
                        println("Фамилия с буквой '$input' в своем составе не найдена.")
                }
                println("------------------------------------------------------------------")
        }
        //Задание 3. Создать массив целых чисел, в котором есть два нулевых элемента, не идущих подряд. Посчитать количество элементов, которые находятся между нолями.
        val numbers = intArrayOf(1, 5, 0, 2, 8, 9, 0, 3, 7)

        var firstZeroIndex = -1
        var secondZeroIndex = -1

        for (i in numbers.indices) {
                if (numbers[i] == 0) {
                        if (firstZeroIndex == -1) {
                                firstZeroIndex = i
                        } else {
                                secondZeroIndex = i
                                break
                        }
                }
        }

        if(firstZeroIndex == -1 || secondZeroIndex == -1) {
                println("Ошибка: массив не содержит двух нулей или содержит только один ноль.")
        }
        else if (firstZeroIndex == secondZeroIndex -1){
                println("Ошибка: нули расположены рядом друг с другом.")
        }
        else{
                val countBetweenZeros = secondZeroIndex - firstZeroIndex - 1
                println("Массив: ${numbers.joinToString(", ")}")
                println("Количество элементов между двумя нулями: $countBetweenZeros")
        }
}