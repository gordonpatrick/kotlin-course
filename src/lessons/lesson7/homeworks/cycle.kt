# Домашнее задание: Циклы в Kotlin

## Задания для цикла for

### Прямой диапазон

**1. Напишите цикл for, который выводит числа от 1 до 5:**
```kotlin
fun task1() {
    for (i in 1..5) {
        println(i)
    }
}
```

**2. Напишите цикл for, который выводит четные числа от 1 до 10:**
```kotlin
fun task2() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
```

### Обратный диапазон

**3. Создайте цикл for, который выводит числа от 5 до 1:**
```kotlin
fun task3() {
    for (i in 5 downTo 1) {
        println(i)
    }
}
```

**4. Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2:**
```kotlin
fun task4() {
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}
```

### С шагом (step)

**5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9:**
```kotlin
fun task5() {
    for (i in 1..9 step 2) {
        println(i)
    }
}
```

**6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20:**
```kotlin
fun task6() {
    for (i in 1..20 step 3) {
        println(i)
    }
}
```

### Использование до (until)

**7. Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size:**
```kotlin
fun task7() {
    val size = 15 // Можно изменить значение
    for (i in 3 until size step 2) {
        println(i)
    }
}
```

## Задания для цикла while

### Цикл while

**8. Создайте цикл while, который выводит квадраты чисел от 1 до 5:**
```kotlin
fun task8() {
    var i = 1
    while (i <= 5) {
        println(i * i)
        i++
    }
}
```

**9. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль:**
```kotlin
fun task9() {
    var number = 10
    while (number > 5) {
        number--
    }
    println("Результат: $number")
}
```

### Цикл do while

**10. Используйте цикл do while, чтобы вывести числа от 5 до 1:**
```kotlin
fun task10() {
    var i = 5
    do {
        println(i)
        i--
    } while (i >= 1)
}
```

**11. Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5:**
```kotlin
fun task11() {
    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)
}
```

## Задания для прерывания и пропуска итерации

### Использование break

**12. Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6:**
```kotlin
fun task12() {
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }
}
```

**13. Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10:**
```kotlin
fun task13() {
    var i = 1
    while (true) {
        println(i)
        if (i == 10) {
            break
        }
        i++
    }
}
```

### Использование continue

**14. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа:**
```kotlin
fun task14() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}
```

**15. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3:**
```kotlin
fun task15() {
    var i = 1
    while (i <= 10) {
        if (i % 3 == 0) {
            i++
            continue
        }
        println(i)
        i++
    }
}
```

## Основная функция для тестирования

```kotlin
fun main() {
    println("Задание 1:")
    task1()

    println("\nЗадание 2:")
    task2()

    println("\nЗадание 3:")
    task3()

    println("\nЗадание 4:")
    task4()

    println("\nЗадание 5:")
    task5()

    println("\nЗадание 6:")
    task6()

    println("\nЗадание 7:")
    task7()

    println("\nЗадание 8:")
    task8()

    println("\nЗадание 9:")
    task9()

    println("\nЗадание 10:")
    task10()

    println("\nЗадание 11:")
    task11()

    println("\nЗадание 12:")
    task12()

    println("\nЗадание 13:")
    task13()

    println("\nЗадание 14:")
    task14()

    println("\nЗадание 15:")
    task15()
}

