fun main() {

        //Задание 1. Напишите функцию, которая запускает лямбду print() столько раз сколько будет указано в параметре count.Например, чтобы передаваемое сообщение в print() выводилось count раз.
        fun repeatPrint(count: Int, message: String) {
                repeat(count) {
                        println(message)
                }
        }
        repeatPrint(3, "Привет мир!")
        println("-------------------------------------")

        // Задание 2. Напишите программу, реализующую лямбда-выражение для вычисления среднего арифметического списка чисел.
        fun List<Int>.average(): Double {
                if (this.isEmpty()) {
                        return 0.0
                }
                return this.sum().toDouble() / this.size
        }

        val numbers = listOf(1, 2, 3, 4, 5)
        val average1 = numbers.average()
        println("Среднее арифметическое списка $numbers: $average1")
        println("-------------------------------------")

        //Задание 3. Дан массив произвольного набора чисел. Отфильтруйте его, чтобы в нем остались только положительные числа.
        val numbers2 = arrayOf(-5, 2, 0, -8, 10, 3, -1, 7, -4)

        val positiveNumbers = numbers.filter { it > 0 }

        println("Исходный массив: ${numbers2.contentToString()}")
        println("Положительные числа: $positiveNumbers")
        println("-------------------------------------")

        // Задание 4. Напишите программу, которая реализует лямбда-выражение для работы с массивом целых чисел таким образом, что его четные элементы делятся на 2, нечетные – умножаются на 3.
        val numbers3 = arrayOf(1, 2, 5, 8, 9)
        val transformedNumbers3 = numbers3.map {
                if (it % 2 == 0) {
                        it / 2
                } else {
                        it * 3
                }
        }
        println("Исходный массив: ${numbers3.contentToString()}")
        println("Преобразованный массив: $transformedNumbers3")

}





