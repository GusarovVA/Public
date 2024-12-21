fun main() {

    //Задание 1. Подсчет количества локальных минимумов в массиве.
    val arr = intArrayOf(5, 8, 4, 2, 6, 7, 11, 1, 9)

    fun arrayCheck (arr: IntArray): Int {
        if (arr.size < 3) {
            return 0
        }


        var localMinimaCount = 0
        for (i in 1 until arr.size - 1) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                localMinimaCount++
            }
        }
        return localMinimaCount
    }
    println("Количество локальных минимумов в массиве: ${arrayCheck(arr)}")

    //Задание 2. Проверка и увеличение отрицательных элементов в массиве.

    val arr1 = intArrayOf(-1, 2, 6, -7, 4, -9)

    fun modifyArray(arr1: IntArray): IntArray {
        for (i in arr1.indices) {
            if (arr1[i] < 0) {
                arr1[i]++
            }
        }
        return arr1
    }
    println("Измененный массив: ${modifyArray(arr1).contentToString()}")

    //Задание 3. Дана матрица размера M×N и целое число K (1≤K≤M). Вывести элементы K-й строки данной матрицы.

    val matrix1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    fun printKthRow(matrix: Array<IntArray>, k: Int) {

        fun validateInput(){
            if (k < 1 || k > matrix.size) {
                throw IllegalArgumentException("Число К должно быть от 1 до размера строки матрицы")
            }
        }

        fun printRow() {
            validateInput();
            println("Элементы $k строки: ")
            for (element in matrix[k - 1]) {
                print("$element ")
            }
            println()
        }
        printRow()
    }
    printKthRow(matrix1, 2)
}


