package lessons.lesson15.homeworks

/**
 * Класс контейнера, вставляющий материал на дно (индекс 0)
 */
class BottomInsertMaterials : Materials() {

    override fun addMaterial(material: String) {
        materials.add(0, material)
    }
}
