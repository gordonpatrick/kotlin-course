package lessons.lesson14.homeworks

// Вечеринка
class Party(
    val location: String,
    val attendees: Int
) {
    fun details() {
        println("Вечеринка проходит в: $location")
        println("Количество гостей: $attendees")
    }
}

// Эмоция
class Emotion(
    val type: String,
    val intensity: Int
) {
    fun express() {
        val description = when {
            intensity <= 3 -> "слабая"
            intensity <= 6 -> "умеренная"
            intensity <= 8 -> "сильная"
            else -> "очень сильная"
        }
        println("Эмоция: $type, интенсивность: $description ($intensity/10)")
    }
}

// Луна
object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("Текущая фаза Луны: $phase")
        } else {
            println("Луна сейчас не видна")
        }
    }
}

// Продукт
data class Product(
    val название: String,
    val цена: Double,
    val количество: Int
)

// Концерт
class Concert(
    val группа: String,
    val местоПроведения: String,
    val стоимость: Double,
    val вместимость: Int
) {
    private var проданныеБилеты: Int = 0

    fun информацияОКонцерте() {
        println("Концерт группы: $группа")
        println("Место проведения: $местоПроведения")
        println("Стоимость билета: $стоимость руб.")
        println("Вместимость зала: $вместимость")
        println("Продано билетов: $проданныеБилеты")
        println("Осталось билетов: ${вместимость - проданныеБилеты}")
    }

    fun купитьБилет(): Boolean {
        return if (проданныеБилеты < вместимость) {
            проданныеБилеты++
            println("Билет успешно куплен! Продано билетов: $проданныеБилеты")
            true
        } else {
            println("К сожалению, все билеты проданы")
            false
        }
    }
}

// Полка
class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    private fun getCurrentLoad(): Int {
        return items.sumOf { it.length }
    }

    fun addItem(item: String): Boolean {
        return if (canAccommodate(item)) {
            items.add(item)
            true
        } else {
            false
        }
    }

    fun removeItem(item: String): Boolean {
        return items.remove(item)
    }

    fun canAccommodate(item: String): Boolean {
        return getCurrentLoad() + item.length <= capacity
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun getRemainingCapacity(): Int {
        return capacity - getCurrentLoad()
    }
}

// Стеллаж
class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        return if (shelves.size < maxShelves && !shelves.contains(shelf)) {
            shelves.add(shelf)
            true
        } else {
            false
        }
    }

    fun removeShelf(index: Int): List<String> {
        return if (index in shelves.indices) {
            val removedShelf = shelves.removeAt(index)
            removedShelf.getItems()
        } else {
            emptyList()
        }
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        return shelves.any { it.containsItem(item) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        println("=== Содержимое стеллажа ===")
        println("Всего полок: ${shelves.size}")
        println()

        shelves.forEachIndexed { index, shelf ->
            println("Полка №$index:")
            println("  Вместимость: ${shelf.capacity}")
            println("  Осталось места: ${shelf.getRemainingCapacity()}")
            println("  Предметы: ${shelf.getItems().joinToString(\", \")}")
                println()
            }
        }

        fun advancedRemoveShelf(index: Int): List<String> {
            if (index !in shelves.indices) {
                return emptyList()
            }

            val shelfToRemove = shelves[index]
            val itemsToRedistribute = shelfToRemove.getItems().sortedByDescending { it.length }.toMutableList()
            val unplacedItems = mutableListOf<String>()

            // Пытаемся перераспределить предметы
            for (item in itemsToRedistribute) {
                var placed = false
                for (i in shelves.indices) {
                    if (i != index && shelves[i].canAccommodate(item)) {
                        shelves[i].addItem(item)
                        placed = true
                        break
                    }
                }
                if (!placed) {
                    unplacedItems.add(item)
                }
            }

            // Удаляем полку
            shelves.removeAt(index)

            return unplacedItems.toList()
        }
    }
