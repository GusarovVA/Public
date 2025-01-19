fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //Дан список целых чисел. Вывести в консоль первый элемент списка двумя способами: обратившись по индексу, через стандартную функцию first().
    println("Первый элемент (через индекс): ${numbers[0]}")
    println("Первый элемент (через функцию): ${numbers.first()}")
    println("-------------------------------------------------------")
    //Дан список целых чисел. Вывести в консоль среднее арифметическое элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции average().
    var sumManual = 0.0
    for (num in numbers) {
        sumManual += num
    }
    val averageManual = if(numbers.isNotEmpty()) sumManual / numbers.size else 0.0
    println("Среднее арифметическое (цикл): $averageManual")
    println("Среднее арифметическое (функция): ${numbers.average()}")
    println("-------------------------------------------------------")
    //Дан список целых чисел. Вывести в консоль сумму элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции sum().
    var sumManual2 = 0
    for (num in numbers) {
        sumManual2 += num
    }
    println("Сумма целых чисел (цикл): $sumManual2")
    println("Сумма целых чисел (функция): ${numbers.sum()}")
    println("-------------------------------------------------------")
    //Дан список целых чисел. Вывести в консоль количество элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции count().
    var countManual = 0
    for (num in numbers) {
        countManual++
    }
    println("Количество элементов (цикл): $countManual")
    println("Количество элементов (функция): ${numbers.count()}")
    println("-------------------------------------------------------")
    //Дан список целых чисел. Вывести в консоль сумму двух последних элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции takeLast().
    var sumOfLastTwoManual = 0
    if (numbers.size >= 2) {
        sumOfLastTwoManual = numbers[numbers.size - 1] + numbers[numbers.size - 2]
    }
    println("Сумма двух последних элементов (цикл): $sumOfLastTwoManual")
    println("Сумма двух последних элементов (функция): ${numbers.takeLast(2).sum()}")
    println("-------------------------------------------------------")
    //Дан список целых чисел. Вывести в консоль сумму индексов элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции indices().
    var sumOfIndicesManual = 0
    for (i in numbers.indices) {
        sumOfIndicesManual += i
    }
    println("Сумма индексов (цикл): $sumOfIndicesManual")
    var sumOfIndicesUsingIndices = 0
    numbers.indices.forEach { sumOfIndicesUsingIndices += it }
    println("Сумма индексов (функция): $sumOfIndicesUsingIndices")
}