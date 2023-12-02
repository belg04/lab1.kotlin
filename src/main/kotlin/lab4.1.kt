fun main() {
    println("Одномерный массив. средний уровень. 4 номер")
    println()
    val array1 = Array(9) { (1..100).random() }
    val array2 = Array(7) { (10..200).random() }
    val sortedArray = (array1 + array2).sorted().toTypedArray()
    println("Результат:")
    for (element in sortedArray) { println(element)    }

}