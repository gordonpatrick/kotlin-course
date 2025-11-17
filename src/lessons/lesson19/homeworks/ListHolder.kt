package lessons.lesson19.homeworks

/**
 * Класс для хранения списка элементов типа T
 */
class ListHolder<T> {
    private val elements = mutableListOf<T>()
    
    /**
     * Добавление нового элемента в список
     */
    fun addElement(element: T) {
        elements.add(element)
    }
    
    /**
     * Получение всех элементов в виде неизменяемого списка
     */
    fun getAllElements(): List<T> {
        return elements.toList()
    }
}
