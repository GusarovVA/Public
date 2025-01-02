fun main() {

        //Задание Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.

        fun findWord(stringArray: Array<String>): Pair<String?, Int> {
                if (stringArray.isEmpty()) {
                        return Pair(null, 0)
                }

                var longestWord: String? = null
                var maxLength = 0

                for (word in stringArray) {
                        if (word.length > maxLength) {
                                maxLength = word.length
                                longestWord = word
                        }
                }

                return Pair(longestWord, maxLength)
        }

        val stringArray = arrayOf("яблоко", "банан", "виноград", "апельсин", "киви")
        val (longestWord, length) = findWord(stringArray)

        if (longestWord != null) {
                println("Самое длинное слово: '$longestWord'")
                println("Количество букв в нем: $length")
        } else {
                println("Массив пустой.")
        }
        println("-------------------------------------------------------------------")

        //Задание 2. Посчитать сумму элементов побочной диагонали матрицы 4х4.

        fun sumSecondaryDiagonal(matrix: Array<IntArray>): Int? {

                if (matrix.size != 4) {
                        return null
                }
                for (row in matrix) {
                        if (row.size != 4) {
                                return null
                        }
                }

                var totalSum = 0
                for (i in 0..3) {
                        totalSum += matrix[i][3 - i]
                }
                return totalSum
        }

        val matrix = arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 6, 7, 8),
                intArrayOf(9, 10, 11, 12),
                intArrayOf(13, 14, 15, 16)
        )
        val result = sumSecondaryDiagonal(matrix)
        if (result != null) {
                println("Сумма элементов побочной диагонали: $result")
        } else {
                println("Матрица должна быть 4x4.")
        }
        println("-------------------------------------------------------------------")

        //Задание 3. Написать абстрактный класс Printer со своими свойствами и функциями. В функции main создать несколько объектов Printer.

        abstract class Printer(val model: String, var isPoweredOn: Boolean = false) {
                abstract val printSpeed: Int

                abstract fun print(text: String)

                open fun powerOn() {
                        isPoweredOn = true
                        println("$model: Включен.")
                }

                open fun powerOff() {
                        isPoweredOn = false
                        println("$model: Выключен.")
                }

                fun getStatus(): String {
                        return "$model status: ${if (isPoweredOn) "ON" else "OFF"}"
                }

        }

        class LaserPrinter(model: String, override val printSpeed: Int) : Printer(model) {
                override fun print(text: String) {
                        if (isPoweredOn) {
                                println("Лазерный принтер $model печатает: '$text' (скорость $printSpeed стр/мин)")
                        } else {
                                println("Принтер $model выключен, включите его для печати.")
                        }
                }
        }

        class InkjetPrinter(model: String, override val printSpeed: Int) : Printer(model) {
                override fun print(text: String) {
                        if (isPoweredOn) {
                                println("Струйный принтер $model печатает: '$text' (скорость $printSpeed стр/мин)")
                        } else {
                                println("Принтер $model выключен, включите его для печати.")
                        }
                }
        }

        val laserPrinter = LaserPrinter("HP LaserJet Pro M15w", 30)
        val inkjetPrinter = InkjetPrinter("Epson L3150", 15)

        println(laserPrinter.getStatus())
        println(inkjetPrinter.getStatus())

        laserPrinter.powerOn()
        inkjetPrinter.powerOn()

        laserPrinter.print("Hello world!")
        inkjetPrinter.print("Hello world!")

        laserPrinter.powerOff()
        inkjetPrinter.powerOff()

        laserPrinter.print("Trying to print when off")
        inkjetPrinter.print("Trying to print when off")

}