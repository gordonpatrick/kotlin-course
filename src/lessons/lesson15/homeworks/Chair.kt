package lessons.lesson15.homeworks

/**
 * Класс для стула
 */
class Chair(
    material: String,
    price: Double,
    width: Double,
    height: Double,
    depth: Double,
    hasArmrests: Boolean,
    val isAdjustable: Boolean,
    val maxLoadWeight: Double
) : SittingFurniture("Стул", material, price, width, height, depth, 1, hasArmrests, true) {

    override val weight: Double = 5.0

    fun isOfficeChair(): Boolean {
        return isAdjustable && hasArmrests
    }
}
