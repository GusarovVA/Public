open class Bird(
    val type: String,
    open val canFly: Boolean
) {
    open fun makeSound() {
        println("Простой птичий крик.")
    }

    open fun displayInfo() {
        println("Это птичка: $type, умение летать: $canFly.")
    }
}