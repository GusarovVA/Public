abstract class Shop {

    abstract val name: String
    abstract var address: String

    // Обычная функция
    fun open() {
        println("Магазин $name открыт по адресу: $address")
    }

    // Абстрактные функции
    abstract fun sellProduct(productName: String): Boolean
    abstract fun calculateRevenue(): Double
}