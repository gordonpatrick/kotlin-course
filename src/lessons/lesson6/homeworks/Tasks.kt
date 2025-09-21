object Tasks {

    // Задание 1: Определение сезона
    fun printSeason(month: Int) {
        if (month !in 1..12) {
            println("Ошибка: номер месяца должен быть от 1 до 12")
            return
        }
        val season = when (month) {
            12, 1, 2 -> "Зима"
            3, 4, 5 -> "Весна"
            6, 7, 8 -> "Лето"
            else -> "Осень"
        }
        println(season)
    }

    // Задание 2: Расчет возраста питомца
    fun printDogHumanAge(dogAge: Double) {
        if (dogAge < 0) {
            println("Ошибка: возраст не может быть отрицательным")
            return
        }
        val humanAge = if (dogAge <= 2)
            dogAge * 10.5
        else
            2 * 10.5 + (dogAge - 2) * 4
        println(humanAge)
    }

    // Задание 3: Определение способа перемещения
    fun printTransport(distanceKm: Double) {
        if (distanceKm < 0) {
            println("Ошибка: расстояние не может быть отрицательным")
            return
        }
        val transport = when {
            distanceKm <= 1 -> "пешком"
            distanceKm <= 5 -> "велосипед"
            else -> "автотранспорт"
        }
        println(transport)
    }

    // Задание 4: Расчет бонусных баллов
    fun printBonus(purchaseAmount: Int) {
        if (purchaseAmount < 0) {
            println("Ошибка: сумма не может быть отрицательной")
            return
        }
        val bonus = if (purchaseAmount <= 1000)
            (purchaseAmount / 100) * 2
        else
            (purchaseAmount / 100) * 3
        println(bonus)
    }

    // Задание 5: Определение типа документа
    fun printDocumentType(extension: String) {
        if (extension.isBlank()) {
            println("Ошибка: расширение не может быть пустым")
            return
        }
        val type = when (extension.lowercase()) {
            "txt", "doc", "docx", "rtf" -> "Текстовый документ"
            "jpg", "jpeg", "png", "gif", "bmp" -> "Изображение"
            "xls", "xlsx", "csv" -> "Таблица"
            else -> "Неизвестный тип"
        }
        println(type)
    }

    // Задание 6: Конвертация температуры
    fun printTempConverted(value: Double, unit: String) {
        when (unit.uppercase()) {
            "C" -> {
                val result = value * 9 / 5 + 32
                print(result)
                print("F")
            }
            "F" -> {
                val result = (value - 32) * 5 / 9
                print(result)
                print("C")
            }
            else -> println("Ошибка: единица измерения должна быть 'C' или 'F'")
        }
    }

    // Задание 7: Подбор одежды по погоде
    fun printClothes(tempC: Int) {
        when {
            tempC < -30 || tempC > 35 -> println("Рекомендуется не выходить из дома")
            tempC < 10 -> println("куртка и шапка")
            tempC <= 18 -> println("ветровка")
            else -> println("футболка и шорты")
        }
    }

    // Задание 8: Выбор фильма по возрасту
    fun getMovieCategory(age: Int): String {
        if (age < 0) return "Ошибка: некорректный возраст"
        return when (age) {
            in 0..9 -> "детские"
            in 10..18 -> "подростковые"
            else -> "18+"
        }
    }
}
