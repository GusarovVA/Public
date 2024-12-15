import kotlin.math.abs
import kotlin.math.sqrt

fun main() {

//Задание 1. Среднее арифметическое
    val a = 10
    val b = 22.4
    var sum = 0.0
    var count = 0

    for (i in 1..2) {
        if (i == 1) {
            sum += a
            count++
        } else if (i == 2) {
            sum += b
            count++
        }
    }
    val average = sum / count;
    println("Среднее арифметическое чисел $a и $b равно: $average")

//Задание 2. Вычесление параметров окружности
    val S = 20
    val π = 3.14
    var D = 0.0
    var l = 0.0

    for (i in 1..1) {
        D = sqrt((4 * S) / π)
        l = π * D
    }
    println("Диаметр окружности площадью $S равен $D, длинна равна $l")

//Задание 3. Вычисление параметров прямоугольника
    val x1 = 1
    val x2 = 6
    val y1 = 1
    val y2 = 8

    var высота = 0.0
    var длинна = 0.0

    for (i in 1..1){
        высота = abs(y2 - y1).toDouble()
        длинна = abs(x2 - x1).toDouble()
    }
    val Ppr = (высота + длинна) * 2
    val Spr = (высота * длинна)
    println("Прямоугольник длинной $длинна и высотой $высота, имеет периметр равный $Ppr и площадь равную $Spr")

//Задание 4. Вывод последовательности
    var C = 1
    for (i in 1..10){
        println(C)
        C *= 2
    }
    println()

//Задание 5. Уменьшение числа
    var n = 20
    for (i in n downTo 0) {
        if (i % 2 == 0){
            println(i)
        }
    }
}


