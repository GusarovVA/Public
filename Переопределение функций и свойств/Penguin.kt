class Penguin(type: String) : Bird(type, false) {
    override fun makeSound() {
        println("Пингвин издает пронзительный звук.")
    }

    override fun displayInfo() {
        println("Это пингвин: $type, умение летать: $canFly.")
    }
}