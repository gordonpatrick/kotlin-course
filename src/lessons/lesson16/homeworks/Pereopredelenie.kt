open class Animal {
    open fun makeSound(): String = "This animal makes no sound."
}

class Dog : Animal() {
    override fun makeSound(): String = "\u001b[33mBark\u001b[0m"  // Желтый
}

class Cat : Animal() {
    override fun makeSound(): String = "\u001b[35mMeow\u001b[0m"  // Фиолетовый
}

class Bird : Animal() {
    override fun makeSound(): String = "\u001b[36mTweet\u001b[0m"  // Голубой
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())

    println("Звуки животных:")
    for (animal in animals) {
        val className = animal::class.simpleName
        println("$className: ${animal.makeSound()}")
    }
}
// Геометрические фигуры
import kotlin.math.PI
import kotlin.math.sin

abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}

class Square(val side: Double) : Shape() {
    override fun area(): Double = side * side
}

class Triangle(val sideA: Double, val sideB: Double, val angleDegrees: Double) : Shape() {
    override fun area(): Double {
        val angleRadians = Math.toRadians(angleDegrees)
        return 0.5 * sideA * sideB * sin(angleRadians)
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(6.0, 8.0, 90.0),
        Circle(3.0),
        Square(7.0),
        Triangle(5.0, 5.0, 60.0)
    )

    println("Площади геометрических фигур:")
    for (shape in shapes) {
        val className = shape::class.simpleName
        println("$className: ${"%.2f".format(shape.area())}")
    }
}
//Принтер
abstract class Printer {
    abstract fun printText(text: String)
}

class LaserPrinter : Printer() {
    override fun printText(text: String) {
        val words = text.split(" ")
        print("Лазерный принтер: ")
        for (word in words) {
            print("\u001b[30;47m$word\u001b[0m ")
        }
        println()
    }
}

class InkjetPrinter : Printer() {
    override fun printText(text: String) {
        val colorPairs = listOf(
            31 to 43,  // Красный на желтом
            32 to 44,  // Зеленый на синем
            33 to 45,  // Желтый на фиолетовом
            34 to 46,  // Синий на голубом
            35 to 47,  // Фиолетовый на белом
            36 to 41   // Голубой на красном
        )

        val words = text.split(" ")
        print("Струйный принтер: ")
        for ((index, word) in words.withIndex()) {
            val (textColor, bgColor) = colorPairs[index % colorPairs.size]
            print("\u001b[${textColor};${bgColor}m$word\u001b[0m ")
        }
        println()
    }
}

fun main() {
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    val shortText = "Привет мир это тест"
    val longText = "Это очень длинный текст для тестирования струйного принтера который должен выводить слова разными цветами"

    laserPrinter.printText(shortText)
    inkjetPrinter.printText(shortText)
    inkjetPrinter.printText(longText)
}
