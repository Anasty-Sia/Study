import java.io.PrintStream


fun main() {

    System.setOut(PrintStream(System.out, true, "UTF-8"))

    fun measureTime(block:() -> Unit):Long{
        val start = System.currentTimeMillis()
        block()
        val end = System.currentTimeMillis()
        val result = end -start
        return  result

    }


    val time = measureTime {
        var sum = 0L
        for (i in 1..1_000_000) {
            sum += i
        }
        println("Сумма: $sum")
    }
    println("Время выполнения: $time мс")


    fun timeTracker(block: () -> Unit): Long {

        val start = System.currentTimeMillis()
        block()
        val end = System.currentTimeMillis()
        val result = end -start
        return  result

    }

    val times = timeTracker {

        var sum = 0L
        for(i in 1 ..1_000_000L){
            sum +=i

        }
        println("Сумма: $sum")
    }

    println("Время: $times")


    fun repeat(times: Int, action: (Int) -> String): List<String> {
        val list = mutableListOf<String>()
        for( i in 1..times){
            list.add(action(i))
        }

        return list
    }

    val result = repeat(6) { index ->
        "Поворот номер $index"
    }
    println(result)


    fun transformList(numbers: List<Int>, transformer: (Int) -> String): List<String> {
        val list  = mutableListOf<String>()
        for ( i in numbers){
            list.add(transformer(i))
        }
        return list
    }

    val resultT = transformList(listOf(1, 2, 3, 4, 5)) { number ->
        "Число $number"
    }
    println(resultT)


}



