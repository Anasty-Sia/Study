import java.io.PrintStream
import java.util.Scanner

class  ArchiveMenu(){

    val archives = mutableListOf<Archive>()



    fun repeat(){
        println("Архивы:")
        println("0 -> Создать архив")
        println("1 -> Список архивов")
        println("2 -> Выход")
    }

    fun begin() {

        System.setOut(PrintStream(System.out, true, "UTF-8"))

        while (true) {
            repeat()

            val choice = Scanner(System.`in`).nextLine()

            when (choice) {
                "0" -> {
                    newArchine()
                }

                "1" -> {
                  openArhive()
                }

                "2" -> {
                    println("Выход")
                    break
                }
                else -> {
                    println("Неверный ввод, попробуйте снова")
                }

            }
        }
    }


    fun newArchine(){
        println("Создать архив")

        while (true) {

            val name = readln()
            if (name.isEmpty()) {
                println("Введите название архива")

            } else {
                val newArchive = Archive(name, mutableListOf())
                archives.add(newArchive)
                println("Архив $name создан")
                break
            }
        }


    }

    fun openArhive(){
        println("Открыть архив")
        if(archives.size== 0){
            println("Архивов нет")
        }else {
            for (index in 1..archives.size) {
                println("Архив № $index -  ${archives.get(index - 1)}")
            }
            val choiceArchive = Scanner(System.`in`).nextLine().toIntOrNull()

            if( choiceArchive == null){
                println("Ошибка: ведите номер архива")
            }else if(choiceArchive !in 1..archives.size){
                println("Нет архива с таким номером")
            }else{
                val selectedArchive = archives[choiceArchive - 1]
                val note = NoteMenu(selectedArchive)
                note.begin()
            }

        }
    }


}

