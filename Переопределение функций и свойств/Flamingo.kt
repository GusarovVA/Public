class Flamingo(type: String) : Bird(type, true) {
    override fun makeSound() {
        println("Фламинго издает пронзительный звук.")
    }
    override fun displayInfo(){
        println("Это фламинго: $type, умение летать: $canFly.")
    }
}