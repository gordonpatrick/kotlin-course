package lessons.lesson19.homeworks

/**
 * Функция возвращает средний элемент списка, если он существует.
 * Для списков с чётным количеством элементов возвращает null.
 */
fun <T> getMiddleElement(list: List<T>): T? {
    if (list.isEmpty()) return null
    
    // Если размер списка чётный - среднего элемента нет
    if (list.size % 2 == 0) return null
    
    // Для нечётного размера возвращаем элемент в середине
    val middleIndex = list.size / 2
    return list[middleIndex]
}
