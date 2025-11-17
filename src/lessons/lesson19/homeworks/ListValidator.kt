package lessons.lesson19.homeworks

/**
 * Валидатор для списков с элементами типа Number
 * Проверяет, что ни один элемент не null и не равен 0.0
 */
class ListValidator<T : Number> : Validator<List<T?>> {
    override fun validate(element: List<T?>): Boolean {
        // Проверка, что ни один элемент не является null
        if (element.any { it == null }) {
            return false
        }
        
        // Проверка, что ни один элемент, приведённый к Double, не равен 0.0
        if (element.any { it?.toDouble() == 0.0 }) {
            return false
        }
        
        return true
    }
}
