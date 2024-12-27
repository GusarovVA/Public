abstract class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
) {
    // Обычные функции
    fun getFullName(): String {
        return "$firstName $lastName"
    }

    fun isAdult(): Boolean {
        return age >= 18
    }

    // Абстрактные функции
    abstract fun work()
    abstract fun relax()
}