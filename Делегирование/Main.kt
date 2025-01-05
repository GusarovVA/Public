fun main() {
    //Задание 1. Написать программу перевода числа из десятичной системы в двоичную систему счисления.
    fun decimalToBinary(decimal: Int): String {
        if (decimal == 0) {
            return "0"
        }

        var num = decimal
        val binary = StringBuilder()

        while (num != 0) {
            binary.insert(0, if (num % 2 == 0) '0' else '1')
            num /= 2
        }
        return binary.toString()
    }
    val decimalNumber = 25
    val binaryNumber = decimalToBinary(decimalNumber)
    println("Десятичное число: $decimalNumber")
    println("Двоичное число: $binaryNumber")
    println("-----------------------------------------------------------")

    //Задание 2. Написать программу перевода числа из двоичной системы в десятичную систему счисления.
    fun binaryToDecimal(binary: String): Int {
        var decimal = 0
        var power = 0

        for (i in binary.length - 1 downTo 0) {
            if (binary[i] == '1') {
                decimal += Math.pow(2.0, power.toDouble()).toInt()
            }
            power++
        }
        return decimal
    }
    val binaryNumber1 = "11001"
    val decimalNumber1 = binaryToDecimal(binaryNumber1)
    println("Двоичное число: $binaryNumber1")
    println("Десятичное число: $decimalNumber1")
    println("-----------------------------------------------------------")

    //Задание 3. Написать программу, которая проверяет, является ли слово палиндромом.
    fun isPalindrome(word: String): Boolean {
        val cleanedWord = word
            .lowercase()
            .filter { it.isLetterOrDigit() }
        val reversedWord = cleanedWord.reversed()
        return cleanedWord == reversedWord
    }
    val word1 = "око"
    println("'$word1' - палиндром? ${isPalindrome(word1)}")

    val word2 = "А роза упала на лапу азора"
    println("'$word2' - палиндром? ${isPalindrome(word2)}")

    val word3 = "СТУЛ"
    println("'$word3' - палиндром? ${isPalindrome(word3)}")

    val word4 = "Madam, I'm Adam"
    println("'$word4' - палиндром? ${isPalindrome(word4)}")
}