fun main() {
    //Задание 1. Написать функцию высшего порядка action, которая на вход принимает значения двух цветов типа String. Они будут смешиваться в функции, которая на вход поступает в качестве третьего аргумента в action, она же возвращает строку – получившейся цвет. Функция action возвращает результат в виде строки смешанный цвет из двух заданных
    fun action(color1: String, color2: String, mixFunction: (String, String) -> String): String {
        return mixFunction(color1, color2)
    }

    fun mixColorsSimple(color1: String, color2: String): String {
        return "Смешали $color1 и $color2, получился непонятный цвет"
    }

    fun mixColorsBasic(color1: String, color2: String): String {
        return when {
            (color1 == "красный" && color2 == "синий") || (color1 == "синий" && color2 == "красный") -> "фиолетовый"
            (color1 == "красный" && color2 == "желтый") || (color1 == "желтый" && color2 == "красный") -> "оранжевый"
            (color1 == "синий" && color2 == "желтый") || (color1 == "желтый" && color2 == "синий") -> "зеленый"
            else -> "неизвестный цвет"
        }
    }
    val result1 = action("красный", "синий", ::mixColorsSimple)
    println("Результат 1: $result1")
    val result2 = action("красный", "желтый", ::mixColorsBasic)
    println("Результат 2: $result2")
    //Задание 2. Написать функции изменения числа: одна – увеличение числа на единицу, вторая – умножение на два. Написать функцию высшего порядка, которая на вход принимает массив целых чисел и вторым
    fun increaseByOne(number: Int): Int {
        return number + 1
    }

    fun multiplyByTwo(number: Int): Int {
        return number * 2
    }

    fun transformArray(numbers: Array<Int>, transformFunction: (Int) -> Int): Array<Int> {
        return numbers.map { transformFunction(it) }.toTypedArray()
    }
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // Увеличение каждого элемента на 1
    val increasedNumbers = transformArray(numbers, ::increaseByOne)
    println("Исходный массив: ${numbers.contentToString()}")
    println("Увеличенный на 1 массив: ${increasedNumbers.contentToString()}")

    // Умножение каждого элемента на 2
    val multipliedNumbers = transformArray(numbers, ::multiplyByTwo)
    println("Исходный массив: ${numbers.contentToString()}")
    println("Умноженный на 2 массив: ${multipliedNumbers.contentToString()}")

    // Увеличение на 10 с помощью лямбда-выражения
    val increasedByTen = transformArray(numbers) { it + 10 }
    println("Исходный массив: ${numbers.contentToString()}")
    println("Увеличенный на 10 массив: ${increasedByTen.contentToString()}")

    // Умножение на 5 с помощью лямбда-выражения
    val multipliedByFive = transformArray(numbers) { it * 5 }
    println("Исходный массив: ${numbers.contentToString()}")
    println("Умноженный на 5 массив: ${multipliedByFive.contentToString()}")
}