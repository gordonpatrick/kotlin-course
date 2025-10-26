package lessons.lesson15.homeworks

/**
 * Класс для университета
 */
class University(
    name: String,
    address: String,
    foundedYear: Int,
    override val studentsCount: Int,
    override val teachersCount: Int,
    val facultiesCount: Int,
    val hasPostgraduate: Boolean,
    val hasDoctorate: Boolean
) : EducationalInstitution(name, address, foundedYear) {

    val departmentsCount: Int = facultiesCount * 5

    override fun getInfo(): String {
        return super.getInfo() + "\nТип: Университет\nФакультетов: $facultiesCount"
    }

    fun getAccreditationLevel(): String {
        return when {
            hasDoctorate -> "Высший уровень (докторантура)"
            hasPostgraduate -> "Средний уровень (аспирантура)"
            else -> "Базовый уровень"
        }
    }
}
