fun main() {
    //Задание 1. Написать анонимную функцию – поздравление с наступающим новым годом. Ее тип следующий (String, Int) -> String. Где первый параметр имя, кого поздравляют, второй с каким годом поздравляют. Эти аргументы должны вписываться в контекст поздравления, которое составлено в теле функции.
    val congratulation = fun (a: String, b: Int) = "Дорогой $a, поздравляю тебя с наступающим $b годом!!!"
    val result = congratulation("Максим", 2025)
    println(result)
    println("----------------------------------------------------------------------")

    //Задание 2. Создать массив целых чисел произвольного размера. Написать анонимную функцию isEven, проверяющую число на четность, она возвращает логический тип. Написать функцию checkArrayElement проверки массива и его элементов на четность, она на вход принимает массив и вторым параметром анонимную функцию типа isEven.
    val array = arrayOf(4, 6, 8, 10, 11)

    val isEven: (Int) -> Boolean = fun(number: Int): Boolean {
        return number % 2 == 0
    }

    fun checkArrayElement(array: Array<Int>, isEven: (Int) -> Boolean): Boolean {
        if (array.isEmpty()) return true
        for (element in array) {
            if (!isEven(element)) {
                return false
            }
        }
        return true
    }

    println("Массив: ${array.contentToString()} - все четные? ${checkArrayElement(array, isEven)}")
    println("----------------------------------------------------------------------")

    //Задание 3. Напишите анонимную функцию для объединения двух строк и возврата результата.
    val concatStrings = fun(a: String, b: String): String {
        return a + b
    }
    val result1 = concatStrings ("Привет", " Мир!")
    println(result1)
}