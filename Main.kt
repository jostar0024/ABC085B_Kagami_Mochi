fun main(args: Array<String>) {

    val mochiNum = readLine()!!.toInt()
    val mochiList = IntArray(mochiNum, { readLine()!!.toInt() })
    val ans = mochiList.toSet().size

    println(ans)
}
