fun main() {

    //Задание 1. Факториал
    var input: String?
    var number: Int? = null
    var factorial: Long = 1L

    while (number == null) {
        print("Введите целое, положительное число для расчета факториала: ")
        input = readLine()

        try {
            number = input?.toInt()
            if (number != null && number < 0) {
                println("Ошибка, пожалуйста введите положительное число.")
                number = null
            }

        } catch (e: NumberFormatException) {
            println("Неверный ввод. Пожалуйста, введите целое число.")
        }
    }

    var z = 2
    while (z <= number!!) {
        factorial *= z
        z++
    }

    if (number == 0) {
        factorial = 1
    }
    println("Факториал числа: $number равен: $factorial")

    //Задание 2. Стоимость конфет
    println("Стоимость 1 кг. конфет составляет 800 руб.")
    var cost = 800
    val cost1 = cost
    var weight = 1
    do {
        cost+=cost1
        weight++
        println("Стоимость $weight кг. конфет составляет $cost руб.")
    }   while (weight < 10)

    //Задание 3. Список чисел
    var A = 2
    val B = 6
    var N1 = 0
    var current = A
    print("Список чисел: ")
    do {
        print("$current ")
        current++
        N1++
    } while (current <= B)
    println()
    println("Количество чисел равно $N1")

    //Задание 4. Остаток
    var N = 15
    var num = N

    if (N <= 0) {
        println("Значение не может равнятся нулю, введите другое число.")
        return
    }

    println("Остатки и промежуточные значения:")
    while (num > 0) {
    val remainder = num % 10
    println("Исходное значение: $num. Остаток: $remainder")
    num /= 10
    }
    println("Цифры, обозначающие $N, были разделены, а их остаток был рассчитан")

    //Задание 5. Манипуляции с числами
    var i = 1
    while (i <= 20) {
        if (i % 2 != 0) { //Нечетные не выводим
            i++
            continue
        }
        if (i % 4 == 0) { //Если делятся на 4 без остатка, умножаем на 2 и выводим
            println(i * 2)
        } else {
            println(i)
        }
        if (i == 19) { //Прерываем программу, если равно 19
            break
        }
        i++
    }

    //Задание 6. Проценты по вкладу
    var deposit = 350.0
    val months = 9
    val interestRate = 0.07
    var currentMonth = 1

    while (currentMonth <= months) {
        val interest = deposit * interestRate
        deposit += interest
        println("Месяцы $currentMonth: Дипозит = $deposit")
        currentMonth++
    }

    println("Итоговый дипозит за $months месяцев: $deposit")
}

