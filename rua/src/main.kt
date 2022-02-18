fun main() {

    var macc1 = intArrayOf(1,2,3,2,0)

    var macc2 = intArrayOf(5,1,2,7,3,2)

    println(getRepeated(macc1,macc2))



/**
Даны два массива: [1,2,3,2,0] и [5,1,2,7,3,2]
Нужно вернуть массив из повторяющихся чисел , если число повторяется три раза тогда в массиве ввести его два раза.
Пример: [1,2,2,3] (порядок неважен)

*/
}

fun getRepeated(macc1: IntArray, macc2: IntArray): List<Int> {

    val cpicok1 = macc1.toHashSet()
    val cpicok2 = macc2.toHashSet()

    var result: MutableList<Int> = mutableListOf()

    for (i in cpicok1) {
        if (cpicok2.contains(i)) { // contains проверяет есть ли элемент i в хеше cpicok2
            val numRepeat = minOf(macc1.count { it == i }, macc2.count { it == i }) // count считает колличество элементов
            // minOf из двух слагаемх вбирает минимальное
            repeat(numRepeat) { result.add(i) } // функия repeat наподобии классического цикла итеррируется n - колличество раз
            //
        }
    }
    return result

}


