open class Smartphone(val brand: String) {
    open fun call(number: String): String = "Вызов на номер $number..."
}