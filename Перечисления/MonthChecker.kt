class MonthChecker {

    fun getSeasonForMonth(monthName: String): Season? {
        return try {
            val month = Month.valueOf(monthName.uppercase())
            month.season
        } catch (e: IllegalArgumentException) {
            null
        }
    }
}