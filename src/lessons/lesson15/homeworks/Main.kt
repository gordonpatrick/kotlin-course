package lessons.lesson15.homeworks

fun main() {
    println("=== ЗАДАНИЕ 1: ГЕОМЕТРИЧЕСКИЕ ФИГУРЫ ===\n")

    val circle = Circle("Красный", 5.0)
    circle.printInfo()
    println()

    val triangle = Triangle("Синий", 3.0, 4.0, 5.0)
    triangle.printInfo()
    println("Равнобедренный: ${triangle.isIsosceles()}")
    println()

    val square = Quadrilateral("Квадрат", "Зеленый", 4.0, 4.0, 4.0, 4.0)
    square.printInfo()
    println("Это квадрат: ${square.isSquare()}")
    println()

    println("\n=== ЗАДАНИЕ 2: УЧЕБНЫЕ ЗАВЕДЕНИЯ ===\n")

    val school = School(
        "Школа №1",
        "ул. Ленина, 10",
        1990,
        500,
        40,
        true,
        true,
        true
    )
    school.printInfo()
    println("Полный цикл обучения: ${school.hasFullCycle()}")
    println()

    val university = University(
        "МГУ",
        "Воробьевы горы",
        1755,
        35000,
        4000,
        15,
        true,
        true
    )
    university.printInfo()
    println("Уровень аккредитации: ${university.getAccreditationLevel()}")
    println()

    val college = College(
        "Технический колледж",
        "пр. Мира, 25",
        2005,
        800,
        60,
        listOf("Программирование", "Электроника", "Строительство"),
        true
    )
    college.printInfo()
    println("Специальности: ${college.getSpecializationsList()}")
    println()

    println("\n=== ЗАДАНИЕ 3: МЕБЕЛЬ ===\n")

    val chair = Chair(
        "Дерево",
        5000.0,
        45.0,
        90.0,
        50.0,
        false,
        false,
        120.0
    )
    chair.printInfo()
    println("Офисный стул: ${chair.isOfficeChair()}")
    println()

    val sofa = Sofa(
        "Ткань/Дерево",
        35000.0,
        200.0,
        85.0,
        90.0,
        3,
        true,
        true,
        "Велюр"
    )
    sofa.printInfo()
    println("Можно использовать как кровать: ${sofa.canBeUsedAsBed()}")
    println()

    val wardrobe = Wardrobe(
        "ДСП",
        25000.0,
        120.0,
        220.0,
        60.0,
        5,
        true,
        true,
        2,
        true
    )
    wardrobe.printInfo()
    println("Это шкаф для одежды: ${wardrobe.isWardrobeCloset()}")
    println()

    println("\n=== ЗАДАНИЕ 4: КОНТЕЙНЕРЫ МАТЕРИАЛОВ ===\n")

    // 1. BottomInsertMaterials
    println("--- BottomInsertMaterials (вставка на дно) ---")
    val bottomContainer = BottomInsertMaterials()
    bottomContainer.addMaterial("Первый")
    bottomContainer.addMaterial("Второй")
    bottomContainer.addMaterial("Третий")
    bottomContainer.printContainer()
    println()

    // 2. AlternatingInsertMaterials
    println("--- AlternatingInsertMaterials (поочередная вставка) ---")
    val alternatingContainer = AlternatingInsertMaterials()
    alternatingContainer.addMaterial("A")
    alternatingContainer.addMaterial("B")
    alternatingContainer.addMaterial("C")
    alternatingContainer.addMaterialsList(listOf("1", "2", "3"))
    alternatingContainer.printContainer()
    println()

    // 3. SortedMaterials
    println("--- SortedMaterials (сортировка) ---")
    val sortedContainer = SortedMaterials()
    sortedContainer.addMaterial("Дерево")
    sortedContainer.addMaterial("Металл")
    sortedContainer.addMaterial("Бетон")
    sortedContainer.addMaterial("Алюминий")
    sortedContainer.printContainer()
    println()

    // 4. DictionaryMaterials
    println("--- DictionaryMaterials (словарь) ---")
    val dictContainer = DictionaryMaterials()
    dictContainer.addMaterial("Существующий1")
    dictContainer.addMaterial("Существующий2")
    val map = mapOf(
        "Ключ1" to "Значение1",
        "Ключ2" to "Значение2",
        "Ключ3" to "Значение3"
    )
    dictContainer.addMaterialsMap(map)
    dictContainer.printContainer()
    println()
}
