/ Решение задания - Работа с массивами, списками и множествами
// Пакет: lessons/lesson09/homeworks

package lessons.lesson09.homeworks

fun main() {
    println("=== Работа с массивами Array ===")

    // 1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5
    val intArray = arrayOf(1, 2, 3, 4, 5)
    println("1. Массив из 5 целых чисел: ${intArray.contentToString()}")

    // 2. Создайте пустой массив строк размером 10 элементов
    val stringArray = Array(10) { "" }
    println("2. Пустой массив строк размером 10: ${stringArray.contentToString()}")

    // 3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента
    val doubleArray = Array(5) { index -> index * 2.0 }
    println("3. Массив Double с удвоенными индексами: ${doubleArray.contentToString()}")

    // 4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3
    val intArrayWithLoop = Array(5) { 0 }
    for (i in intArrayWithLoop.indices) {
        intArrayWithLoop[i] = i * 3
    }
    println("4. Массив Int (индекс * 3): ${intArrayWithLoop.contentToString()}")

    // 5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками
    val nullableStringArray = arrayOf<String?>(null, "Hello", "World")
    println("5. Массив nullable строк: ${nullableStringArray.contentToString()}")

    // 6. Создайте массив целых чисел и скопируйте его в новый массив в цикле
    val originalArray = arrayOf(10, 20, 30, 40, 50)
    val copiedArray = Array(originalArray.size) { 0 }
    for (i in originalArray.indices) {
        copiedArray[i] = originalArray[i]
    }
    println("6. Оригинальный массив: ${originalArray.contentToString()}")
    println("   Скопированный массив: ${copiedArray.contentToString()}")

    // 7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычтя значения одного из другого
    val array1 = arrayOf(10, 15, 20, 25, 30)
    val array2 = arrayOf(5, 3, 8, 5, 10)
    val differenceArray = Array(array1.size) { 0 }
    for (i in array1.indices) {
        differenceArray[i] = array1[i] - array2[i]
    }
    println("7. Первый массив: ${array1.contentToString()}")
    println("   Второй массив: ${array2.contentToString()}")
    println("   Разность массивов: ${differenceArray.contentToString()}")

    // 8. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Решите задачу через цикл while
    val searchArray = arrayOf(1, 3, 5, 7, 9, 5, 11)
    var index = 0
    var foundIndex = -1
    while (index < searchArray.size) {
        if (searchArray[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }
    println("8. Поиск элемента 5 в массиве ${searchArray.contentToString()}: индекс = $foundIndex")

    // 9. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано "чётное" или "нечётное"
    val numberArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("9. Проверка на четность:")
    for (number in numberArray) {
        val evenOdd = if (number % 2 == 0) "чётное" else "нечётное"
        println("   $number - $evenOdd")
    }

    // 10. Создай функцию, которая принимает массив строк и строку для поиска
    val stringSearchArray = arrayOf("Hello World", "Kotlin Programming", "Array Example", "String Search")
    val searchString = "Kotlin"
    findStringInArray(stringSearchArray, searchString)

    println("\n=== Работа со списками List ===")

    // 11. Создайте пустой неизменяемый список целых чисел
    val emptyList: List<Int> = emptyList()
    println("11. Пустой неизменяемый список: $emptyList")

    // 12. Создайте неизменяемый список строк, содержащий три элемента
    val immutableStringList = listOf("Hello", "World", "Kotlin")
    println("12. Неизменяемый список строк: $immutableStringList")

    // 13. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5
    val mutableIntList = mutableListOf(1, 2, 3, 4, 5)
    println("13. Изменяемый список целых чисел: $mutableIntList")

    // 14. Имея изменяемый список целых чисел, добавьте в него новые элементы
    mutableIntList.addAll(listOf(6, 7, 8))
    println("14. После добавления элементов 6, 7, 8: $mutableIntList")

    // 15. Имея изменяемый список строк, удалите из него определенный элемент
    val mutableStringList = mutableListOf("Hello", "World", "Kotlin", "Programming")
    mutableStringList.remove("World")
    println("15. После удаления 'World': $mutableStringList")

    // 16. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран
    val intList = listOf(10, 20, 30, 40, 50)
    println("16. Вывод элементов списка:")
    for (element in intList) {
        println("   $element")
    }

    // 17. Создайте список строк и получите из него второй элемент, используя его индекс
    val stringList = listOf("Первый", "Второй", "Третий", "Четвертый")
    val secondElement = stringList[1]
    println("17. Второй элемент списка: $secondElement")

    // 18. Имея изменяемый список чисел, измените значение элемента на определенной позиции
    val mutableNumberList = mutableListOf(10, 20, 30, 40, 50)
    println("18. До изменения: $mutableNumberList")
    mutableNumberList[2] = 999
    println("    После изменения элемента с индексом 2: $mutableNumberList")

    // 19. Создайте два списка строк и объедините их в один новый список с помощью циклов
    val firstList = listOf("Kotlin", "Java")
    val secondList = listOf("Python", "JavaScript")
    val combinedList = mutableListOf<String>()
    for (element in firstList) {
        combinedList.add(element)
    }
    for (element in secondList) {
        combinedList.add(element)
    }
    println("19. Объединенный список: $combinedList")

    // 20. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл
    val numberList = listOf(45, 12, 78, 23, 89, 5, 67)
    var min = numberList[0]
    var max = numberList[0]
    for (number in numberList) {
        if (number < min) min = number
        if (number > max) max = number
    }
    println("20. Список: $numberList")
    println("    Минимальный элемент: $min, Максимальный элемент: $max")

    // 21. Имея список целых чисел, создайте новый список, содержащий только четные числа используя цикл
    val allNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val evenNumbers = mutableListOf<Int>()
    for (number in allNumbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }
    println("21. Исходный список: $allNumbers")
    println("    Четные числа: $evenNumbers")

    println("\n=== Работа с Множествами Set ===")

    // 22. Создайте пустое неизменяемое множество целых чисел
    val emptySet: Set<Int> = emptySet()
    println("22. Пустое неизменяемое множество: $emptySet")

    // 23. Создайте неизменяемое множество целых чисел, содержащее три различных элемента
    val immutableIntSet = setOf(1, 2, 3)
    println("23. Неизменяемое множество целых чисел: $immutableIntSet")

    // 24. Создайте изменяемое множество строк и инициализируйте его несколькими значениями
    val mutableStringSet = mutableSetOf("Kotlin", "Java", "Scala")
    println("24. Изменяемое множество строк: $mutableStringSet")

    // 25. Имея изменяемое множество строк, добавьте в него новые элементы
    mutableStringSet.addAll(setOf("Swift", "Go"))
    println("25. После добавления Swift и Go: $mutableStringSet")

    // 26. Имея изменяемое множество целых чисел, удалите из него определенный элемент
    val mutableIntSet = mutableSetOf(1, 2, 3, 4, 5)
    println("26. До удаления: $mutableIntSet")
    mutableIntSet.remove(2)
    println("    После удаления элемента 2: $mutableIntSet")

    // 27. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран
    val intSet = setOf(10, 20, 30, 40, 50)
    println("27. Вывод элементов множества:")
    for (element in intSet) {
        println("   $element")
    }

    // 28. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка
    val stringSet = setOf("Kotlin", "Java", "Python", "JavaScript")
    val searchInSet = "Java"
    val isFound = containsStringInSet(stringSet, searchInSet)
    println("28. Поиск '$searchInSet' во множестве $stringSet: $isFound")

    // 29. Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла
    val originalSet = setOf("Apple", "Banana", "Orange", "Grape")
    val convertedList = mutableListOf<String>()
    for (element in originalSet) {
        convertedList.add(element)
    }
    println("29. Исходное множество: $originalSet")
    println("    Конвертированный список: $convertedList")
}

// Функция для поиска строки в массиве (задача 10)
fun findStringInArray(array: Array<String>, searchString: String) {
    println("10. Поиск подстроки '$searchString' в массиве:")
    for (element in array) {
        if (element.contains(searchString)) {
            println("   Найденный элемент: $element")
            return
        }
    }
    println("   Элемент с подстрокой '$searchString' не найден")
}

// Функция для проверки наличия строки во множестве (задача 28)
fun containsStringInSet(set: Set<String>, searchString: String): Boolean {
    for (element in set) {
        if (element == searchString) {
            return true
        }
    }
    return false
}