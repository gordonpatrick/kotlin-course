package lessons.lesson14.homeworks

/**
 * Класс, представляющий эмоцию
 * @property type тип эмоции (например, "радость", "грусть", "гнев")
 * @property intensity интенсивность эмоции от 1 до 10
 */
class Emotion(
    val type: String,
    val intensity: Int
) {
    /**
     * Выражает эмоцию в зависимости от типа и интенсивности
     */
    fun express() {
        val level = when {
            intensity <= 3 -> "слабая"
            intensity <= 6 -> "умеренная"
            intensity <= 9 -> "сильная"
            else -> "очень сильная"
        }
        println("Испытывается $level эмоция: $type (интенсивность: $intensity)")
    }
}