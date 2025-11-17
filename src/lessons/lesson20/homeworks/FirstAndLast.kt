package lessons.lesson19.homeworks

/**
 * Расширение функция для массива чисел
 * Возвращает пару из первого и последнего элемента
 * Если массив пуст - возвращает пару из null значений
 */
fun IntArray.firstAndLast(): Pair<Int?, Int?> {
    return if (isEmpty()) {
        Pair(null, null)
    } else {
        Pair(first(), last())
    }
}

fun DoubleArray.firstAndLast(): Pair<Double?, Double?> {
    return if (isEmpty()) {
        Pair(null, null)
    } else {
        Pair(first(), last())
    }
}

fun FloatArray.firstAndLast(): Pair<Float?, Float?> {
    return if (isEmpty()) {
        Pair(null, null)
    } else {
        Pair(first(), last())
    }
}

// Примеры использования:
fun testFirstAndLast() {
    println(intArrayOf(1, 2, 3, 4, 5).firstAndLast()) // (1, 5)
    println(intArrayOf().firstAndLast()) // (null, null)
    println(doubleArrayOf(1.5, 2.5, 3.5).firstAndLast()) // (1.5, 3.5)
}
