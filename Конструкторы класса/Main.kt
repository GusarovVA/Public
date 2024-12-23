fun main() {

        //Задание 1. Объем коробки.
        val box = Box ()
        println("Объем коробки: ${box.boxVolume()}")

        //Задание 2. Максимальный и минимальный элемент в наборе чисел.
        val N = arrayOf(3, 6, 15, 1, 2, 7, 0)

        val minElement = N.minOf{it}
        println("Минимальный элемент в массиве равен: $minElement")

        val maxElement = N.maxOf{it}
        println("Максимальный элемент в массиве равен: $maxElement")

        //Задание 3. Вывод элементов массива.
        val numbers = arrayOf(3, 67, 1, 55, 65, 89, 23)
        println("Элементы массива: ${numbers.joinToString (", ")}")

        //Задание 4. Определение вида числа.
        val a = 1

        fun describeNumber(number: Int): String {
                return when {
                        number < 0 -> if (number % 2 == 0) "$a - отрицательное четное число" else "$a - отрицательное нечетное число"
                        number > 0 -> if (number % 2 == 0) "$a - положительное четное число" else "$a - положительное нечетное число"
                        else -> "$a - нулевое число"
                }
        }
        println(describeNumber(a))

        //Задание 5. Определение движения или остановки автомобиля.
        val myCar = Car(1500, 10)

        myCar.startMoving()
        myCar.stopMoving()
}