fun main() {
    println("=== Задачи по работе со словарями ===\n")

    // 1. Определите среднее время выполнения теста
    println("1. Среднее время выполнения теста")
    val testTimes = mapOf("test1" to 5.2, "test2" to 3.1, "test3" to 7.8)
    val averageTime = testTimes.values.average()
    println("Среднее время: $averageTime сек\n")

    // 2. Выведите список всех тестовых методов
    println("2. Список всех тестовых методов")
    val testMetadata = mapOf("testLogin" to "metadata1", "testLogout" to "metadata2")
    val testMethods = testMetadata.keys.toList()
    println("Методы: $testMethods\n")

    // 3. Добавьте новый тест и его результат
    println("3. Добавление нового теста")
    val testResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    testResults.put("test3", "passed")
    println("Обновленные результаты: $testResults\n")

    // 4. Посчитайте количество успешных тестов
    println("4. Количество успешных тестов")
    val results = mapOf("test1" to "passed", "test2" to "failed", "test3" to "passed", "test4" to "skipped")
    val passedCount = results.count { it.value == "passed" }
    println("Успешных тестов: $passedCount\n")

    // 5. Удалите запись о баге, который был исправлен
    println("5. Удаление исправленного бага")
    val bugTracking = mutableMapOf("bug1" to "fixed", "bug2" to "open", "bug3" to "fixed")
    bugTracking.remove("bug1")
    println("Баги после удаления: $bugTracking\n")

    // 6. Выведите сообщение о странице и статусе проверки
    println("6. Статусы веб-страниц")
    val pageStatuses = mapOf("https://example.com" to 200, "https://test.com" to 404)
    pageStatuses.forEach { (url, status) ->
        println("Страница $url имеет статус: $status")
    }
    println()

    // 7. Найдите сервисы, время ответа которых превышает порог
    println("7. Сервисы с превышением порога времени ответа")
    val serviceResponseTimes = mapOf("service1" to 150, "service2" to 350, "service3" to 120)
    val threshold = 200
    val slowServices = serviceResponseTimes.filterValues { it > threshold }
    println("Медленные сервисы (>$threshold мс): $slowServices\n")

    // 8. Найдите статус ответа для endpoint или предположите, что он не был протестирован
    println("8. Статус API endpoint")
    val apiResults = mapOf("/users" to "200 OK", "/posts" to "404 Not Found")
    val endpoint = "/comments"
    val status = apiResults.getOrElse(endpoint) { "не был протестирован" }
    println("Статус для $endpoint: $status\n")

    // 9. Получите значение для "browserType" (не может быть null)
    println("9. Получение значения конфигурации")
    val testConfig = mapOf("browserType" to "Chrome", "timeout" to "30")
    val browserType = testConfig.getValue("browserType")
    println("Тип браузера: $browserType\n")

    // 10. Создайте копию неизменяемого словаря, добавив новую версию
    println("10. Добавление новой версии ПО")
    val softwareVersions = mapOf("v1.0" to "stable", "v1.1" to "beta")
    val updatedVersions = softwareVersions.plus("v1.2" to "alpha")
    println("Версии ПО: $updatedVersions\n")

    // 11. Получите настройки для конкретной модели или верните настройки по умолчанию
    println("11. Настройки устройства с дефолтом")
    val deviceSettings = mapOf("iPhone 12" to "settings1", "Samsung S21" to "settings2")
    val model = "Pixel 6"
    val settings = deviceSettings.getOrDefault(model, "default settings")
    println("Настройки для $model: $settings\n")

    // 12. Проверьте, содержит ли словарь определенный код ошибки
    println("12. Проверка наличия кода ошибки")
    val errorCodes = mapOf(404 to "Not Found", 500 to "Internal Server Error")
    val errorCode = 404
    val containsError = errorCodes.containsKey(errorCode)
    println("Содержит код $errorCode: $containsError\n")

    // 13. Отфильтруйте словарь по версии в ключе
    println("13. Фильтрация сценариев по версии")
    val testScenarios = mapOf(
        "TestID_v2.0" to "Passed",
        "TestID_v1.5" to "Failed",
        "TestID_v2.0_second" to "Skipped"
    )
    val requiredVersion = "v2.0"
    val filteredScenarios = testScenarios.filterKeys { it.contains(requiredVersion) }
    println("Сценарии версии $requiredVersion: $filteredScenarios\n")

    // 14. Проверьте, есть ли модули с неудачным тестированием
    println("14. Проверка наличия неудачных тестов")
    val moduleResults = mapOf("Auth" to "passed", "Payment" to "failed", "Dashboard" to "passed")
    val hasFailures = moduleResults.containsValue("failed")
    println("Есть неудачные тесты: $hasFailures\n")

    // 15. Добавьте настройки из другого словаря
    println("15. Добавление настроек из другого словаря")
    val envSettings = mutableMapOf("host" to "localhost", "port" to "8080")
    val additionalSettings = mapOf("timeout" to "60", "retries" to "3")
    envSettings.putAll(additionalSettings)
    println("Настройки среды: $envSettings\n")

    // 16. Объедините два неизменяемых словаря
    println("16. Объединение словарей с багами")
    val bugs1 = mapOf("bug1" to "critical", "bug2" to "minor")
    val bugs2 = mapOf("bug3" to "major", "bug4" to "trivial")
    val allBugs = bugs1 + bugs2
    println("Все баги: $allBugs\n")

    // 17. Очистите изменяемый словарь
    println("17. Очистка словаря")
    val lastRunData = mutableMapOf("test1" to "passed", "test2" to "failed")
    println("До очистки: $lastRunData")
    lastRunData.clear()
    println("После очистки: $lastRunData\n")

    // 18. Исключите тесты со статусом "skipped"
    println("18. Исключение пропущенных тестов")
    val testReport = mapOf("test1" to "passed", "test2" to "skipped", "test3" to "failed")
    val filteredReport = testReport.filterNot { it.value == "skipped" }
    println("Отчет без пропущенных: $filteredReport\n")

    // 19. Создайте копию словаря, удалив несколько конфигураций
    println("19. Удаление нескольких конфигураций")
    val configurations = mapOf("config1" to "value1", "config2" to "value2", "config3" to "value3")
    val reducedConfigs = configurations.minus(listOf("config1", "config3"))
    println("Конфигурации: $reducedConfigs\n")

    // 20. Преобразуйте словарь в список строк
    println("20. Преобразование в список строк отчета")
    val testingResults = mapOf("T001" to "passed", "T002" to "failed")
    val reportLines = testingResults.map { (id, result) -> "Test $id: $result" }
    println("Отчет:")
    reportLines.forEach { println("  $it") }
    println()

    // 21. Преобразуйте изменяемый словарь в неизменяемый
    println("21. Преобразование в неизменяемый словарь")
    val mutableResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    val immutableResults = mutableResults.toMap()
    println("Неизменяемые результаты: $immutableResults\n")

    // 22. Замените числовые ID на строковые
    println("22. Преобразование числовых ID в строковые")
    val testExecutionTimes = mapOf(1 to 5.5, 2 to 3.2, 3 to 7.1)
    val stringIdTests = testExecutionTimes.mapKeys { it.key.toString() }
    println("Тесты со строковыми ID: $stringIdTests\n")

    // 23. Увеличьте каждую оценку на 10%
    println("23. Увеличение оценок производительности на 10%")
    val performanceScores = mapOf("v1.0" to 100.0, "v2.0" to 150.0, "v3.0" to 200.0)
    val adjustedScores = performanceScores.mapValues { it.value * 1.1 }
    println("Скорректированные оценки: $adjustedScores\n")

    // 24. Проверьте, пуст ли словарь
    println("24. Проверка пустоты словаря")
    val compilationErrors = mapOf<String, String>()
    val isEmptyDict = compilationErrors.isEmpty()
    println("Словарь ошибок пуст: $isEmptyDict\n")

    // 25. Убедитесь, что словарь не пуст
    println("25. Проверка непустоты словаря")
    val loadTestResults = mapOf("test1" to 95.5, "test2" to 87.3)
    val notEmpty = loadTestResults.isNotEmpty()
    println("Результаты нагрузочного тестирования не пусты: $notEmpty\n")

    // 26. Проверьте, прошли ли все тесты успешно
    println("26. Проверка всех тестов на успешность")
    val automatedTests = mapOf("test1" to "passed", "test2" to "passed", "test3" to "passed")
    val allPassed = automatedTests.all { it.value == "passed" }
    println("Все тесты прошли: $allPassed\n")

    // 27. Определите, содержит ли словарь хотя бы один тест с ошибкой
    println("27. Проверка наличия хотя бы одной ошибки")
    val testingOutcomes = mapOf("test1" to "passed", "test2" to "error", "test3" to "passed")
    val hasError = testingOutcomes.any { it.value == "error" }
    println("Есть тест с ошибкой: $hasError\n")

    // 28. Отфильтруйте тесты, которые не прошли успешно и содержат "optional"
    println("28. Комплексная фильтрация: неудачные опциональные тесты")
    val serviceTests = mapOf(
        "optional_auth" to "failed",
        "required_login" to "failed",
        "optional_cache" to "failed",
        "optional_metrics" to "passed"
    )
    val filteredTests = serviceTests.filter {
        it.value != "passed" && it.key.contains("optional")
    }
    println("Неудачные опциональные тесты: $filteredTests\n")

    println("=== Все задачи выполнены ===")