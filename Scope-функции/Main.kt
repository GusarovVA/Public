fun main() {
    // Задача 1. Создайте scope – функцию let, которая будет вызываться у строки.
//    В лямбда – выражении этой функции выводится в консоль сам объект и длина этой строки.
    fun String.printDetails() {
        this.let {
            println("Строка: $it, Длина: ${it.length}")
        }
    }
    val myString = "Hello, Kotlin!"
    myString.printDetails()

    // Задача 2. Создать класс City, в конструкторе передается название города и population(население).
//    В главной функции создать его экземпляр, в конструктор передать название, через функцию apply
//    объекту назначить население в любом количестве. Всю информацию об объекте, созданного City вывести в консоль.
    data class City(val name: String, var population: Long = 0)
    val city = City("New York").apply {
        population = 8_400_000
    }
    println("Город: ${city.name}, Население: ${city.population}")

    // Задача 3. Дан массив целых чисел. С помощью scope – функции with вывести в консоль данный массив,
//    количество элементов массива, сумму элементов массива.
    fun printArrayDetails(array: Array<Int>) {
        with(array) {
            println("Массив: ${this.contentToString()}")
            println("Количество элементов: ${this.size}")
            println("Сумма элементов: ${this.sum()}")
        }
    }
    val intArray = arrayOf(1, 2, 3, 4, 5)
    printArrayDetails(intArray)
}