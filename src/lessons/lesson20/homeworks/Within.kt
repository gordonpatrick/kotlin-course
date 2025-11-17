package lessons.lesson20.homeworks

import kotlin.math.absoluteValue

/**
 * Расширение функция для Number
 * Проверяет, что текущее число отклоняется от эталонного не более допустимого значения
 * @param other число для сравнения
 * @param deviation максимально допустимое отклонение
 * @return true если разница не превышает допустимое отклонение
 */
fun Number.within(other: Number, deviation: Number): Boolean {
    val difference = (this.toDouble() - other.toDouble()).absoluteValue
    return difference <= deviation.toDouble()
}

// Примеры использования:
fun testWithin() {
    // Целые числа
    println(10.within(12, 2)) // true (|10-12| = 2 <= 2)
    println(10.within(12, 1)) // false (|10-12| = 2 > 1)
    
    // Дробные числа
    println(3.14.within(3.1, 0.05)) // true (|3.14-3.1| = 0.04 <= 0.05)
    println(3.14.within(3.1, 0.03)) // false (|3.14-3.1| = 0.04 > 0.03)
    
    // Float числа
    println(5.5f.within(5.6f, 0.2f)) // true
    
    // Смешанные типы
    println(100.within(95, 6)) // true
    println(100.within(95, 4)) // false
    
    // Long и Double
    println(1000L.within(1050, 60)) // true
    println(1000L.within(1050, 40)) // false
}
