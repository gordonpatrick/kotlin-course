// 1. Преобразование строк с иронией
fun ironizePhrase(phrase: String): String {
    if (phrase.startsWith("Я не уверен")) {
        return phrase + ", но моя интуиция говорит об обратном"
    }
    if ("невозможно" in phrase) {
        return phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
    }
    if ("катастрофа" in phrase) {
        return phrase.replace("катастрофа", "интересное событие")
    }
    if (phrase.endsWith("без проблем")) {
        return phrase.substring(0, phrase.length - "без проблем".length) + "с парой интересных вызовов на пути"
    }
    if (phrase.trim().split("\\s+".toRegex()).size == 1) {
        return "Иногда, $phrase, но не всегда"
    }
    return phrase
}

// --- Примеры ---
// println(ironizePhrase("Это невозможно выполнить за один день"))
// println(ironizePhrase("Я не уверен в успехе этого проекта"))
// println(ironizePhrase("Произошла катастрофа на сервере"))
// println(ironizePhrase("Этот код работает без проблем"))
// println(ironizePhrase("Удача"))


// 2. Извлечение даты и времени из строки лога
fun extractDatetime(logLine: String) {
    val rightPart = logLine.substring(logLine.indexOf("->") + 2).trim()
    val parts = rightPart.split(" ")
    println(parts[0]) // дата
    println(parts[1]) // время
}

// --- Пример ---
// extractDatetime("Пользователь вошел в систему -> 2021-12-01 09:48:23")


// 3. Маскирование номера кредитной карты
fun maskCard(card: String): String {
    val digits = card.replace(" ", "")
    val masked = "*".repeat(digits.length - 4) + digits.takeLast(4)
    return masked.windowed(4, 4).joinToString(" ")
}
// println(maskCard("4539 1488 0343 6467")) // **** **** **** 6467


// 4. Форматирование email
fun emailFormat(email: String): String =
    email.replace("@", " [at] ").replace(".", " [dot] ")
// println(emailFormat("username@example.com")) // username [at] example [dot] com


// 5. Извлечение имени файла из пути
fun getFilename(path: String): String =
    path.substringAfterLast('/', path).substringAfterLast('\\')
// println(getFilename("C:/Пользователи/Документы/report.txt")) // report.txt
// println(getFilename("D:/good.themes/dracula.theme")) // dracula.theme


// 6. Создание аббревиатуры из фразы
fun makeAbbreviation(phrase: String): String {
    var res = ""
    for (word in phrase.split(" ")) {
        if (word.isNotEmpty()) {
            res += word[0].uppercase()
        }
    }
    return res
}
// println(makeAbbreviation("Котлин лучший язык программирования")) // КЛЯП
// println(makeAbbreviation("объектно ориентированное программирование")) // ООП
