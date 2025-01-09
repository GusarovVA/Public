fun main() {

        //Задание 1. Дана строка «Занятие». Вывести на экран символы, составляющие данную строку.
        val stroke1 = "Занятие"
        stroke1.forEachIndexed { index, char -> println("$index символ строки: $char") }
        println("---------------------------------")

        //Задание 2. Нужно осуществить проверку номера телефона. Он должен начинаться с +7 и содержать 10 цифр, не считая +7. Если телефон верно введен, выведите true, иначе false.
        fun isValidPhoneNumber(phoneNumber: String): Boolean {
                if (!phoneNumber.startsWith("+7")) {
                        return false
                }

                val digitsOnly = phoneNumber.substring(2) // Убираем "+7"
                if (digitsOnly.length != 10) {
                        return false
                }
                for (char in digitsOnly){
                        if (!char.isDigit()){
                                return false
                        }
                }

                return true
        }
        val phone1 = "+79123456789"
        val phone2 = "79123456789"
        val phone3 = "+7912345678"
        val phone4 = "+791234567890"
        val phone5 = "+89123456789"

        println("$phone1: ${isValidPhoneNumber(phone1)}")
        println("$phone2: ${isValidPhoneNumber(phone2)}")
        println("$phone3: ${isValidPhoneNumber(phone3)}")
        println("$phone4: ${isValidPhoneNumber(phone4)}")
        println("$phone5: ${isValidPhoneNumber(phone5)}")
        println("---------------------------------")

        //Задание 3. Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке.
        val stroke2 = "Мама мыла раму"
        val revers = stroke2.reversed()
        revers.forEachIndexed { index, char -> println("$index символ строки: $char") }
        println("---------------------------------")

        //Задание 4. Дана строка «kotlin2023course». Подсчитать количество содержащихся в ней цифр.
        val stroke3 = "kotlin2023course"
        val digit = stroke3.filter { it.isDigit() }
        println("Количество цифр в строке:")
        println(digit.lastIndex + 1)
}






