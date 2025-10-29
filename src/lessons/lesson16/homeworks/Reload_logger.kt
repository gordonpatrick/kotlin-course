class Logger {

    // Базовый метод - INFO уровень
    fun log(message: String) {
        println("[INFO] $message")
    }

    // Перегрузка 1: с указанием уровня
    fun log(message: String, level: String) {
        when (level) {
            "WARNING" -> println("\u001b[33m[WARNING] $message\u001b[0m")
            "ERROR" -> println("\u001b[37;41m[ERROR] $message\u001b[0m")
            "DEBUG" -> println("[DEBUG] $message")
            else -> println("[$level] $message")
        }
    }

    // Перегрузка 2: список сообщений (все INFO)
    fun log(messagesList: List<String>) {
        for (message in messagesList) {
            println("[INFO] $message")
        }
    }

    // Перегрузка 3: объект Exception
    fun log(exception: Exception) {
        println("\u001b[37;41m[ERROR] ${exception.message}\u001b[0m")
    }
}

fun main() {
    val logger = Logger()

    logger.log("Это информационное сообщение")
    logger.log("Предупреждение о потенциальной проблеме", "WARNING")
    logger.log("Критическая ошибка системы", "ERROR")
    logger.log("Отладочная информация для разработчика", "DEBUG")

    logger.log(listOf(
        "Первое сообщение",
        "Второе сообщение",
        "Третье сообщение"
    ))

    try {
        throw IllegalArgumentException("Деление на ноль недопустимо")
    } catch (e: Exception) {
        logger.log(e)
    }
}
