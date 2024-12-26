class Iphone : Smartphone("Iphone") {
    override fun call(number: String): String {
        return super.call(number) + " с телефона Iphone"
    }
}