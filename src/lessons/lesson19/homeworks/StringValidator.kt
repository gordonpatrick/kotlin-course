package lessons.lesson19.homeworks

/**
 * Валидатор для строк
 * Проверяет, что строка не null, не пустая и не состоит из одних пробелов
 */
class StringValidator : Validator<String?> {
    override fun validate(element: String?): Boolean {
        // Проверка на null
        if (element == null) return false
        
        // Проверка на пустую строку
        if (element.isEmpty()) return false
        
        // Проверка, что строка не состоит из одних пробелов
        if (element.isBlank()) return false
        
        return true
    }
}
