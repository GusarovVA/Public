import kotlin.time.times

fun main() {
        //Задание 1. Произведение элементов массива
        val array = arrayOf(2.1, 4.3, 1.3, 6.2, 5.6, 7.4, 1.4, 8.7, 2.2, 11.0)
        var sum = 1.0

        for (number in array){
                sum *= number
        }
        println("Произведение всех элементов массива равно: $sum")

        //Задание 2. Среднее арифметическое элементов массива
        val numbers = arrayOf(2, 2, 3, 6, 5, 8, 7, 15)
        val averege = numbers.average()
        println(averege)

        //Задание 3. Манипуляции с массивом
        val ar = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val evenNumbers = mutableListOf<Int>()
        var count = 0

        for (num in ar) {
                if (num % 2 == 0) {
                        evenNumbers.add(num)
                        count++
                }
        }
        print("Четные числа: ")
        for (evenNumber in evenNumbers) {
                print("$evenNumber ")
        }
        println("\nКоличество четных чисел: $count")

        //Задание 4. Массив степени двойки
        val n = 5
        if (n <= 0) {
                println("Ошибка: N должно быть больше 0")
                return
        }

        val powersOfTwo = IntArray(n)
        var currentPower = 2

        for (i in 0 until n) {
                powersOfTwo[i] = currentPower
                currentPower *= 2
        }

        println("Массив степеней двойки:")
        for (power in powersOfTwo) {
                print("$power ")
        }
}
