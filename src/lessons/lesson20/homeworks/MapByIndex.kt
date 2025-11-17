package lessons.lesson19.homeworks

/**
 * Расширение функция для nullable словаря
 * Принимает целое число как индекс
 * Возвращает новый словарь где:
 * - Ключи из оригинального словаря приведены к строке через toString()
 * - Значения - элементы списков по указанному индексу, если он существует, иначе null
 */
fun <K, T> Map<K, List<T?>?>?.getByIndex(index: Int): Map<String, T?>? {
    if (this == null) return null
    
    return this.mapKeys { it.key.toString() }
        .mapValues { (_, valueList) ->
            // Если список null или индекс выходит за границы - null
            if (valueList == null || index < 0 || index >= valueList.size) {
                null
            } else {
                valueList[index]
            }
        }
}

// Примеры использования:
fun testMapByIndex() {
    val map = mapOf(
        1 to listOf("a", "b", "c"),
        2 to listOf("x", "y", "z"),
        3 to null
    )
    
    val result = map.getByIndex(0)
    println("Значения по индексу 0: $result")
    // {1=a, 2=x, 3=null}
    
    val result2 = map.getByIndex(1)
    println("Значения по индексу 1: $result2")
    // {1=b, 2=y, 3=null}
    
    val result3 = map.getByIndex(5)
    println("Значения по индексу 5 (не существует): $result3")
    // {1=null, 2=null, 3=null}
    
    val nullMap: Map<String, List<String>?>? = null
    println("Результат для null словаря: ${nullMap.getByIndex(0)}")
    // null
}
