package lessons.lesson19.homeworks

/**
 * Класс для преобразования строк в списки слов
 */
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    /**
     * Разбивает строку по пробелам и возвращает список слов
     */
    override fun map(element: String): List<String> {
        return element.split(" ")
    }
    
    /**
     * Разбивает каждую строку из списка по пробелам и возвращает список списков слов
     */
    override fun mapList(elements: List<String>): List<List<String>> {
        return elements.map { it.split(" ") }
    }
}
