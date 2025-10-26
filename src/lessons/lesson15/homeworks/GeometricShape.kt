package lessons.lesson15.homeworks

/**
 * Базовый класс для всех геометрических фигур
 */
open class GeometricShape(
    val name: String,
    val color: String
) {
    open fun area(): Double {
        return 0.0
    }

    open fun perimeter(): Double {
        return 0.0
    }

    fun printInfo() {
        println("Фигура: $name, Цвет: $color")
        println("Площадь: ${area()}")
        println("Периметр: ${perimeter()}")
    }
}
