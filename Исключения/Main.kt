import java.util.Scanner
fun main() {
    //Задание 1. Создать каталог пользователей вместимостью не более 10 персон. Она будет содержать функцию приветствия greeting().

    class UserCatalog(private val maxCapacity: Int = 10) {
        private val users = mutableListOf<String>()

        fun addUser(userName: String) {
            try{
                if (users.size >= maxCapacity) {
                    throw IllegalStateException("Каталог пользователей переполнен")
                }
                if (userName.isBlank()){
                    throw IllegalArgumentException("Имя пользователя не может быть пустым")
                }
                users.add(userName)
                println("Пользователь $userName добавлен")
            } catch (e: IllegalStateException){
                println("Ошибка при добавлении пользователя: ${e.message}")
            } catch (e: IllegalArgumentException){
                println("Ошибка при добавлении пользователя: ${e.message}")
            }
            finally {
                println("Операция добавления пользователя завершена")
            }

        }
        fun greeting(userName: String) {
            try {
                if (!users.contains(userName)){
                    throw NoSuchElementException("Пользователь $userName не найден в каталоге")
                }
                println("Привет, $userName!")

            } catch (e: NoSuchElementException){
                println("Ошибка при приветствии: ${e.message}")
            }  finally {
                println("Операция приветствия пользователя завершена")
            }
        }
    }

    val catalog = UserCatalog()
    println("Пример корректной работы:")
    catalog.addUser("Алиса")
    catalog.greeting("Алиса")
    catalog.addUser("Вася")
    catalog.greeting("Вася")
    catalog.addUser("Игорь")
    catalog.greeting("Игорь")
    catalog.addUser("Алиса1")
    catalog.greeting("Алиса")
    catalog.addUser("Алиса2")
    catalog.greeting("Алиса")
    catalog.addUser("Алиса3")
    catalog.greeting("Алиса")
    catalog.addUser("Алиса4")
    catalog.greeting("Алиса")
    catalog.addUser("Алиса5")
    catalog.greeting("Алиса")
    catalog.addUser("Алиса6")
    catalog.greeting("Алиса")

    println("Примеры обработки ошибок:")
    catalog.addUser("")
    catalog.addUser("Алиса7")
    catalog.greeting("Алиса")
    catalog.addUser("Алиса8")
    catalog.greeting("John")
    println("-----------------------------------------------------------------------------")

//Задание 2, 3. Необходимо написать функцию createList(list: Array<String>), в которой нужно вводить имя и фамилию, предлагать пользователю разместить созданного члена каталога на ту или иную позицию в каталоге list. Помещать его туда.
   // Программа должна перехватывать исключения на ввод пустого имени и определения места в каталоге, которого не существует. Как пожелание, предлагаем написать свой класс исключений, например, с названием MyException.
class MyException(message: String) : Exception(message)

    fun createList(list: Array<String>) {
        val scanner = Scanner(System.`in`)
        var name = ""
        var surname = ""

        try {
            print("Введите имя: ")
            name = scanner.nextLine()
            if (name.isBlank()) {
                throw MyException("Имя не может быть пустым.")
            }

            print("Введите фамилию: ")
            surname = scanner.nextLine()
            if (surname.isBlank()) {
                throw MyException("Фамилия не может быть пустой.")
            }

            println("Создан пользователь: $name $surname")

            while (true) {
                try {
                    print("Укажите позицию для размещения (от 1 до ${list.size}): ")
                    val position = scanner.nextInt()

                    if (position < 1 || position > list.size) {
                        throw MyException("Указана неверная позиция")
                    }

                    if (list[position - 1].isNotBlank()) {
                        throw MyException("Место $position уже занято.")
                    }

                    list[position - 1] = "$name $surname"
                    println("Пользователь $name $surname размещен на позиции $position")
                    break

                } catch (e: MyException) {
                    println("Ошибка: ${e.message}. Повторите ввод.")
                    scanner.nextLine()

                } catch (e: Exception) {
                    println("Ошибка: неверный формат ввода. Повторите ввод.")
                    scanner.nextLine()
                }
            }

        } catch (e: MyException) {
            println("Ошибка при создании пользователя: ${e.message}")
        } finally {
            println("Операция создания пользователя и размещения в каталоге завершена")
        }
    }

    val userList = Array(5) { "" }
    createList(userList)
    println(userList.contentToString())
    createList(userList)
    println(userList.contentToString())
    createList(userList)
    println(userList.contentToString())
}