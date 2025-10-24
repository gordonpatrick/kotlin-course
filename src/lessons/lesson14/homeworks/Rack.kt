package lessons.lesson14.homeworks

/**
 * Класс, представляющий стеллаж с полками
 * @property maxShelves максимальное количество полок
 */
class Rack(private val maxShelves: Int) {
    private val shelves: MutableList<Shelf> = mutableListOf()

    /**
     * Добавляет новую полку в стеллаж
     * @param shelf полка для добавления
     * @return true если полка добавлена, false если стеллаж заполнен или полка уже установлена
     */
    fun addShelf(shelf: Shelf): Boolean {
        return if (shelves.size < maxShelves && !shelves.contains(shelf)) {
            shelves.add(shelf)
            true
        } else {
            false
        }
    }

    /**
     * Удаляет полку по индексу
     * @param index индекс полки
     * @return список предметов с удаленной полки или пустой список если полка не существует
     */
    fun removeShelf(index: Int): List<String> {
        return if (index in shelves.indices) {
            val removedShelf = shelves.removeAt(index)
            removedShelf.getItems()
        } else {
            emptyList()
        }
    }

    /**
     * Добавляет предмет на первую свободную полку
     * @param itemName название предмета
     * @return true если предмет добавлен, false если на всех полках недостаточно места
     */
    fun addItem(itemName: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(itemName)) {
                return true
            }
        }
        return false
    }

    /**
     * Удаляет один предмет с любой полки
     * @param itemName название предмета
     * @return true если предмет удален, false если предмет не найден
     */
    fun removeItem(itemName: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(itemName)) {
                return true
            }
        }
        return false
    }

    /**
     * Проверяет наличие предмета на стеллаже
     * @param itemName название предмета
     * @return true если предмет есть на одной из полок
     */
    fun containsItem(itemName: String): Boolean {
        return shelves.any { it.containsItem(itemName) }
    }

    /**
     * Возвращает неизменяемый список полок
     */
    fun getShelves(): List<Shelf> = shelves.toList()

    /**
     * Выводит содержимое стеллажа в консоль
     */
    fun printContents() {
        println("=".repeat(60))
        println("СОДЕРЖИМОЕ СТЕЛЛАЖА")
        println("=".repeat(60))

        if (shelves.isEmpty()) {
            println("Стеллаж пуст (нет полок)")
            return
        }

        shelves.forEachIndexed { index, shelf ->
            val items = shelf.getItems()
            val currentLoad = items.sumOf { it.length }

            println()
            println("Полка #$index:")
            println("  Вместимость: ${shelf.capacity} символов")
            println("  Занято: $currentLoad символов")
            println("  Свободно: ${shelf.remainingCapacity()} символов")
            println("  Предметы: ${if (items.isEmpty()) "нет предметов" else items.joinToString(", ")}")
        }

        println("=".repeat(60))
    }

    /**
     * Сложное удаление полки с перераспределением предметов
     * @param index индекс полки для удаления
     * @return список предметов, которые не удалось разместить, или пустой список если полки нет
     */
    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }

        // Получаем предметы с удаляемой полки
        val itemsToRedistribute = shelves[index].getItems().toMutableList()

        // Сортируем предметы по длине (от самых длинных к самым коротким)
        itemsToRedistribute.sortByDescending { it.length }

        // Удаляем полку
        shelves.removeAt(index)

        // Список предметов, которые не удалось разместить
        val unplacedItems = mutableListOf<String>()

        // Пытаемся разместить каждый предмет
        for (item in itemsToRedistribute) {
            var placed = false

            // Пробуем разместить на оставшихся полках
            for (shelf in shelves) {
                if (shelf.addItem(item)) {
                    placed = true
                    break
                }
            }

            // Если не удалось разместить, добавляем в список неразмещенных
            if (!placed) {
                unplacedItems.add(item)
            }
        }

        return unplacedItems.toList()
    }
}