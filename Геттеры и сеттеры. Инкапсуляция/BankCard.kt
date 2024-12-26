class BankCard {

    val cardNumber: String
    private var _cardCode: String? = null

    constructor(cardNumber: String, cardCode: String) {
        this.cardNumber = cardNumber
        this._cardCode = cardCode
    }

    fun getCardCode(password: String): String? {
        if (password == "1234") {
            return _cardCode
        } else {
            println("Неверный пароль")
            return null
        }
    }
}