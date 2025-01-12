fun main() {
    //Задание 1. Создайте обобщённый класс States, который содержит функцию getAverage(), возвращающую среднее значение массива чисел. Класс имеет ограничение: он может работать только с числовыми значениями, T:Number.
    class States<T : Number>(private val numbers: Array<T>) {

        fun getAverage(): Double {
            if (numbers.isEmpty()) {
                return 0.0
            }
            var sum = 0.0
            for (number in numbers) {
                sum += number.toDouble()
            }
            return sum / numbers.size
        }
    }

    val intArray = arrayOf(1, 2, 3, 4, 5)
    val doubleArray = arrayOf(1.0, 2.5, 3.7, 4.2, 5.8)
    val emptyArray = emptyArray<Int>()


    val intStates = States(intArray)
    val doubleStates = States(doubleArray)
    val emptyStates = States(emptyArray)

    println("Среднее значение intArray: ${intStates.getAverage()}")
    println("Среднее значение doubleArray: ${doubleStates.getAverage()}")
    println("Среднее значение emptyArray: ${emptyStates.getAverage()}")
    println("----------------------------------------")

    ////Задание 2. Создать класс по имени GenericMethod и обобщенную функцию внутри класса по имени isItIncluded(). Функция isItIncluded() определяет, является ли объект членом массива. Он может быть использован с любым типом объектов и массивов до тех пор, пока массив содержит объекты, совместимые с типом искомого объекта.

    class GenericMethod {

        fun <T> isItIncluded(item: T, array: Array<T>): Boolean {
            for (element in array) {
                if (item == element) {
                    return true
                }
            }
            return false
        }
    }

    val genericMethod = GenericMethod()

    val intArray1 = arrayOf(1, 2, 3, 4, 5)
    println("1 входит в массив intArray: ${genericMethod.isItIncluded(1, intArray1)}")
    println("6 входит в массив intArray: ${genericMethod.isItIncluded(6, intArray1)}")

    val stringArray = arrayOf("apple", "banana", "cherry")
    println("banana входит в массив stringArray: ${genericMethod.isItIncluded("banana", stringArray)}")
    println("grape входит в массив stringArray: ${genericMethod.isItIncluded("grape", stringArray)}")

    val doubleArray1 = arrayOf(1.0, 2.0, 3.0)
    println("2.0 входит в массив doubleArray: ${genericMethod.isItIncluded(2.0, doubleArray1)}")
    println("2.5 входит в массив doubleArray: ${genericMethod.isItIncluded(2.5, doubleArray1)}")

}