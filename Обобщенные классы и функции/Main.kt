fun main() {
        //Задание 1. Написать функцию print(), которая на вход может принимать различные типы. Вызвать эту функцию несколько раз, поместив аргументы разных типов.

        fun <T> print(value: T){
                println(value)
        }

        print("Игорек")
        print(745)
        print(4.3)
        print(false)
        println("-------------------------------")

        //Задание 2. Создать класс параметризованный класс Person, у которого свойство номера телефона в конструкторе может передаваться по – разному, как в виде числа, так и в виде строки. Создать Два экземпляра Person, поле телефона заполнить у первого числами, у второго строкой. Вывести полученную информацию о них. Person: name = имя, phone = телефон.

        class Person<A>(val number: A, val name: String)

        val person1: Person<Long> = Person (89145556677, "Sam")
        val person2: Person<String> = Person ("+79144567654", "Dima")

        println("Person: ${person1.name}, phone: ${person1.number}")
        println("Person: ${person2.name}, phone: ${person2.number}")
        println("-------------------------------")

        //Задание 3. Написать функцию вывода в консоль переменных разных типов данных. Вторым параметром в функции будет тип Char и будет представлять то, во что будет оборачиваться переменная параметризованного типа, поступающая на вход в качестве первого параметра. Например, переменная Int должна оборачиваться в фигурные скобки.

        fun <B> printVariable(variable: B, wrapper: Char) {
                val openWrapper = when (wrapper) {
                        '{' -> "{"
                        '[' -> "["
                        '(' -> "("
                        else -> ""
                }
                val closeWrapper = when (wrapper) {
                        '{' -> "}"
                        '[' -> "]"
                        '(' -> ")"
                        else -> ""
                }

                println("$openWrapper$variable$closeWrapper")
        }
        while(true){
                println("Введите тип данных (Int, String, List, Char, Double, Boolean, Null):")
                val type = readlnOrNull()

                if(type == null) break;

                println("Введите значение переменной:")
                val value = readlnOrNull()

                if(value == null) break;


                println("Введите символ-обертку ({, [, ( :")
                val wrapper = readlnOrNull()?.getOrNull(0)

                if(wrapper == null) break;


                when (type.lowercase()) {
                        "int" -> {
                                try {
                                        val intValue = value.toInt()
                                        printVariable(intValue, wrapper)
                                } catch (e: NumberFormatException) {
                                        println("Ошибка: Неверный формат для Int")
                                }

                        }
                        "string" -> printVariable(value, wrapper)
                        "list" ->{
                                try {
                                        val listValue = value.removePrefix("[").removeSuffix("]").split(",").map { it.trim().toInt() }.toList()
                                        printVariable(listValue, wrapper)
                                }
                                catch (e: Exception) {
                                        println("Ошибка: Неверный формат для List<Int>, вводите значения через запятую, в квадратных скобках, например, [1,2,3]")
                                }
                        }
                        "char" -> {
                                if (value.length == 1){
                                        val charValue = value[0]
                                        printVariable(charValue, wrapper)
                                }
                                else {
                                        println("Ошибка: Неверный формат для Char, вводите один символ.")
                                }
                        }
                        "double" -> {
                                try {
                                        val doubleValue = value.toDouble()
                                        printVariable(doubleValue, wrapper)
                                }
                                catch (e: NumberFormatException) {
                                        println("Ошибка: Неверный формат для Double")
                                }
                        }
                        "boolean" -> {
                                if (value.lowercase() == "true" || value.lowercase() == "false") {
                                        val booleanValue = value.toBoolean()
                                        printVariable(booleanValue, wrapper)
                                }
                                else {
                                        println("Ошибка: Неверный формат для Boolean, вводите true или false")
                                }
                        }
                        "null" -> printVariable(null, wrapper)
                        else -> println("Ошибка: Неверный тип данных")
                }

                println("---------------")
                println("Для выхода нажмите Enter, иначе любую другую клавишу")
                val exit = readlnOrNull()
                if (exit == null) break;
        }

        println("Программа завершена")
}








