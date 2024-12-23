class Box (val width: Double = 10.0, val height: Double = 8.5, val depth: Double = 3.0) {

    fun boxVolume (): Double {
        return width * height * depth
    }
}