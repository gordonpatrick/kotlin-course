package lessons.lesson15.homeworks

import kotlin.math.sqrt

/**
 * Класс для треугольника
 */
class Triangle(
    color: String,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Polygon("Треугольник", color, 3, listOf(sideA, sideB, sideC)) {

    override fun area(): Double {
        val s = perimeter() / 2
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    fun isEquilateral(): Boolean {
        return sideA == sideB && sideB == sideC
    }

    fun isIsosceles(): Boolean {
        return sideA == sideB || sideB == sideC || sideA == sideC
    }
}
