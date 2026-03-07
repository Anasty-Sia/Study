
fun main(args: Array<String>) {

    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    var answer = 0.0

    var number1: Double
    var number2: Double
    var sign: String
    val erorrText = "Ошибка! Введите число (можно с дробной частью)"

    while (true) {
        println("Введите первое число:")
        try {
            number1 = readln().toDouble()
            break
        } catch (e: NumberFormatException) {
            println(erorrText)
        }
    }

    while (true) {
        println("Введите второе число:")
        try {
            number2 = readln().toDouble()
            break

        } catch (e: NumberFormatException) {
            println(erorrText)
        }
    }


    println("Введите оператор:+,-,*,/")
    sign = readln()


    if (sign == "/" && number2 == 0.0) {
        println("Делить на ноль нельзя")
    } else if(sign != "+" && sign !="-"&& sign !="*" && sign !="/"){
        println("Такого оператора нет")
        return
    }
    else {
        when (sign) {
            "+" -> answer = (number1 + number2)
            "-" -> answer = (number1 - number2)
            "*" -> answer = (number1 * number2)
            "/" -> answer = (number1 / number2)
            else -> return
        }
    }
    println("Вычисления над этим выражением: $number1 $sign $number2 = $answer")
}