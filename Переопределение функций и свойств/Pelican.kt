class Pelican(type: String, override val canFly: Boolean) : Bird(type, canFly) {
    override fun makeSound() {
        println("Пеликан издает пронзительный звук.")
    }
    override fun displayInfo() {
        println("Это пеликан: $type, умение летать: $canFly.")
    }
}