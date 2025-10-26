package lessons.lesson15.homeworks

/**
 * Класс для мебели для хранения вещей
 */
open class StorageFurniture(
    name: String,
    material: String,
    price: Double,
    width: Double,
    height: Double,
    depth: Double,
    val shelvesCount: Int,
    val hasDoors: Boolean,
    val hasDrawers: Boolean
) : Furniture(name, material, price, width, height, depth) {

    val storageVolume: Double = getVolume() * 0.8

    override fun getDescription(): String {
        return super.getDescription() + "\nТип: Мебель для хранения\nПолок: $shelvesCount"
    }
}
