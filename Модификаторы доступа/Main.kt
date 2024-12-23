import java.util.*

//Задание 1. Registration.
fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)

        try {
                println("Введите ваш email:")
                val email = scanner.nextLine()

                println("Введите ваш пароль:")
                val password = scanner.nextLine()

                val registration = Registration(email, password)

                println("Ваш email в верхнем регистре: ${registration.upperEmail}")

                println("\nПовторите ввод пароля:")
                val newPassword = scanner.nextLine()

                registration.password = newPassword

                println("\nВаш новый пароль установлен!")
        } catch (e: IllegalArgumentException) {
                println(e.message)
        }
        println("-------------------------------------------")

        //Задание 2. Поиск четных чисел в двумерном массиве 4х4.
        val matrix = arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 6, 7, 8),
                intArrayOf(9, 10, 11, 12),
                intArrayOf(13, 14, 15, 16)
        )

        fun findEvenNumbers(matrix: Array<IntArray>): List<Int> {
                val evenNumbers = mutableListOf<Int>()
                for (row in matrix) {
                        for (element in row) {
                                if (element % 2 == 0) {
                                        evenNumbers.add(element)
                                }
                        }
                }
                return evenNumbers
        }

        val evenNumbers = findEvenNumbers(matrix)
        println("Четные числа в матрице: $evenNumbers")
        println("-------------------------------------------")

        //Задание 3. Функция заполнения двумерного массива 4 х 4 числами от 1 до 16 включительно.

        fun fillMatrix(size: Int): Array<IntArray> {
                val matrix1 = Array(size) { IntArray(size) }
                var counter = 1
                for (i in 0 until size) {
                        for (j in 0 until size) {
                                matrix1[i][j] = counter++
                        }
                }
                return matrix1
        }
        val matrix1 = fillMatrix(4)
        for (row in matrix1) {
                println(row.joinToString(separator = ", "))
        }
        println("-------------------------------------------")

        //Задание 4. Заполнение положительными элементами.
        fun printPositiveElements(arr: IntArray) {
                // Локальная функция для проверки на положительность
                fun isPositive(number: Int): Boolean {
                        return number > 0
                }

                arr.forEach {
                        if (isPositive(it)) {
                                println(it)
                        }
                }
        }
        val array = intArrayOf(-1, 2, -3, 4, 5, -6, 7, -8, 9)
        printPositiveElements(array)
}
