package lessons.lesson10.homeworks

fun main() {
    println("=== Задачи на работу со словарём ===")

    // 1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа
    val emptyImmutableMap: Map<Int, Int> = emptyMap()
    println("1. Пустой неизменяемый словарь: $emptyImmutableMap")

    // 2. Создайте словарь, инициализированный несколькими парами "ключ-значение",
    // где ключи - float, а значения - double
    val floatToDoubleMap: Map<Float, Double> = mapOf(
        1.5f to 2.7,
        3.14f to 6.28,
        0.5f to 1.0
    )
    println("2. Словарь Float->Double: $floatToDoubleMap")

    // 3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки
    val mutableIntToStringMap: MutableMap<Int, String> = mutableMapOf()
    println("3. Изменяемый словарь Int->String (пустой): $mutableIntToStringMap")

    // 4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение"
    mutableIntToStringMap[1] = "один"
    mutableIntToStringMap[2] = "два"
    mutableIntToStringMap[3] = "три"
    mutableIntToStringMap.put(4, "четыре")
    println("4. После добавления элементов: $mutableIntToStringMap")

    // 5. Извлеките значение, используя ключ. Попробуйте получить значение с ключом, которого нет
    val existingValue = mutableIntToStringMap[2]
    val nonExistingValue = mutableIntToStringMap[10]
    println("5. Значение по ключу 2: $existingValue")
    println("5. Значение по ключу 10 (которого нет): $nonExistingValue")

    // Альтернативный способ с значением по умолчанию
    val safeValue = mutableIntToStringMap.getOrDefault(10, "не найдено")
    println("5. Безопасное получение значения по ключу 10: $safeValue")

    // 6. Удалите определенный элемент из изменяемого словаря по его ключу
    mutableIntToStringMap.remove(3)
    println("6. После удаления элемента с ключом 3: $mutableIntToStringMap")

    // 7. Создайте словарь (ключи Double, значения Int) и выведите в цикле результат деления ключа на значение
    val doubleToIntMap: Map<Double, Int> = mapOf(
        10.0 to 2,
        15.5 to 3,
        20.0 to 0, // для проверки деления на ноль
        7.5 to 5
    )
    println("7. Результаты деления:")
    for ((key, value) in doubleToIntMap) {
        if (value == 0) {
            println("   $key / $value = бесконечность")
        } else {
            println("   $key / $value = ${key / value}")
        }
    }

    // 8. Измените значение для существующего ключа в изменяемом словаре
    mutableIntToStringMap[2] = "новое значение для двух"
    println("8. После изменения значения для ключа 2: $mutableIntToStringMap")

    // 9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы
    val map1 = mapOf(1 to "a", 2 to "b")
    val map2 = mapOf(3 to "c", 4 to "d")
    val combinedMap: MutableMap<Int, String> = mutableMapOf()

    for ((key, value) in map1) {
        combinedMap[key] = value
    }
    for ((key, value) in map2) {
        combinedMap[key] = value
    }
    println("9. Объединённый словарь: $combinedMap")

    // 10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел
    val stringToIntListMap: MutableMap<String, List<Int>> = mutableMapOf()
    stringToIntListMap["четные"] = listOf(2, 4, 6, 8)
    stringToIntListMap["нечетные"] = listOf(1, 3, 5, 7)
    stringToIntListMap["простые"] = listOf(2, 3, 5, 7, 11)
    println("10. Словарь строки->списки чисел: $stringToIntListMap")

    // 11. Создайте словарь с изменяемыми множествами строк
    val intToMutableStringSetMap: MutableMap<Int, MutableSet<String>> = mutableMapOf()
    intToMutableStringSetMap[1] = mutableSetOf("яблоко", "банан")
    intToMutableStringSetMap[2] = mutableSetOf("морковь", "капуста")

    // Получаем значение по ключу и добавляем в множество новую строку
    val fruitSet = intToMutableStringSetMap[1]
    fruitSet?.add("апельсин")
    println("11. Множество по ключу 1 после добавления: ${intToMutableStringSetMap[1]}")

    // 12. Создайте словарь, где ключами будут пары чисел
    val pairToStringMap: Map<Pair<Int, Int>, String> = mapOf(
        Pair(1, 2) to "первая пара",
        Pair(5, 3) to "вторая пара",
        Pair(4, 5) to "третья пара",
        Pair(7, 8) to "четвертая пара"
    )

    println("12. Поиск пар, содержащих цифру 5:")
    for ((pair, value) in pairToStringMap) {
        if (pair.first == 5 || pair.second == 5) {
            println("   Найдена пара $pair со значением: $value")
        }
    }

    println("\n=== Задачи на подбор оптимального типа для словаря ===")

    // 13. Словарь библиотека: Ключи - автор книги, значения - список книг
    val library: Map<String, List<String>> = mapOf(
        "Толстой Л.Н." to listOf("Война и мир", "Анна Каренина", "Воскресение"),
        "Достоевский Ф.М." to listOf("Преступление и наказание", "Идиот", "Братья Карамазовы"),
        "Пушкин А.С." to listOf("Евгений Онегин", "Капитанская дочка", "Дубровский")
    )
    println("13. Библиотека:")
    library.forEach { (author, books) ->
        println("   $author: $books")
    }

    // 14. Справочник растений
    val plantGuide: Map<String, List<String>> = mapOf(
        "Цветы" to listOf("Роза", "Тюльпан", "Нарцисс", "Пион"),
        "Деревья" to listOf("Дуб", "Береза", "Сосна", "Ель"),
        "Кустарники" to listOf("Сирень", "Жасмин", "Смородина", "Крыжовник")
    )
    println("\n14. Справочник растений:")
    plantGuide.forEach { (type, plants) ->
        println("   $type: $plants")
    }

    // 15. Четвертьфинал: команды и игроки
    val quarterFinals: Map<String, List<String>> = mapOf(
        "Спартак" to listOf("Иванов", "Петров", "Сидоров", "Козлов"),
        "Динамо" to listOf("Смирнов", "Попов", "Волков", "Соколов"),
        "ЦСКА" to listOf("Лебедев", "Новиков", "Морозов", "Павлов"),
        "Зенит" to listOf("Волошин", "Кузнецов", "Белов", "Орлов")
    )
    println("\n15. Четвертьфинал:")
    quarterFinals.forEach { (team, players) ->
        println("   $team: $players")
    }

    // 16. Курс лечения: даты и препараты
    val treatmentCourse: Map<String, List<String>> = mapOf(
        "2024-01-15" to listOf("Аспирин", "Витамин C"),
        "2024-01-16" to listOf("Аспирин", "Парацетамол", "Витамин C"),
        "2024-01-17" to listOf("Парацетамол", "Витамин C", "Пробиотик"),
        "2024-01-18" to listOf("Витамин C", "Пробиотик")
    )
    println("\n16. Курс лечения:")
    treatmentCourse.forEach { (date, medications) ->
        println("   $date: $medications")
    }

    // 17. Словарь путешественника: страны -> города -> места
    val travelGuide: Map<String, Map<String, List<String>>> = mapOf(
        "Франция" to mapOf(
            "Париж" to listOf("Эйфелева башня", "Лувр", "Нотр-Дам"),
            "Лион" to listOf("Старый город", "Базилика Нотр-Дам", "Парк де ла Тет д'Ор")
        ),
        "Италия" to mapOf(
            "Рим" to listOf("Колизей", "Ватикан", "Пантеон"),
            "Флоренция" to listOf("Уффици", "Понте Веккьо", "Дуомо")
        ),
        "Россия" to mapOf(
            "Москва" to listOf("Красная площадь", "Третьяковская галерея", "Большой театр"),
            "Санкт-Петербург" to listOf("Эрмитаж", "Петропавловская крепость", "Исаакиевский собор")
        )
    )
    println("\n17. Словарь путешественника:")
    travelGuide.forEach { (country, cities) ->
        println("   $country:")
        cities.forEach { (city, places) ->
            println("     $city: $places")
        }
    }
}