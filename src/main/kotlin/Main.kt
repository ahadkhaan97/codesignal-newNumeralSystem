fun main() {
    print(solution('G'))
}

fun solution(number: Char): MutableList<String> {
    val list = mutableListOf<String>()
    val numberInt = number.code - 'A'.code
    for (i in 0 until (numberInt / 2) + 1) {
        val tempString = "${('A'.code + i).toChar()} + ${(number.code - i).toChar()}"
        list.add(tempString)
    }
    return list
}
