package lessons.lesson15.homeworks

/**
 * Класс для колледжа (среднее профессиональное образование)
 */
class College(
    name: String,
    address: String,
    foundedYear: Int,
    override val studentsCount: Int,
    override val teachersCount: Int,
    val specializations: List<String>,
    val hasPracticeBase: Boolean
) : EducationalInstitution(name, address, foundedYear) {

    val programsCount: Int = specializations.size

    override fun getInfo(): String {
        return super.getInfo() + "\nТип: Колледж\nСпециальностей: $programsCount"
    }

    fun getSpecializationsList(): String {
        return specializations.joinToString(", ")
    }
}
