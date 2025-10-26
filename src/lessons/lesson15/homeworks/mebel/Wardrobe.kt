package lessons.lesson15.homeworks

/**
 * Класс для шкафа
 */
class Wardrobe(
    material: String,
    price: Double,
    width: Double,
    height: Double,
    depth: Double,
    shelvesCount: Int,
    hasDoors: Boolean,
    val hasHangingRod: Boolean,
    val doorsCount: Int,
    val hasMirror: Boolean
) : StorageFurniture("Шкаф", material, price, width, height, depth, shelvesCount, hasDoors, false) {

    override val weight: Double = getVolume() / 1000

    fun isWardrobeCloset(): Boolean {
        return hasHangingRod && height > 180
    }
}
