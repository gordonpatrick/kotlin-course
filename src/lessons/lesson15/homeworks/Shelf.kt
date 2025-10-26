package lessons.lesson15.homeworks

/**
 * Класс для полки
 */
class Shelf(
    material: String,
    price: Double,
    width: Double,
    height: Double,
    depth: Double,
    shelvesCount: Int,
    val isWallMounted: Boolean,
    val maxLoadPerShelf: Double
) : StorageFurniture("Полка", material, price, width, height, depth, shelvesCount, false, false) {

    override val weight: Double = shelvesCount * 2.0

    fun getTotalMaxLoad(): Double {
        return maxLoadPerShelf * shelvesCount
    }
}
