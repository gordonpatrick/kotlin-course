package lessons.lesson14.homeworks

/**
 * Объект, представляющий Луну
 */
object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    /**
     * Показывает текущую фазу Луны
     */
    fun showPhase() {
        if (isVisible) {
            println("Луна видна. Текущая фаза: $phase")
        } else {
            println("Луна не видна в данный момент")
        }
    }
}