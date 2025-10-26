package lessons.lesson15.homeworks

/**
 * Базовый класс для учебных заведений
 */
open class EducationalInstitution(
    val name: String,
    val address: String,
    val foundedYear: Int
) {
    open val studentsCount: Int = 0
    open val teachersCount: Int = 0

    open fun getInfo(): String {
        return "Учебное заведение: $name\nАдрес: $address\nГод основания: $foundedYear"
    }

    fun printInfo() {
        println(getInfo())
        println("Количество учеников: $studentsCount")
        println("Количество преподавателей: $teachersCount")
    }
}
