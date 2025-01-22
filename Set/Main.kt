fun main() {
        // 1. Разбить набор на четные и нечетные
        val numbers = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val (even, odd) = numbers.partition { it % 2 == 0 }
        println("Четные: $even")
        println("Нечетные: $odd")
        println("---------------------------------------------------")

        // 2. Создать новое множество с элементами, умноженными на 2 и кратными 5
        val numbers2 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,15)
        val multipliedAndFiltered = numbers2.map { it * 2 }.filter { it % 5 == 0 }.toSet()
        println("Умноженные и кратные 5: $multipliedAndFiltered")
        println("---------------------------------------------------")

        //3. Функция удаления дубликатов
        val listWithDuplicates = listOf(1, 2, 2, 3, 4, 4, 5,1, 5)
        val setWithoutDuplicates = removeDuplicates(listWithDuplicates)
        println("Удалены дубликаты (список): $setWithoutDuplicates")

        val setWithDuplicates = linkedSetOf(1,2,3,2,4,5,6,4,3,3)
        val setWithoutDuplicates2 = removeDuplicates(setWithDuplicates)
        println("Удалены дубликаты (множество): $setWithoutDuplicates2")

        val nullList : List<Int>? = null
        val setWithoutDuplicates3 = removeDuplicates(nullList)
        println("Удалены дубликаты (null): $setWithoutDuplicates3")
        println("---------------------------------------------------")

        // 4. Переместить нули в конец массива
        val array = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)
        moveZerosToEnd(array)
        println("Нули в конце: ${array.contentToString()}")
}


fun <T> removeDuplicates(collection: Collection<T>?): Set<T>? {
        return collection?.toSet()
}

fun moveZerosToEnd(array: Array<Int>) {
        var nonZeroIndex = 0
        for (i in array.indices) {
                if (array[i] != 0) {
                        val temp = array[i]
                        array[i] = array[nonZeroIndex]
                        array[nonZeroIndex] = temp
                        nonZeroIndex++
                }
        }
}








