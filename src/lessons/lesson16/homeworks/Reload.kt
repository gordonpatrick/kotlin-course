//Корзина товаров
class ShoppingCart {
    private val items: MutableMap<String, Int> = mutableMapOf()

    // Базовый метод - добавляет одну единицу
    fun addToCart(itemId: String) {
        items[itemId] = (items[itemId] ?: 0) + 1
    }

    // Перегрузка 1: добавляет товар с количеством
    fun addToCart(itemId: String, amount: Int) {
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    // Перегрузка 2: добавляет товары из словаря
    fun addToCart(itemsDict: Map<String, Int>) {
        for ((itemId, qty) in itemsDict) {
            items[itemId] = (items[itemId] ?: 0) + qty
        }
    }

    // Перегрузка 3: добавляет товары из списка (по 1 каждый)
    fun addToCartFromList(itemsList: List<String>) {
        for (itemId in itemsList) {
            items[itemId] = (items[itemId] ?: 0) + 1
        }
    }

    override fun toString(): String {
        if (items.isEmpty()) {
            return "Корзина пуста"
        }

        val sb = StringBuilder()
        sb.append("\n╔════════════════════════════════════════╗\n")
        sb.append("║         КОРЗИНА ТОВАРОВ                ║\n")
        sb.append("╠════════════════════════════════════════╣\n")
        sb.append("║  ID Товара          │   Количество    ║\n")
        sb.append("╠════════════════════════════════════════╣\n")

        var totalItems = 0
        for ((itemId, qty) in items.toSortedMap()) {
            sb.append("║  %-18s │   %6d         ║\n".format(itemId, qty))
            totalItems += qty
        }

        sb.append("╠════════════════════════════════════════╣\n")
        sb.append("║  Всего артикулов:    %3d            ║\n".format(items.size))
        sb.append("║  Общее количество:   %3d            ║\n".format(totalItems))
        sb.append("╚════════════════════════════════════════╝")

        return sb.toString()
    }
}

fun main() {
    val cart = ShoppingCart()

    cart.addToCart("ITEM001")
    cart.addToCart("ITEM002", 5)
    cart.addToCart(mapOf("ITEM003" to 3, "ITEM001" to 2, "ITEM004" to 7))
    cart.addToCartFromList(listOf("ITEM005", "ITEM002", "ITEM005"))

    println(cart)
}
