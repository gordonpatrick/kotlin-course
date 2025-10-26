package lessons.lesson15.homeworks

/**
 * Класс для мебели, на которой сидят
 */
open class SittingFurniture(
    name: String,
    material: String,
    price: Double,
    width: Double,
    height: Double,
    depth: Double,
    val seatingCapacity: Int,
    val hasArmrests: Boolean,
    val hasBackrest: Boolean
) : Furniture(name, material, price, width, height, depth) {

    val seatHeight: Double = height * 0.45

    override fun getDescription(): String {
        return super.getDescription() + "\nТип: Мебель для сидения\nМест для сидения: $seatingCapacity"
    }
}
