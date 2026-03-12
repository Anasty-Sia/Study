import java.io.PrintStream
import java.util.Locale.filter

fun main() {

    System.setOut(PrintStream(System.out, true, "UTF-8"))

    // Передаём лямбду (блок кода)
    repeatTwice {
        println("Hi!")
    }

    val sum = {a: Int,b: Int -> a+b}
    println(sum(6,8))


    //Лямбда, которая принимает имя и возвращает приветствие
    val nameHello = {a: String -> ("Привет $a")}
    println(nameHello("Настя"))

    //Лямбда, которая ничего не принимает и ничего не возвращает

    var emptyParameter : () -> Unit = {println("Ничего не принимаю")}
    println(emptyParameter())

    //Лямбда, которая принимает число и возвращает true, если оно чётное

    //val num = {a: Int -> if (a %2 ==0) true else false}
    val num ={a:Int -> a%2 == 0}
    println(num(3))
    println(num(8))

    val numbers = (1..20).toList()
    println(numbers)

    val numFilter = numbers.filter{it %2==0}
    println(numFilter)

    val numMap = numFilter.map { it * it }
    println(numMap)

    for (i in 0..numFilter.size) {
        println("Число: ${numFilter.get(i)}")
    }

    fun myFiller(list: List<Int>,predicate: (Int)-> Boolean): List<Int>{
        val result = mutableListOf<Int>()

        for (number in list){
            if(predicate(number))
                result.add(number)
        }
        return result
    }

    val test = myFiller(numbers){
        it % 2 ==0
    }
    println(test)


    //Задание 1: Имена
    val names = listOf("Анна", "Павел", "Мария", "Пётр", "Елена", "Платон", "София")

    val nameF = names.filter { it.startsWith("П") }
    val nameMap = nameF.map { it.uppercase() }

    val result = names.filter { it.startsWith("П") }.map { it.uppercase() }
    println(nameMap)
    println(result)

    //Задание 2: Цены

    val prices = listOf(100, 250, 75, 800, 1200, 450, 3000)
    val priceF = prices.filter { it< 1000 }
    val priceMap = priceF.map { (it * 0.85).toInt() }
    println(priceMap)

    //Задание 3: Люди

    data class Person(val name: String, val age: Int)

    val people = listOf(
        Person("Олег", 17),
        Person("Марина", 25),
        Person("Игорь", 32),
        Person("Света", 16),
        Person("Денис", 41)
    )

    val peopleAge = people.filter { it.age >=18 }
    val peopleName = peopleAge.map { it.name }

    println(peopleName)

}

// Функция, которая принимает другую функцию
fun repeatTwice(action:() -> Unit){
    action()
    action()
}