fun main() {

        //Задание 1. Написать абстрактный класс Shop(магазин). Написать несколько свойств класса, две абстрактные функции и одну обычную, характеризующих работу магазина. Создать два класса наследника магазин Magnit и Pyaterochka. Написать реализацию функций.
        val magnit = Magnit()
        val pyaterochka = Pyaterochka()

        magnit.open()
        pyaterochka.open()

        magnit.sellProduct("Молоко")
        pyaterochka.sellProduct("Хлеб")

        println("Доход Магнита: ${magnit.calculateRevenue()}")
        println("Доход Пятерочки: ${pyaterochka.calculateRevenue()}")

        //Задание 2.  Написать абстрактный класс Person. В конструкторе передать несколько свойств, например, имени, фамилии, возраста. Написать абстрактныефункции, характеризующие деятельность объекта класса и одну или несколько обычных. Создать два класса наследника Student и Employee. Написать реализацию функций.
        val student = Student("Иван", "Иванов", 20)
        val employee = Employee("Марина", "Петрова", 30)

        println(student.getFullName())
        student.work()
        student.relax()

        println(employee.getFullName())
        employee.work()
        employee.relax()

        //Задание 3. Единицы длины пронумерованы следующим образом: 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в метрах (дробное число). Найти длину отрезка в тех величинах, под номером которых они находятся.
        print("Введите номер единицы длины (1-5): ")
        val unitNumber = readLine()?.toIntOrNull() ?: error("Неверный ввод!")

        require(unitNumber in 1..5) { "Номер единицы длины должен быть в диапазоне от 1 до 5!" }

        print("Введите длину отрезка в метрах: ")
        val lengthInMeters = readLine()?.toDoubleOrNull() ?: error("Неверный ввод!")

        val lengthInUnits = when (unitNumber) {
                1 -> lengthInMeters * 10     // Дециметры
                2 -> lengthInMeters / 1000   // Километры
                3 -> lengthInMeters          // Метры
                4 -> lengthInMeters * 1000   // Миллиметры
                5 -> lengthInMeters * 100    // Сантиметры
                else -> throw IllegalStateException("Неизвестная единица длины!")
        }

        println("Длина отрезка в выбранных единицах: ${"%.6f".format(lengthInUnits)}")
}
