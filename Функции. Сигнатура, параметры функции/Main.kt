import kotlin.time.times

fun main() {

        // Задание 1. Написать функцию возведения числа a в степень n.
        val a = 2
        val n = 2

        fun power(a: Double, n: Int): Double {
                var result = 1.0
                for (i in 1..n) {
                        result *= a
                }
                return result
        }

        val result = power(a.toDouble(), n)
        println("Результат возведения $a в степень $n равен $result")

        //Задание 2. Написать функцию, которая принимает два целых числа a и b (a<b). Она вычисляет произведение всех целых чисел от a до b включительно.

        val a1 = 5
        val b1 = 10

        fun productRange(a1: Int, b1: Int): Long {
                if (a1 > b1) {
                        throw IllegalArgumentException("a должно быть меньше или равно b")
                }

                var result1: Long = 1L
                for (i in a1..b1) {
                        result1 *= i
                }
                return result1
        }

        val result1 = productRange(a1, b1)
        println("Произведение всех чисел от $a1 до $b1 включительно: $result1")

        //Задание 3. Написать функцию, которая принимает два целых числа a и b. Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.

        val a2 = 48
        val b2 = 18

        fun gcd(a2: Int, b2: Int): Int {
                var x = Math.abs(a2)
                var y = Math.abs(b2)

                while (y != 0) {
                        val temp = y
                        y = x % y
                        x = temp
                }

                return x
        }
        val result2 = gcd(a2, b2)
        println("Наибольший общий делитель чисел $a2 и $b2 равен $result2")
}
