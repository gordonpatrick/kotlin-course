package lessons.lesson15.homeworks

/**
 * Базовый класс для мебели
 */
open class Furniture(
    val name: String,
    val material: String,
    val price: Double,
    val width: Double,
    val height: Double,
    val depth: Double
) {
    open val weight: Double = 0.0

    open fun getVolume(): Double {
        return width * height * depth
    }

    open fun getDescription(): String {
        return "Мебель: $name\nМатериал: $material\nРазмеры: ${width}x${height}x${depth} см"
    }

    fun printInfo() {
        println(getDescription())
        println("Цена: $price руб.")
        println("Вес: $weight кг")
    }
}
