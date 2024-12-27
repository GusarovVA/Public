class Magnit : Shop() {
    override val name = "Магнит"
    override var address = "ул. Ленина, д. 1"

    private val productsSold = mutableListOf<String>()
    private var revenue = 0.0

    override fun sellProduct(productName: String): Boolean {
        if (productsSold.contains(productName)) {
            return false
        } else {
            productsSold.add(productName)
            revenue += 100.0
            return true
        }
    }

    override fun calculateRevenue(): Double {
        return revenue
    }
}