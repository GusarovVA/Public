// 3. Data класс Person
data class Person(val name: String, val age: Int, val position: String)


fun main() {
        // 1. Функция подсчета вхождений элементов в массиве
        val array = arrayOf(2, 4, 7, 1, 2, 4)
        val counts = countOccurrences(array)
        println("Количество вхождений: $counts")

        val array2 = arrayOf("a","b","a","c","b","a")
        val counts2 = countOccurrences(array2)
        println("Количество вхождений (строки): $counts2")

        val array3 = arrayOf(1.1,2.2,1.1,3.3,2.2)
        val counts3 = countOccurrences(array3)
        println("Количество вхождений (double): $counts3")


        // 2. Функция удаления элементов из map по значению
        val people = mutableMapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Петр", 5 to "Анна")
        println("Исходная коллекция: $people")
        val input = "Петр"
        removeByValue(people, input)
        println("Коллекция после удаления: $people")
        val input2 = "Анна"
        removeByValue(people, input2)
        println("Коллекция после удаления2: $people")


        // 3. Создание и вывод personHashMap
        val personHashMap = mutableMapOf(
                1 to Person("Иван", 30, "Инженер"),
                2 to Person("Мария", 25, "Дизайнер"),
                3 to Person("Петр", 35, "Менеджер")
        )
        println("personHashMap: $personHashMap")
}

// 1. Функция подсчета вхождений элементов в массиве
fun <K> countOccurrences(array: Array<K>): Map<K, Int> {
        val counts = mutableMapOf<K, Int>()
        for (element in array) {
                counts[element] = counts.getOrDefault(element, 0) + 1
        }
        return counts
}

// 2. Функция удаления элементов из map по значению
fun removeByValue(map: MutableMap<Int, String>, value: String) {
        map.values.removeIf { it == value }
}








