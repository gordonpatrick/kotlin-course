package lessons.lesson20.homeworks

/**
 * Расширение функция для изменяемого списка
 * Сортирует сам список по возрастанию (ascending=true) или убыванию (ascending=false)
 * Возвращает неизменяемую копию отсортированного списка
 */
fun <T : Comparable<T>> MutableList<T>.sortAndGetImmutable(ascending: Boolean): List<T> {
    if (ascending) {
        sort()
    } else {
        sortDescending()
    }
    return this.toList() // Возвращаем неизменяемую копию
}

// Примеры использования:
fun testSortAndImmutable() {
    val numbers = mutableListOf(5, 2, 8, 1, 9)
    val sorted = numbers.sortAndGetImmutable(true)
    
    println("Отсортированный список по возрастанию: $sorted") // [1, 2, 5, 8, 9]
    println("Исходный список (также отсортирован): $numbers") // [1, 2, 5, 8, 9]
    
    val numbersDesc = mutableListOf(5, 2, 8, 1, 9)
    val sortedDesc = numbersDesc.sortAndGetImmutable(false)
    
    println("Отсортированный список по убыванию: $sortedDesc") // [9, 8, 5, 2, 1]
    println("Исходный список (также отсортирован): $numbersDesc") // [9, 8, 5, 2, 1]
}
