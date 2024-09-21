fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    // Подсчет символов
    val charCount = mutableMapOf<Char, Int>()

    for (char in input) {
        if (char.isLetter()) { // Проверяем, является ли символ буквой
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }
    }
    // Сортировка символов в алфавитном порядке и вывод результата
    charCount.toSortedMap().forEach { (char, count) ->
        println("$char - $count")
    }
}