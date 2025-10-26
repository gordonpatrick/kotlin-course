package lessons.lesson15.homeworks

/**
 * Класс для четырехугольника
 */
open class Quadrilateral(
    name: String = "Четырехугольник",
    color: String,
    val side1: Double,
    val side2: Double,
    val side3: Double,
    val side4: Double
) : Polygon(name, color, 4, listOf(side1, side2, side3, side4)) {

    fun isRectangle(): Boolean {
        return side1 == side3 && side2 == side4
    }

    fun isSquare(): Boolean {
        return isRegular()
    }
}
