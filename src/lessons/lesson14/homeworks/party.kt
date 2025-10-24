package lessons.lesson14.homeworks

/**
 * Класс, описывающий вечеринку
 * @property location место проведения вечеринки
 * @property attendees количество гостей
 */
class Party(
    val location: String,
    val attendees: Int
) {
    /**
     * Выводит информацию о вечеринке
     */
    fun details() {
        println("Вечеринка проходит в: $location")
        println("Количество гостей: $attendees")
    }
}