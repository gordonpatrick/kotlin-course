package lessons.lesson14.homeworks

/**
 * Дата-класс для представления продукта в магазине
 * @property name название продукта
 * @property price цена продукта
 * @property quantity количество продукта
 */
data class Product(
    val name: String,
    val price: Double,
    val quantity: Int
)