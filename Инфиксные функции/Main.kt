fun main() {

    println("Задание 1. Написать четыре инфиксных функции: сложения, вычитания, умножения и деления. В функции main применить их для разных операндов, результат вывести в консоль")
    val a = 2
    val b = 4
    val result1 = a sum b
    println("Сумма $a и $b равна $result1")
    val result2 = a dif b
    println("Разность $a и $b равна $result2")
    val result3 = a mult b
    println("Произведение $a и $b равно $result3")
    val result4 = a div b
    println("Частное $a и $b равно $result4")
    println("----------------------------------------------------")

    println("Задание 2. Написать класс Person. В конструктор он принимает свойство имени. Внутри класса есть инфиксная функция say, которая будет передавать сообщение объекта этого класса, переданное в параметр. Сообщение внутри функции выводится с помощью println.")
    val person1 = Person ("Ира")
    person1 say "Доброе утро!"
    val person2 = Person ("Дима")
    person2 say "Хорошего дня!"
    println("----------------------------------------------------")

    println("Задание 3. Создать data класс Point(точка), характеризующее место объекта. Написать две инфиксные функции, расширяющие этот класс. Они характеризуют расположение одной точки относительно другой – isAbove() – описывает ситуацию, когда одна точка выше другой, isRightOf – описывает ситуацию, когда одна точка правее другой. В функции main создать два объекта Point и сравнить их расположение, применив вышеуказанные функции.")
    val point1 = Point(3, 5)
    val point2 = Point(1, 2)
    println("Точка $point1 выше точки $point2: ${point1 isAbove point2}")
    println("Точка $point2 выше точки $point1: ${point2 isAbove point1}")
    println("Точка $point1 правее точки $point2: ${point1 isRightOf point2}")
    println("Точка $point2 правее точки $point1: ${point2 isRightOf point1}")
}
infix fun Int.sum (b: Int) : Int {
    return this + b
}
infix fun Int.dif (b: Int) : Int {
    return this - b
}
infix fun Int.mult (b: Int) : Int {
    return this * b
}
infix fun Int.div (b: Int) : Double {
   if (b == 0){
       throw ArithmeticException("Делить на ноль нельзя")
   }
    return this.toDouble() / b
}

class Person (val name: String) {
    infix fun say (massage: String){
        println("$name говорит: $massage")
    }
}
data class Point(val x: Int, val y: Int)

infix fun Point.isAbove(other: Point): Boolean {
    return this.y > other.y
}

infix fun Point.isRightOf(other: Point): Boolean {
    return this.x > other.x
}