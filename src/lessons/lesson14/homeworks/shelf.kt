package lessons.lesson14.homeworks

/**
 * Класс, представляющий полку стеллажа
 * @property capacity максимальная вместимость (сумма букв всех названий предметов)
 */
class Shelf(val capacity: Int) {
    private val items: MutableList<String> = mutableListOf()

    /**
     * Возвращает текущее заполнение полки
     */
    private fun currentLoad(): Int = items.sumOf { it.length }

    /**
     * Возвращает оставшуюся вместимость полки
     */
    fun remainingCapacity(): Int = capacity - currentLoad()

    /**
     * Добавляет предмет на полку
     * @param itemName название предмета
     * @return true если предмет добавлен, false если не хватает места
     */
    fun addItem(itemName: String): Boolean {
        return if (canAccommodate(itemName)) {
            items.add(itemName)
            true
        } else {
            false
        }
    }

    /**
     * Удаляет предмет с полки
     * @param itemName название предмета
     * @return true если предмет удален, false если предмет не найден
     */
    fun removeItem(itemName: String): Boolean {
        return items.remove(itemName)
    }

    /**
     * Проверяет, поместится ли предмет на полку
     * @param itemName название предмета
     * @return true если предмет поместится
     */
    fun canAccommodate(itemName: String): Boolean {
        return currentLoad() + itemName.length <= capacity
    }

    /**
     * Проверяет наличие предмета на полке
     * @param itemName название предмета
     * @return true если предмет есть на полке
     */
    fun containsItem(itemName: String): Boolean {
        return items.contains(itemName)
    }

    /**
     * Возвращает неизменяемый список предметов
     */
    fun getItems(): List<String> = items.toList()
}