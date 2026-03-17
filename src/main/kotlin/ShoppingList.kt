fun main() {

    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    // Создаём пустой список для покупок
    val shoppingList = mutableListOf<String>()
    // Бесконечный цикл для меню
    while (true){
        //выводим меню
        println("\n=== СПИСОК ПОКУПОК ===")
        println("1. Добавить товар")
        println("2. Удалить товар")
        println("3. Показать список")
        println("4. Выход")
        print("Выберите пункт: ")

        val choice = readln()

        when(choice){
            "1" -> {
                val position = readln()
                shoppingList.add(position)
                println("Товар ${position} добавлен")
            }
            "2" -> {
                if (shoppingList.size == 0) {
                    println("Список пуст")
                } else {
                    for (i in 1..shoppingList.size) {
                        println("$i . ${shoppingList.get(i - 1)}")
                    }
                    print("Введите номер для удаления: ")
                    val input = readln().toIntOrNull()
                    if (input != null) {
                        if(input <= shoppingList.size){
                            shoppingList.removeAt(input - 1)
                            println("Товар ${input}  удален")
                        }else{
                            println("Ошибка: нет товара с таким номером")
                        }
                    }
                }
            }
            "3" -> {
                if (shoppingList.size == 0) println("Список пуст") else {

                    for (i in 1..shoppingList.size) {
                        println("$i . ${shoppingList.get(i-1)}")
                    }
                }
            }
            "4" -> {
                println("→ Выход из программы")
                break
            }
            else -> {
                println("→ Неверный ввод, попробуйте снова")
            }
        }
    }
}












