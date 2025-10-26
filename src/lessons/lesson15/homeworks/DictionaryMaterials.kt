package lessons.lesson15.homeworks

/**
 * Класс контейнера, работающий со словарем
 * Ключи добавляются в начало в обратном порядке, значения - в конец
 */
class DictionaryMaterials : Materials() {

    fun addMaterialsMap(materialsMap: Map<String, String>) {
        val keys = materialsMap.keys.toList()
        val values = materialsMap.values.toList()

        // Добавляем ключи в начало в обратном порядке
        for (i in keys.indices.reversed()) {
            materials.add(0, keys[i])
        }

        // Добавляем значения в конец
        materials.addAll(values)
    }
}
