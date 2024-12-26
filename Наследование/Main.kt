fun main() {

        //Задание 1. Животные кушают.

        val cat = Cat()
        cat.name = "Дуся"
        cat.weight = 5
        println(cat.toEats())
        cat.toEats()
        println("__________________________________")

        val dog = Dog()
        dog.name = "Дружок"
        dog.weight = 12
        println(dog.toEats())
        dog.toEats()
        println("__________________________________")

        val animal = Animal()
        animal.eats()
        println("__________________________________")

        //Задание 2. Телефоны.

        val nokia = Nokia()
        println(nokia.call("+1234567890"))

        val sony = Sony()
        println(sony.call("+0987654321"))

        val iphone = Iphone()
        println(iphone.call("+89148506473"))
        println("__________________________________")

        //Задание 3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23. Вывести на экран элементы массива, которые делятся на 5 на цело.

        val array = intArrayOf(3, 67, 1, 55, 65, 89, 23)

        for (element in array) {
                if (element % 5 == 0) {
                        println("Элемент массива, который делятся на 5 нацело:")
                        println(element)
                }
        }

}
