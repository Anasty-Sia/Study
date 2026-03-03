import kotlin.random.Random

fun main(args: Array<String>) {

    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    var numberCom = Random.nextInt(1, 100)
    var attempt = 0 //попытки
    var numberPerson: Int

    while (true) {
        println("Введите число от 1 до 100")
        try {
            numberPerson = readln().toInt()
            println("Вы ввели число - $numberPerson")
            if (numberPerson < numberCom) {
                attempt++
                println("Число больше,кол-во попыток:$attempt")

            } else if (numberPerson > numberCom) {
                attempt++
                println("Число меньше,кол-во попыток:$attempt")
            }else{
                attempt++
                println("Вы угадали число - $numberPerson,кол-во попыток:$attempt")
                break
            }

        }catch (e: NumberFormatException){
            println("Ошибка! Введите число!")

        }

    }
}

