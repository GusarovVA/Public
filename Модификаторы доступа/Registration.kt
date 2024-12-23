class Registration(private var email: String, private var _password: String) {

    // Геттер для email
    val upperEmail: String
        get() = email.toUpperCase()

    // Сеттер для password
    var password: String
        get() = _password
        set(value) {
            if (value.length < 6) {
                throw IllegalArgumentException("Пароль должен содержать минимум 6 символов")
            } else {
                _password = value
            }
        }

    init {
        require(_password.length >= 6) { "Начальный пароль должен содержать минимум 6 символов" }
    }
}