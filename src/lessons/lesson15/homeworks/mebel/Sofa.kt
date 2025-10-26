package lessons.lesson15.homeworks

/**
 * Класс для дивана
 */
class Sofa(
    material: String,
    price: Double,
    width: Double,
    height: Double,
    depth: Double,
    seatingCapacity: Int,
    val isFoldable: Boolean,
    val hasStorageBox: Boolean,
    val upholsteryType: String
) : SittingFurniture("Диван", material, price, width, height, depth, seatingCapacity, true, true) {

    override val weight: Double = seatingCapacity * 25.0

    fun canBeUsedAsBed(): Boolean {
        return isFoldable
    }
}
