package lessons.lesson14.homeworks

/**
 * Класс, представляющий концерт
 * @property band название группы
 * @property venue место проведения
 * @property ticketPrice стоимость билета
 * @property capacity вместимость зала
 */
class Concert(
    val band: String,
    val venue: String,
    val ticketPrice: Double,
    val capacity: Int
) {
    private var soldTickets: Int = 0

    /**
     * Выводит информацию о концерте
     */
    fun info() {
        println("=== Информация о концерте ===")
        println("Группа: $band")
        println("Место проведения: $venue")
        println("Стоимость билета: $ticketPrice руб.")
        println("Вместимость зала: $capacity")
        println("Продано билетов: $soldTickets")
        println("Доступно билетов: ${capacity - soldTickets}")
    }

    /**
     * Покупка билета на концерт
     * @return true если билет успешно куплен, false если билеты распроданы
     */
    fun buyTicket(): Boolean {
        return if (soldTickets < capacity) {
            soldTickets++
            println("Билет успешно куплен! Номер билета: $soldTickets")
            true
        } else {
            println("К сожалению, все билеты распроданы")
            false
        }
    }
}