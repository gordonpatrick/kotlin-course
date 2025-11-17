package lessons.lesson19.homeworks

/**
 * Интерфейс для валидации элементов
 */
interface Validator<T> {
    /**
     * Проверяет валидность элемента
     * @return true если элемент валиден, false иначе
     */
    fun validate(element: T): Boolean
}
