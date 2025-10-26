package lessons.lesson15.homeworks

/**
 * Класс для школы
 */
open class School(
    name: String,
    address: String,
    foundedYear: Int,
    override val studentsCount: Int,
    override val teachersCount: Int,
    val hasElementarySchool: Boolean,
    val hasMiddleSchool: Boolean,
    val hasHighSchool: Boolean
) : EducationalInstitution(name, address, foundedYear) {

    val classesCount: Int = studentsCount / 25

    override fun getInfo(): String {
        return super.getInfo() + "\nТип: Школа"
    }

    fun hasFullCycle(): Boolean {
        return hasElementarySchool && hasMiddleSchool && hasHighSchool
    }
}
