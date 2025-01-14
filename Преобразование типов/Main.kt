fun main() {
        //Задание 1. Дана строка, содержащая в себе значение 12.3. Преобразовать ее в целое число, число с плавающей точкой, число в двоичной системе представления и вывести в консоль. Для части преобразований, например, в двоичное представление, необходимо сделать несколько преобразований, чтобы целое число перевести в двоичное.

        val numberString = "12.3"

        // 1. Преобразование в целое число
        val intValue = numberString.toDoubleOrNull()?.toInt()
        println("Целое число: $intValue")

        // 2. Преобразование в число с плавающей точкой
        val doubleValue = numberString.toDoubleOrNull()
        println("Число с плавающей точкой: $doubleValue")

        // 3. Преобразование в двоичное представление
        val binaryValue = numberString.toDoubleOrNull()?.toInt()?.toString(2)
        println("Двоичное представление: $binaryValue")

        // 4. Преобразование в двоичное представление (без null)
        val binaryValueWithoutNull = numberString.toDouble().toInt().toString(2)
        println("Двоичное представление без null: $binaryValueWithoutNull")
        println("-----------------------------------------------------------------------")

        //Задание 2. Написать функцию, которая проверяет чем, является вводимый аргумент строкой, числом, числом с плавающей точкой, символом. Ввод должен быть таким: «Это строка».
        fun checkType(input: String) {
                when {
                        input.toDoubleOrNull() != null -> {
                                val doubleValue = input.toDouble()
                                if (doubleValue % 1 == 0.0){
                                        println("Это число")
                                }
                                else{
                                        println("Это число с плавающей точкой")
                                }
                        }
                        input.length == 1 -> println("Это символ")
                        else -> println("Это строка")
                }
        }

        checkType("123")
        checkType("12.3")
        checkType("abc")
        checkType("a")
        println("-----------------------------------------------------------------------")

        //Задание 3. Написать функцию, которая на вход принимает типизированный параметр. Если это будет целое число, то в консоль вывести сумму вводимого числа и единицы, если строка - сумму длины строки и единицы, если массив целых чисел - сумму элементов массива.

        fun <T> processInput(input: T) {
                when (input) {
                        is Int -> println(input + 1)
                        is String -> println(input.length + 1)
                        is Array<*> -> {
                                if (input.isArrayOf<Int>()){
                                        var sum = 0
                                        for (element in input) {
                                                sum += element as Int
                                        }
                                        println(sum)
                                }
                                else{
                                        println("Неподдерживаемый тип массива")
                                }
                        }
                        else -> println("Неподдерживаемый тип")
                }
        }

        processInput(7)
        processInput("привет Андрей")
        processInput(arrayOf(1, 2, 3, 4))
        processInput(arrayOf(1,2,"3"))
        processInput(true)
        processInput(5.3)
}








