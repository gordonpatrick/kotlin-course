package lessons.lesson11.homeworks

// --- Сигнатуры методов ---

// 1. Не принимает аргументов и не возвращает значения
fun voidFunction(): Unit {}

// 2. Принимает два целых числа и возвращает их сумму
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает
fun printString(str: String): Unit {}

// 4. Принимает список целых чисел и возвращает среднее значение типа Double
fun averageOfList(numbers: List<Int>): Double {
    return if (numbers.isNotEmpty()) numbers.average() else 0.0
}

// 5. Принимает nullable строку и возвращает её длину в виде nullable целого числа; доступна только в текущем файле
private fun getStringLength(str: String?): Int? {
    return str?.length
}

// 6. Не принимает аргументов и возвращает nullable вещественное число
fun getNullableDouble(): Double? {
    return null
}

// 7. Принимает nullable список целых чисел, не возвращает значения; доступна только в текущем файле
private fun printNullableList(iList: List<Int>?): Unit {}

// 8. Принимает целое число и возвращает nullable строку
fun intToNullableString(n: Int): String? {
    return n.toString()
}

// 9. Не принимает аргументов и возвращает список nullable строк
fun getNullableStringList(): List<String?> {
    return listOf(null, "пример", null)
}

// 10. Принимает nullable строку и nullable целое число, возвращает nullable булево значение
fun checkNullable(str: String?, n: Int?): Boolean? {
    return if (str != null && n != null) true else null
}

// --- Задачи с рабочим кодом ---

// multiplyByTwo: принимает целое число и возвращает его, умноженное на 2
fun multiplyByTwo(n: Int): Int {
    return n * 2
}

// isEven: принимает целое число и возвращает true, если число чётное, и false в противном случае
fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

// printNumbersUntil: принимает целое число n и выводит числа от 1 до n, если n >= 1; если n < 1, завершает работу
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

// findFirstNegative: принимает список целых чисел и возвращает первое отрицательное число или null
fun findFirstNegative(numbers: List<Int>): Int? {
    for (num in numbers) {
        if (num < 0) return num
    }
    return null
}

// processList: принимает список строк, выводит каждую строку, при встрече с null прекращает выполнение
fun processList(strings: List<String?>) {
    for (s in strings) {
        if (s == null) return
        println(s)
    }
}
