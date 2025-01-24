fun main() {
        // 1. Группировка слов по первому символу
        val words = listOf("apple", "banana", "apricot", "kiwi", "blueberry", "cherry")
        val groupedByFirstChar = words.groupBy { it.first() }
        println("Сгруппировано по первому символу: $groupedByFirstChar")
        println("-------------------------------------------------------------------------")

        // 2. Группировка строк по длине
        val strings = listOf("apple", "banana", "kiwi", "orange", "grape", "plum")
        val groupedByLength = strings.groupBy { it.length }
        println("Сгруппировано по длине строки: $groupedByLength")
        println("-------------------------------------------------------------------------")

        // 3. Группировка телефонов по году выпуска
        val phoneToYear = listOf(
                "Nexus One" to 2010,
                "Pixel 2" to 2017,
                "Pixel 4a" to 2020,
                "iPhone 4" to 2010,
                "iPhone X" to 2017,
                "Galaxy Note 8" to 2017,
                "Galaxy S11" to 2020
        )
        val groupedByYear = phoneToYear.groupBy { it.second }
        println("Сгруппировано по году выпуска: $groupedByYear")

        val groupedByYear2 = phoneToYear.groupBy({ it.second }, {it.first})
        println("Сгруппировано по году выпуска (только имена): $groupedByYear2")
}








