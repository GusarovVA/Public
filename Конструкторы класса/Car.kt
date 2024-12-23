class Car (val weight: Int, var speed: Int) {

    fun startMoving() {
        if (speed > 0) {
            println("Машина массой $weight кг движется со скоростью: $speed")
        }
    }

    fun stopMoving() {
        if(speed == 0) {
            println("Машина массой $weight кг не движется")
        }
    }
}