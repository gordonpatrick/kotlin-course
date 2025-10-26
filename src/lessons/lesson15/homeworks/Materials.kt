package lessons.lesson15.homeworks

/**
 * Абстрактный класс контейнера для материалов
 */
abstract class Materials {
    protected val materials = mutableListOf<String>()

    open fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}
