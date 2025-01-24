fun main() {
        val people = mapOf(
                1 to "Иван",
                2 to "Петр",
                3 to "Анна",
                4 to "Мария",
                5 to "Светлана",
                6 to "Григорий",
                7 to "Ольга",
                8 to "Наталья",
                9 to "Александр",
                10 to "Георгий",
                15 to "Ирина",
        )

        // 1. Фильтрация по ключу меньше 5
        val filteredByKeys = people.filterKeys { it < 5 }
        println("Отфильтровано по ключу < 5: $filteredByKeys")
        println("-----------------------------------------------------------------------------------")

        // 2. Фильтрация по значениям, оканчивающимся на "а"
        val filteredByValueEndsA = people.filterValues { it.endsWith("а") }
        println("Отфильтровано по значениям, оканчивающимся на 'а': $filteredByValueEndsA")
        println("-----------------------------------------------------------------------------------")

        // 3. Фильтрация по значениям, начинающимся на "Г"
        val filteredByValueStartsWithG = people.filterValues { it.startsWith("Г") }
        println("Отфильтровано по значениям, начинающимся на 'Г': $filteredByValueStartsWithG")
        println("-----------------------------------------------------------------------------------")


        val prizeMap = mapOf(
                1 to 10,
                5 to 25,
                15 to 30,
                25 to 15,
                35 to 25,
                40 to 10,
                45 to 30,
                55 to 20,
                60 to 5
        )


        // 4. Фильтрация prizeMap по ключу, оканчивающемуся на "5" и проценту > 20
        val filteredPrizeMap = prizeMap.filter { (key, value) -> key.toString().endsWith("5") && value > 20 }
        println("Отфильтровано по ключу, оканчивающемуся на '5' и проценту > 20: $filteredPrizeMap")
}








