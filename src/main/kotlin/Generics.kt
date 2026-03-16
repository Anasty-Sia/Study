import java.io.PrintStream


fun main() {

    System.setOut(PrintStream(System.out, true, "UTF-8"))
    class Box<T>(var value: T)

    fun<T> printItem(item:T){
        println(item)
    }

    fun<T: Number> sum(a:T, b : T): Double{
        return a.toDouble() + b.toDouble()
    }

    // Дженерик-класс Repository

    class Repository<T>{
        private val items = mutableListOf<T>()

        fun add(item: T) {
            items.add(item)
        }

        fun remove(item: T) {
            items.remove(item)
        }

        fun getAll(): List<T> {
            return items.toList()

        }

        fun get(index: Int): T? {
            return  if(index >=0 && index<items.size) items[index] else  null
        }

    }


    val testRepository = Repository<Int>()
    testRepository.add(3)
    testRepository.add(8)
    testRepository.add(6)
    println(testRepository.getAll())
    testRepository.remove(6)
    println(testRepository.getAll())
    println(testRepository.get(0))


    // Дженерик-класс Pair и функция swap
    class Pair<A: Any, B: Any>(val first: A, val second: B) {
        fun printTypes() {
            println("Первый: ${first::class.simpleName}, второй: ${second::class.simpleName}")
        }

        fun toList(): List<Any> {

            val list = mutableListOf<Any>()
            list.add(first)
            list.add(second)

            return list.toList()

        }

    }


    fun <A: Any, B: Any> swap(pair: Pair<A, B>): Pair<B, A> {
        return Pair(pair.second, pair.first)
    }

    val original = Pair(42, "привет")
    val swapped = swap(original)
    println(original.toList())


    original.printTypes()

    println(original.first)
    println(original.second)
    println(swapped.first)
    println(swapped.second)

    val pair = Pair("Кот", 5)
    val swapped2 = swap(pair)
    println(swapped2.first)
    println(swapped2.second)

}
