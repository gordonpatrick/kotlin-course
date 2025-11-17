package lessons.lesson20.homeworks

/**
 * Расширение функция для шифрования строки
 * Сдвигает каждый символ на заданное количество позиций вперед в таблице Unicode
 */
fun String.encrypt(base: Int): String {
    return this.map { char ->
        (char.code + base).toChar()
    }.joinToString("")
}

/**
 * Расширение функция для расшифровки строки
 * Сдвигает каждый символ на заданное количество позиций назад в таблице Unicode
 */
fun String.decrypt(base: Int): String {
    return this.map { char ->
        (char.code - base).toChar()
    }.joinToString("")
}

// Примеры использования:
fun testEncryption() {
    val originalString = "Hello"
    val shift = 3
    
    val encrypted = originalString.encrypt(shift)
    println("Исходная строка: $originalString")
    println("Зашифрованная строка: $encrypted")
    
    val decrypted = encrypted.decrypt(shift)
    println("Расшифрованная строка: $decrypted")
    println("Совпадает с исходной: ${originalString == decrypted}") // true
    
    println()
    
    val russian = "Привет"
    val encryptedRussian = russian.encrypt(5)
    val decryptedRussian = encryptedRussian.decrypt(5)
    
    println("Исходная: $russian")
    println("Зашифрованная: $encryptedRussian")
    println("Расшифрованная: $decryptedRussian")
    println("Совпадает: ${russian == decryptedRussian}") // true
}
