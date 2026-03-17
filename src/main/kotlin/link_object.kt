import java.io.PrintStream
import java.util.Scanner


fun main() {

    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    class Car(val model: String)
    class Driver(val name: String,val car:Car)

    //Задание№1

    val myCar = Car("Tesla")
    val driver = Driver("Анастасия", myCar)

    println(driver.name)        // Анастасия
    println(driver.car.model)   // Tesla
    val driver2 = Driver("Олег",myCar)
    println(driver2.name)        // Анастасия
    println(driver2.car.model)

    //Задание№2
    class Student(val name: String){

        override fun toString(): String{
            return name
        }
    }

    val students = mutableListOf<Student>()

    val newStudent = Student("Анна")
    val newStudent2 = Student("Иван")

    students.add(newStudent)
    students.add(newStudent2)

    println(students.toList())
    println(students[0])
    println(students.get(0))

    //Задание№3
    class Book(val title: String){

        override fun toString(): String {
            return title
        }
    }
    class Library {
        val books = mutableListOf<Book>()
        fun addBook(book: Book) {
            books.add(book)
        }
        fun showBooks() {
            for(book in books){
                println(book.title)
            }
        }

    }

    fun transferBook(book: Book, from: Library, to: Library){
        from.books.remove(book)
        to.books.add(book)
    }

    val libraryA = Library()
    val libraryB = Library()

    val book1 = Book("Книга 1")
    val book2 = Book("Книга 2")

    libraryA.addBook(book1)
    libraryB.addBook(book2)

    libraryA.showBooks()
    libraryB.showBooks()
    println(libraryA.books.size)
    println(libraryB.books.size)

    transferBook(book1,libraryA,libraryB)
    libraryA.showBooks()
    libraryB.showBooks()
    println(libraryA.books.size)
    println(libraryB.books.size)

}



