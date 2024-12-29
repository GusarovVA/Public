class МЧС (name: String, phoneNumber: String) : СлужбыЭкстренногоРеагирования(name, phoneNumber), Description {

    override fun activity() {
        println("После вызова по номеру $phoneNumber, $name прибыла на вызов и приступила к тушению пожара")
    }

    override fun getDescription() {
        println("Служба экстренного реагирования - $name, экстренный номер телефона: $phoneNumber")
    }
}