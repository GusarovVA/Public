class Sony : Smartphone("Sony") {
    override fun call(number: String): String {
        return super.call(number) + " с телефона Sony"
    }
}
