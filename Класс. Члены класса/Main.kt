import kotlin.math.roundToInt
fun main() {

    //Задание 1. Вертолет.
    val helicopter1 = Helicopter()

    helicopter1.name = "Черная акула"
    helicopter1.speed = 390
    helicopter1.TakeOffWeight = 10800
    helicopter1.FlightAltitude = 5500
    println("Спроектировали вертолет с названием: ${helicopter1.name}, скоростью полета: ${helicopter1.speed} км/ч, взлетным весом: ${helicopter1.TakeOffWeight} кг, высотой полета: ${helicopter1.FlightAltitude} метров")

    //Задание 2. Домашнее животное.
    val pet1 = Pet()

    pet1.type = "Кошка"
    pet1.name = "Мария-Антуанетта"
    pet1.weight = 5
    println("Домашнее животное: ${pet1.type}, кличка: ${pet1.name}, вес: ${pet1.weight} кг")

    val pet2 = Pet()

    pet2.type = "Собака"
    pet2.name = "Дмитрий Васильевич Пес"
    pet2.weight = 12
    println("Домашнее животное: ${pet2.type}, кличка: ${pet2.name}, вес: ${pet2.weight} кг")

    val pet3 = Pet()

    pet3.type = "Корова"
    pet3.name = "Олег"
    pet3.weight = 29
    println("Домашнее животное: ${pet3.type}, кличка: ${pet3.name}, вес: ${pet3.weight} кг")

    //Задание 3. Плавающая точка.
    //Способ 1
    val floatValue = 5.87
    val intValue = floatValue.toInt()
    println("Число до изменения: $floatValue, число после изменения: $intValue")

    //Способ 2
    val floatValue1 = 5.87
    val intValue1 = floatValue1.roundToInt()
    println("Число до изменения: $floatValue1, число после изменения: $intValue1")
}


