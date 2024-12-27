class Employee(firstName: String, lastName: String, age: Int) : Person(firstName, lastName, age) {
    override fun work() {
        println("$firstName работает в офисе.")
    }

    override fun relax() {
        println("$firstName отдыхает, читая книгу.")
    }
}