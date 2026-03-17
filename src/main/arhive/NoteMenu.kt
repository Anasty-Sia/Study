import java.io.PrintStream
import java.util.Scanner

class NoteMenu (val archive: Archive) {

    fun repeat(){
        println("ЗАМЕТКА:")
        println("0 -> Создать заметку")
        println("1 -> Просмотр заметок")
        println("2 -> Выход")
    }

    fun begin() {

        System.setOut(PrintStream(System.out, true, "UTF-8"))



        while (true) {

            repeat()

            val choice = Scanner(System.`in`).nextLine()

            when (choice) {
                "0" -> {
                    newNote()
                }

                "1" -> {
                    openNote()
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


    fun newNote(){
        var title = ""

        while (true){
            println("Введите заголовок заметки:")
             title = readln()
            if(title.isEmpty()){
            println("Вы ничего не ввели, введите заголовок")
            }else {

                break
            }
        }

        var content = ""

        while (true){
            println("Введите текст заметки:")
            content = readln()
            if(content.isEmpty()){
                println("Вы ничего не ввели, введите текст")
            }else {
                 break
            }

        }

        val note = Note(title, content)
        archive.notes.add(note)
        println("Заметка $title создан")

    }

    fun openNote() {
        println("Открыть заметку")
        if(archive.notes.size == 0){
            println("Заметок нет")
        }else {
            for(i in 1.. archive.notes.size){
                println("Заметка №: $i - ${archive.notes.get(i-1).title}")

            }
            val choiceArchive = Scanner(System.`in`).nextLine().toIntOrNull()

            if( choiceArchive == null){
                println("Ошибка: ведите номер заметки")
            }else if(choiceArchive !in 1..archive.notes.size){
                println("Нет заметки с таким номером")
            }else{
                println("заголовок: - ${archive.notes.get(choiceArchive-1).title}")
                println("Текс: - ${archive.notes.get(choiceArchive-1).content}")

            }


        }
    }


}