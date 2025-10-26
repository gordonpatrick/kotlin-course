package lessons.lesson15.homeworks

/**
 * Класс для многоугольников
 */
open class Polygon(
    name: String,
    color: String,
    val numberOfSides: Int,
    val sides: List<Double>
) : GeometricShape(name, color) {

    override fun perimeter(): Double {
        return sides.sum()
    }

    fun isRegular(): Boolean {
        return sides.all { it == sides[0] }
    }
}
