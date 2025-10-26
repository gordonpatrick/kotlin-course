package lessons.lesson15.homeworks

import kotlin.math.PI

/**
 * Класс для круга
 */
class Circle(
    color: String,
    val radius: Double
) : GeometricShape("Круг", color) {

    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }

    fun diameter(): Double {
        return 2 * radius
    }
}
