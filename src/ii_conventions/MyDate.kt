package ii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) : Int{
        if (year != other.year) return year - other.year
        if (month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(public val start: MyDate, public val end: MyDate)
