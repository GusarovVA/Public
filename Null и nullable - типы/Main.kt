fun main() {
        //Задание 1. Написать функцию, которая выводит в консоль Вашу любимую книгу. Входной параметр – название книги. Если в аргументы передается значение null, вывести фразу «У меня нет любимой книги».

        val book: String? = null
        val fbook = book ?: "У меня нет любимой книги"
        println(fbook)
        println("---------------------------------------")

        //Задание 2. Создайте функцию, которая возвращает сколько раз целое число может быть разделено на другое целое число без остатка. Функция должна возвращать null, если результатом деления является не целое число. Назовите функцию DivideIfWhole. Дополнительно написать решение, в случае, когда нет ни одного деления без остатка – вывести ноль. Рефакторинг сделать с применением оператора ?:

        fun divideIfWhole(number: Int, divisor: Int): Int? {
                if (divisor == 0) return null

                var count = 0
                var current = number.toDouble()
                while (current % divisor == 0.0) {
                        current /= divisor
                        count++
                }

                return if (count > 0) count else null
        }


        fun divideIfWholeWithZero(number: Int, divisor: Int): Int {
                return divideIfWhole(number, divisor) ?: 0
        }

        println(divideIfWhole(8, 2))
        println(divideIfWhole(10, 3))

        println(divideIfWholeWithZero(8, 2))
        println(divideIfWholeWithZero(10, 3))
        println("---------------------------------------")

        //Задание 3. Дан массив строк array = arrayOf("Привет","как", null, "дела"). Создать новый массив, который будет состоять из элементов массива array, которые не являютсяnull. Вывести их в консоль.

        val array = arrayOf("Привет", "как", null, "дела")

        val nonNullArray = array.filterNotNull()

        println(nonNullArray)

}








