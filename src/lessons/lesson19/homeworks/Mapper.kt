package lessons.lesson19.homeworks

/**
 * Интерфейс для преобразования элементов одного типа в другой
 */
interface Mapper<T, R> {
    /**
     * Преобразование одного элемента типа T в элемент типа R
     */
    fun map(element: T): R
    
    /**
     * Преобразование списка элементов типа T в список элементов типа R
     */
    fun mapList(elements: List<T>): List<R>
}
