package lessons.lesson15.homeworks

/**
 * Класс контейнера, автоматически сортирующий все материалы в алфавитном порядке
 */
class SortedMaterials : Materials() {

    override fun addMaterial(material: String) {
        materials.add(material)
        materials.sort()
    }
}
