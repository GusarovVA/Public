class Полиция (name: String, phoneNumber: String) : СлужбыЭкстренногоРеагирования(name, phoneNumber), Description {

    override fun activity() {
        println("После вызова по номеру $phoneNumber, $name прибыла на вызов и приступила к задержанию подозреваемого")
    }

    override fun getDescription() {
        println("Служба экстренного реагирования - $name, экстренный номер телефона: $phoneNumber")
    }
}
