package lessons.lesson14.homeworks

fun main() {
    println("=== Задание 1: Party ===")
    val party = Party("Клуб 'Облака'", 50)
    party.details()

    println()
    println("=== Задание 2: Emotion ===")
    val joy = Emotion("радость", 8)
    joy.express()
    val sadness = Emotion("грусть", 3)
    sadness.express()

    println()
    println("=== Задание 3: Moon ===")
    Moon.phase = "Full Moon"
    Moon.isVisible = true
    Moon.showPhase()

    println()
    println("=== Задание 4: Product ===")
    val product = Product("Хлеб", 45.50, 10)
    println(product)

    println()
    println("=== Задание 5: Concert ===")
    val concert = Concert("Кино", "Олимпийский", 2500.0, 3)
    concert.info()
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket() // Должно вернуть false

    println()
    println("=== Задание 6: Rack and Shelf ===")

    // Создаем стеллаж на 3 полки
    val rack = Rack(3)

    // Добавляем полки разной вместимости
    rack.addShelf(Shelf(20))
    rack.addShelf(Shelf(15))
    rack.addShelf(Shelf(25))

    // Добавляем предметы
    rack.addItem("книга") // 5 символов
    rack.addItem("тетрадь") // 7 символов
    rack.addItem("ручка") // 5 символов
    rack.addItem("карандаш") // 8 символов
    rack.addItem("линейка") // 7 символов

    // Выводим содержимое
    rack.printContents()

    // Проверяем наличие предмета
    println()
    println("Есть ли 'книга'? ${rack.containsItem("книга")}")
    println("Есть ли 'альбом'? ${rack.containsItem("альбом")}")

    // Удаляем предмет
    println()
    println("Удаляем 'ручка': ${rack.removeItem("ручка")}")

    // Сложное удаление полки
    println()
    println("Выполняем сложное удаление полки #1:")
    val unplaced = rack.advancedRemoveShelf(1)
    println("Не удалось разместить: ${if (unplaced.isEmpty()) "все предметы размещены" else unplaced.joinToString(", ")}")

    println()
    rack.printContents()
}