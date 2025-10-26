package lessons.lesson15.homeworks

/**
 * Класс контейнера, вставляющий список материалов поочередно с существующими
 * Новые материалы попадают на индексы 0, 2, 4 и так далее
 */
class AlternatingInsertMaterials : Materials() {

    fun addMaterialsList(newMaterials: List<String>) {
        var index = 0
        for (material in newMaterials) {
            if (index <= materials.size) {
                materials.add(index, material)
                index += 2
            } else {
                materials.add(material)
            }
        }
    }
}
