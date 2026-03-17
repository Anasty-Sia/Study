import java.io.PrintStream
import java.util.Scanner

class MainTest {

    fun main() {



        System.setOut(PrintStream(System.out, true, "UTF-8"))
        println("ЗАМЕТКИ - Начало програмы")
        println("0 -> Cоздать архив")
        println("1 -> Выход")

        while (true) {

            val choice = Scanner(System.`in`).nextLine()

            when(choice){
                "0"->{
                    println("Cоздать архив")
                    val archive = ArchiveMenu()
                    archive.begin()
                }
                "1"->{
                    println("Выход")
                    break
                }else -> {
                println("Неверный ввод, попробуйте снова")
            }


            }
        }



    }



}