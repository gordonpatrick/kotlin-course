package lessons.lesson19.homeworks

/**
 * Валидатор для целых чисел
 * Проверяет, что число чётное
 */
class OddValidator : Validator<Int> {
    override fun validate(element: Int): Boolean {
        // Проверка, что число чётное
        return element % 2 == 0
    }
}
