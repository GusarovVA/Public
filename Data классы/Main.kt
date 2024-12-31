import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun main() {
        //Задание 1. Написать программу по продаже билетов в кино. Пользователь покупает билет, в который заносятся данные названия фильма, места и времени начала сеанса. Проданные билеты заносятся в массив архива. По желанию можно вывести все проданные билеты на фильм.
        val cinema = Cinema()

        while (true) {
                println("\nМеню:")
                println("1. Купить билет")
                println("2. Посмотреть проданные билеты по фильму")
                println("3. Посмотреть все проданные билеты")
                println("4. Выход")

                print("Выберите действие: ")
                val choice = readLine()

                when (choice) {
                        "1" -> {
                                val availableMovies = cinema.getAvailableMovies()
                                println("Доступные фильмы:")
                                availableMovies.forEachIndexed { index, movie ->
                                        println("${index + 1}. $movie")
                                }

                                var movieChoice: Int? = null
                                while (movieChoice == null || movieChoice !in 1..availableMovies.size) {
                                        print("Выберите номер фильма: ")
                                        movieChoice = readLine()?.toIntOrNull()

                                        if (movieChoice == null || movieChoice !in 1..availableMovies.size) {
                                                println("Некорректный выбор фильма, попробуйте еще раз.")
                                        }
                                }

                                val movieTitle = availableMovies[movieChoice - 1]
                                print("Введите номер места: ")
                                val seat = readLine() ?: ""
                                while (true) {
                                        print("Введите время начала сеанса в формате 'ГГГГ-ММ-ДД ЧЧ:ММ': ")
                                        val showtimeStr = readLine() ?: ""
                                        try {
                                                val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
                                                val showtime = LocalDateTime.parse(showtimeStr, formatter)
                                                cinema.sellTicket(movieTitle, seat, showtime)
                                                break
                                        } catch (e: DateTimeParseException) {
                                                println("Неверный формат времени. Пожалуйста, используйте формат 'ГГГГ-ММ-ДД ЧЧ:ММ'.")
                                        }
                                }
                        }
                        "2" -> {
                                print("Введите название фильма для просмотра проданных билетов: ")
                                val movieTitle = readLine() ?: ""
                                cinema.displaySoldTickets(movieTitle)
                        }
                        "3" -> cinema.displayAllTickets()
                        "4" -> {
                                println("Спасибо за использование нашей системы!")
                                break
                        }
                        else -> println("Неверный выбор. Пожалуйста, выберите действие из меню.")
                }
        }
}