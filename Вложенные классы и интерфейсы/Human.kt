class Human (val name: String) {

    class Head (val body: String = "Голова", val action: String = "думает") {
        override fun toString(): String {
            return "$body - $action"
        }
    }

    class Legs (val body1: String = "Ноги", val action1: String = "ходят") {
        override fun toString(): String {
            return "$body1 - $action1"
        }
    }

    class Hands (val body2: String = "Руки", val action2: String = "поднимают коробку") {
        override fun toString(): String {
            return "$body2 - $action2"
        }
    }
}