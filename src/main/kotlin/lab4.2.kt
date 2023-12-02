fun main() {
val table = Array(5, { Array(5, {0}) })
table[0] = arrayOf(1, 2, 3, 5, 6)
table[1] = arrayOf(4, 5, 6, 7, 8)
table[2] = arrayOf(7, 8, 9, 7, 3)
table[3] = arrayOf(1, 5, 7, 9, 8)
table[4] = arrayOf(8, 9, 1, 3, 4)
for (row in table) {
    for (element in row) {            print("$element ")
    }
    println()
}
var minElement = table[0][4]
for (i in 1 until 5)
{ if (table[i][4 - i] < minElement)
{ minElement = table[i][4 - i] } }
println("Наименьший элемент на побочной диагонали: $minElement")

}