class Nokia : Smartphone("Nokia") {
    override fun call(number: String): String {
        return super.call(number) + " с телефона Nokia"
    }
}