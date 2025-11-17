package lessons.lesson19.homeworks

/**
 * Функция меняет местами ключи и значения в словаре
 */
fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { (key, value) -> value to key }
}
