import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class Ticket(
    val movieTitle: String,
    val seat: String,
    val showtime: LocalDateTime
) {
    override fun toString(): String {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        return "Фильм: $movieTitle, Место: $seat, Время: ${showtime.format(formatter)}"
    }
}