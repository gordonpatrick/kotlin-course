package lessons.lesson12.homeworks

fun main() {
    // Тестовые данные для задач на приведение коллекции к значению
    val numbers = listOf(1, 5, 10, 15, 20, 25)
    val emptyList = emptyList<Int>()
    val textList = listOf("Привет", "мир", null, "Kotlin", null, "программирование")
    val shortList = listOf(1, 2, 3)

    // Задачи на приведение коллекции к значению
    println("=== Задачи на приведение коллекции к значению ===")

    // 1. Проверить, что размер коллекции больше 5 элементов
    val isLargeCollection = numbers.size > 5
    println("Размер коллекции больше 5: $isLargeCollection")

    // 2. Проверить, что коллекция пустая
    val isEmptyCollection = emptyList.isEmpty()
    println("Коллекция пустая: $isEmptyCollection")

    // 3. Проверить, что коллекция не пустая
    val isNotEmptyCollection = numbers.isNotEmpty()
    println("Коллекция не пустая: $isNotEmptyCollection")

    // 4. Взять элемент по индексу или создать значение если индекса не существует
    val elementOrDefault = numbers.getOrElse(10) { -1 }
    println("Элемент по индексу 10 или -1: $elementOrDefault")

    // 5. Собрать коллекцию в строку
    val joinedString = numbers.joinToString(", ")
    println("Коллекция в строку: $joinedString")

    // 6. Посчитать сумму всех значений
    val totalSum = numbers.sum()
    println("Сумма всех значений: $totalSum")

    // 7. Посчитать среднее
    val averageValue = numbers.average()
    println("Среднее значение: $averageValue")

    // 8. Взять максимальное число
    val maxNumber = numbers.maxOrNull()
    println("Максимальное число: $maxNumber")

    // 9. Взять минимальное число
    val minNumber = numbers.minOrNull()
    println("Минимальное число: $minNumber")

    // 10. Взять первое число или null
    val firstNumber = numbers.firstOrNull()
    println("Первое число: $firstNumber")

    // 11. Проверить что коллекция содержит элемент
    val containsElement = numbers.contains(15)
    println("Коллекция содержит 15: $containsElement")

    println("\n=== Задачи на обработку коллекций ===")

    val ages = listOf(16, 20, 25, 18, 35, 40, 15, 22, 28, 45, 12)
    val mixedNumbers = listOf(6, 9, 12, 15, 18, 21, 24, 27, 30, 4, 8, 10)
    val words = listOf("apple", "banana", "orange", "grape", "kiwi", "mango", "peach")

    // 1. Отфильтровать коллекцию по диапазону 18-30
    val filteredByRange = ages.filter { it in 18..30 }
    println("Возрасты 18-30: $filteredByRange")

    // 2. Выбрать числа, которые не делятся на 2 и 3 одновременно
    val notDivisibleBy2And3 = mixedNumbers.filterNot { it % 2 == 0 && it % 3 == 0 }
    println("Не делятся на 2 и 3 одновременно: $notDivisibleBy2And3")

    // 3. Очистить текстовую коллекцию от null элементов
    val cleanedTextList = textList.filterNotNull()
    println("Очищено от null: $cleanedTextList")

    // 4. Преобразовать текстовую коллекцию в коллекцию длин слов
    val wordLengths = words.map { it.length }
    println("Длины слов: $wordLengths")

    // 5. Преобразовать текстовую коллекцию в мапу (ключи - перевёрнутые слова, значения - длина слов)
    val reversedWordsMap = words.associate { it.reversed() to it.length }
    println("Мапа перевёрнутых слов: $reversedWordsMap")

    // 6. Отсортировать список в алфавитном порядке
    val sortedWords = words.sorted()
    println("Отсортированные слова: $sortedWords")

    // 7. Взять первые 3 элемента списка
    val firstThree = words.take(3)
    println("Первые 3 элемента: $firstThree")

    // 8. Распечатать квадраты элементов списка
    println("Квадраты чисел:")
    numbers.forEach { println("$it^2 = ${it * it}") }

    // 9. Группировать список по первой букве слов
    val groupedByFirstLetter = words.groupBy { it.first() }
    println("Группировка по первой букве: $groupedByFirstLetter")

    // 10. Очистить список от дублей
    val numbersWithDuplicates = listOf(1, 2, 3, 2, 4, 1, 5, 3)
    val uniqueNumbers = numbersWithDuplicates.distinct()
    println("Уникальные числа: $uniqueNumbers")

    // 11. Отсортировать список по убыванию
    val sortedDescending = numbers.sortedDescending()
    println("По убыванию: $sortedDescending")

    // 12. Взять последние 3 элемента списка
    val lastThree = words.takeLast(3)
    println("Последние 3 элемента: $lastThree")

    println("\n=== Отдельные функции ===")

    // Задача 24
    println("Задача 24 - Характеристика числовой коллекции:")
    println(characterizeCollection(emptyList())) // Пусто
    println(characterizeCollection(listOf(1, 2, 3))) // Короткая
    println(characterizeCollection(listOf(0, 1, 2, 3, 4, 5))) // Стартовая
    println(characterizeCollection(listOf(5000, 5001))) // Массивная
    println(characterizeCollection(listOf(8, 10, 12))) // Сбалансированная
    println(characterizeCollection(listOf(12345, 67890, 13579))) // Клейкая
    println(characterizeCollection(listOf(-15, -20, -5, -30, -12, -8))) // Отрицательная
    println(characterizeCollection(listOf(2000, 3000, 1500, 4000, 2500))) // Положительная
    println(characterizeCollection(listOf(3, 14, 1, 2, 5, 6))) // Пи***тая
    println(characterizeCollection(listOf(100, 200, 300, 400, 500))) // Уникальная

    // Задача 25
    println("\nЗадача 25 - Анализ учебных оценок:")
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println("Исходные оценки: $grades")
    println("Обработанные оценки: ${analyzeGrades(grades)}")

    // Задача 26
    println("\nЗадача 26 - Создание каталога по первой букве:")
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка",
        "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница",
        "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник",
        "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    val catalog = createCatalogByFirstLetter(list)
    println("Каталог по первой букве:")
    catalog.forEach { (letter, items) ->
        println("$letter: ${items.take(3)}...") // показываем только первые 3 для краткости
    }

    // Задача 27
    println("\nЗадача 27 - Подсчёт средней длины слов:")
    println(calculateAverageWordLength(list))

    // Задача 28
    println("\nЗадача 28 - Категоризация чисел:")
    val numbersList = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println("Исходные числа: $numbersList")
    println("Категоризация: ${categorizeNumbers(numbersList)}")

    // Задача 29
    println("\nЗадача 29 - Поиск первого подходящего элемента:")
    val agesList = listOf(22, 18, 30, 45, 17, null, 60)
    val minAge = 18
    println("Возрасты: $agesList")
    println("Первый возраст больше $minAge: ${findFirstSuitableAge(agesList, minAge)}")
}

// Задача 24: Характеристика числовой коллекции
fun characterizeCollection(collection: Collection<Int>): String {
    return when {
        collection.isEmpty() -> "Пусто"
        collection.size < 5 -> "Короткая"
        collection.firstOrNull() == 0 -> "Стартовая"
        collection.sum() > 10000 -> "Массивная"
        collection.average() == 10.0 -> "Сбалансированная"
        collection.joinToString("").length == 20 -> "Клейкая"
        collection.maxOrNull() ?: 0 < -10 -> "Отрицательная"
        collection.minOrNull() ?: 0 > 1000 -> "Положительная"
        collection.contains(3) && collection.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

// Задача 25: Анализ учебных оценок
fun analyzeGrades(grades: List<Int>): List<Int> {
    return grades
        .filter { it >= 60 }
        .sorted()
        .take(3)
}

// Задача 26: Создание каталога по первой букве
fun createCatalogByFirstLetter(list: List<String>): Map<Char, List<String>> {
    return list
        .map { it.lowercase() }
        .groupBy { it.first() }
}

// Задача 27: Подсчёт средней длины слов в списке
fun calculateAverageWordLength(list: List<String>): String {
    val average = list
        .map { it.length }
        .average()
    return "Средняя длина слов: %.2f".format(average)
}

// Задача 28: Категоризация чисел
fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    return numbers
        .distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "четные" else "нечетные" }
}

// Задача 29: Поиск первого подходящего элемента
fun findFirstSuitableAge(ages: List<Int?>, minAge: Int): Int? {
    return ages
        .filterNotNull()
        .firstOrNull { it > minAge }
}
