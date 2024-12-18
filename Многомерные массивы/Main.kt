import kotlin.time.times

fun main() {

        //Задание 1. Минимальный элемент массива
        val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
)
        val minElement = matrix.flatten().minOrNull()

        if (minElement != null){
                println("Минимальный элемент массива: $minElement")
        }else{
                println("Ошибка! Массив пуст")
        }

        //Задание 2. Найти медиану в массиве 3 х 5
        val matrix2 = arrayOf(
                arrayOf(1, 2, 3, 5),
                arrayOf(4, 5, 6, 8),
                arrayOf(7, 8, 9, 11)
        )
        val sortedArray = matrix2.flatten().sorted()
        val size = sortedArray.size
        val median: Double

        if (size % 2 == 0){
                val mid1 = sortedArray[size / 2 - 1]
                val mid2 = sortedArray[size / 2]
                median = (mid1 + mid2) / 2.0
        }else{
                median = sortedArray[size / 2].toDouble()
        }
        println("Медиана: $median")

        //Задание 3. Заполнение матрицы
        val matrix3 = Array(5) { IntArray(5) }

        val ones = arrayOf(
                Pair(2, 2),
                Pair(3, 1),
                Pair(3, 2),
                Pair(3, 3),
                Pair(4, 0),
                Pair(4, 1),
                Pair(4, 2),
                Pair(4, 3),
                Pair(4, 4)
        )

        for ((row, col) in ones) {
                matrix3[row][col] = 1
        }

        for (row in matrix3) {
                for (element in row) {
                        print("$element ")
                }
                println()
        }

        //Задание 4. Найти второе максимальное число
        val multiDimensionalArray = arrayOf(
                arrayOf(1, 5, 2, 10),
                arrayOf(91, 3, 7, 2),
                arrayOf(4, 6, 1, 52)
        )

        if (multiDimensionalArray.isEmpty()) {
                println("В массиве нет второго максимального числа (массив пустой).")
                return
        }

        val flattenedList = multiDimensionalArray.flatten().distinct().sortedDescending()

        if (flattenedList.size < 2) {
                println("В массиве нет второго максимального числа (меньше 2 уникальных элемента).")
                return
        }

        val secondMax = flattenedList[1]
        println("Второе максимальное число: $secondMax")

}
