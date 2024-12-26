fun main() {

        //Задание 1. Доступ к паролю карты.

        val bankCard = BankCard("1234567890", "9876")

        println("Номер карты: ${bankCard.cardNumber}")

        // Попытка получить код карты без пароля
        println("Код карты (без пароля): ${bankCard.getCardCode("")}")

        // Получение кода карты с правильным паролем
        println("Код карты (с паролем): ${bankCard.getCardCode("1234")}")
        println("___________________________________________________________________")

        //Задание 2. Манипуляции с переменной (операторы присваивания).

        var a = 4
        a += 7
        a -= 4
        a *= 2
        a %= 3
        println("Ответ: $a")
        println("___________________________________________________________________")

        //Задание 3. Вывести число, полученное при перестановке цифр исходного числа.

        println("Введите двузначное число")
        val number = readLine()!!.toInt()

        if (number < 10 || number > 99) {
                throw IllegalArgumentException("Число должно быть двузначным.")
        }

        val tens = number / 10
        val units = number % 10
        val reversedNumber = units * 10 + tens

        println("Результат: $reversedNumber")
}
