fun main() {
    //Задание 1. Написать программу, которая будет вычислять факториал числа с применением рекурсии.
    fun factorial(n: Int): Long {
        if (n < 0) {
            throw IllegalArgumentException("Факториал не определен для отрицательных чисел")
        }
        return when (n) {
            0 -> 1
            else -> n * factorial(n - 1)
        }
    }
    val num = 5
    println("Факториал числа $num равен ${factorial(num)}")
    println("-----------------------------------------------------------")

    //Задание 2. Написать функцию, которая находит N-ю степень числа 10 с применением рекурсии.
    fun powerOfTen(n: Int): Long {
        if (n < 0) {
            throw IllegalArgumentException("Степень числа должна быть неотрицательной")
        }
        return when (n) {
            0 -> 1
            else -> 10 * powerOfTen(n - 1)
        }
    }
    val n = 3
    println("10 в степени $n = ${powerOfTen(n)}")
    println("-----------------------------------------------------------")

    //Задание 3. Дан массив val array = arrayOf(1, 2, 3, 4, 5, 6, 7). Написать функцию, которая будет увеличивать элемент массива на единицу, находящийся через одну позицию. Т.е. массив на выходе будет такой [2, 2, 4, 4, 6, 6, 8].
    fun increaseEveryOther(array: Array<Int>): Array<Int> {
        for (i in array.indices) {
            if (i % 2 == 0) {
                array[i]++
            }
        }
        return array
    }
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println("Исходный массив:")
    println(array.asList())
    val modifiedArray = increaseEveryOther(array)
    println("Измененный массив:")
    println("${modifiedArray.contentToString()}")
}