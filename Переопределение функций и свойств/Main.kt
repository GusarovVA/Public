fun main() {
        //Задание 1. Класс Bird. Создать несколько классов наследников, которые могут переопределять свойства и функции класса – родителя.
        val bird1 = Bird("Generic Bird", true)
        bird1.makeSound()
        bird1.displayInfo()
        println("-----------------------------------------------------------------")

        val pelican1 = Pelican("Pelecaniformes", true)
        pelican1.makeSound()
        pelican1.displayInfo()
        println("-----------------------------------------------------------------")

        val flamingo1 = Flamingo("Phoenicopteriformes")
        flamingo1.makeSound()
        flamingo1.displayInfo()
        println("-----------------------------------------------------------------")

        val penguin1 = Penguin("Sphenisciformes")
        penguin1.makeSound()
        penguin1.displayInfo()
        println("-----------------------------------------------------------------")

        //Задание 2. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
        fun findLongestWord(words: Array<String>): Pair<String?, Int> {
                if (words.isEmpty()) {
                        return Pair(null, 0)
                }

                var longestWord: String? = null
                var maxLength = 0

                for (word in words) {
                        if (word.length > maxLength) {
                                maxLength = word.length
                                longestWord = word
                        }
                }

                return Pair(longestWord, maxLength)
        }

        val words1 = arrayOf("яблоко", "дыня", "апельсин", "пауртериканская дикая груша")
        val (longest1, length1) = findLongestWord(words1)
        println("Самое длинное слово: $longest1, количество символов: $length1")
        println("-----------------------------------------------------------------")

        //Задание 3.Дана строка «ПриВет, кАк деЛа». Необходимо найти символы, находящиеся в верхнем регистре, вывести их и посчитать их количество.
        val inputString = "ПриВет, кАк деЛа"
        var uppercaseCount = 0
        val uppercaseChars = mutableListOf<Char>()

        for (char in inputString) {
                if (char.isUpperCase()) {
                        uppercaseChars.add(char)
                        uppercaseCount++
                }
        }

        println("Заглавные буквы: ${uppercaseChars.joinToString(", ")}")
        println("Количество заглавных букв: $uppercaseCount")
}