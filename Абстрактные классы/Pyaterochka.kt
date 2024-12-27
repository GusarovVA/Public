class Pyaterochka : Shop() {
    override val name = "Пятерочка"
    override var address = "пр-т Мира, д. 10"

    private val productsSold = mutableListOf<String>()
    private var revenue = 0.0

    override fun sellProduct(productName: String): Boolean {
        if (productsSold.contains(productName)) {
            return false
        } else {
            productsSold.add(productName)
            revenue += 150.0
            return true
        }
    }

    override fun calculateRevenue(): Double {
        return revenue
    }
}