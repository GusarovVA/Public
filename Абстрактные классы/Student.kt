class Student(firstName: String, lastName: String, age: Int) : Person(firstName, lastName, age) {
    override fun work() {
        println("$firstName учится в университете.")
    }

    override fun relax() {
        println("$firstName отдыхает, играя в видеоигры.")
    }
}