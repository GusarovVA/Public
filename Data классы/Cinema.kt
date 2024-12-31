import java.time.LocalDateTime

class Cinema {
    private val archive = mutableListOf<Ticket>()
    private val availableMovies = listOf(
        "Мстители: Финал",
        "Король Лев",
        "Форсаж 10",
        "Человек-паук: Через вселенные",
        "Интерстеллар"
    )

    fun getAvailableMovies() = availableMovies

    fun sellTicket(movieTitle: String, seat: String, showtime: LocalDateTime): Ticket {
        val ticket = Ticket(movieTitle, seat, showtime)
        archive.add(ticket)
        println("Билет успешно продан!")
        return ticket
    }

    fun displaySoldTickets(movieTitle: String) {
        println("Проданные билеты на фильм '$movieTitle':")
        val foundTickets = archive.filter { it.movieTitle == movieTitle }
        if (foundTickets.isNotEmpty()) {
            foundTickets.forEach { println(it) }
        } else {
            println("На этот фильм еще нет проданных билетов.")
        }
    }

    fun displayAllTickets() {
        if (archive.isEmpty()) {
            println("Еще нет проданных билетов")
        } else {
            println("Все проданные билеты:")
            archive.forEach { println(it) }
        }
    }
}