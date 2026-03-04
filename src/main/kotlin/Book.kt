import android.icu.text.CaseMap
import java.sql.Time
import java.time.Year
import kotlin.math.E
import kotlin.random.Random

fun main() {

    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    /*class Employee(
        val name: String = "Сотрудник",
        val position: String = "Стажёр",
        val experience: Int = 0,
        val salary: Double = 30000.0
    )

    val employee1 = Employee(name = "Анна", position = "Разработчик")
    val employee2 = Employee(salary = 50000.0)
    val employee3 = Employee(name = "Петр", experience = 3, salary = 45000.0)
    val employee4 = Employee(salary = 100000.0, name = "Анастасия", position = "Разработчик", experience = 1)



    println("Сотрудник: ${employee1.name},  ${employee1.position},опыт: ${employee1.experience} лет,зарплата:${employee1.salary} руб.")

    println("Сотрудник: " + employee2.name + "," + employee2.position + ", опыт: " +
            employee2.experience + "лет,зарплата: " + employee2.salary+  " руб.")

    println("Сотрудник: " + employee3.name + "," + employee3.position + ", опыт: " +
            employee3.experience + "лет,зарплата: " + employee3.salary+  " руб.")
    println("Сотрудник: " + employee4.name + "," + employee4.position + ", опыт: " +
            employee4.experience + "лет,зарплата: " + employee4.salary+  " руб.")

  // Задание 1
    val userName: String? = null
    //val displayName = userName ?: "Гость"
    println("Привет, ${userName ?: "Гость"}")
  //  println("Привет, $displayName")
    println("Привет, $userName")

  // Задание 2
    val text: String? = null
    println(text?.length ?: -1)


    // Задание 3
    fun getAgeDescription(age:Int?): String{
        if(age != null && age > 0){
            return  "Возраст: $age лет"
        }else{
            return "Возраст неизвестен"
        }

    }
    println(getAgeDescription(6))

//Задание 4: Цена со скидкой


    fun calculateDiscountedPrice(price: Double?, discount: Double?): Double? {
        if( price != null && discount != null){
            return price *(1- discount/100)
        }
        else return  null

    }
    calculateDiscountedPrice(5.6,null

            */


    class Book(
        val title: String,
        val author: String,
        val year: Int,
        var isAvailable: Boolean = true
    ){
        constructor(title: String,author: String):
                this(title,author,year = 2024){
        }

        fun getAge(currentYear: Int): Int{
            return  currentYear - year
        }

        fun takeBook(): Boolean{
            if(isAvailable == true){
                isAvailable = false
                return true
            }else{
                return false
            }

        }
        fun returnBook(): Boolean{

            return true
        }

        fun getInfo(): String{
            val status = if(isAvailable) "доступна" else "выдана"
            return "$title, $author, $year - Статус: $status"
        }
    }

    val book1 =Book("Книга","Автор",1999)
    val book2 = Book("Вера","Меладзе",2026)
    val book3 = Book("Мечта ","Героя")

    println(book1.getInfo())
    //println(book2.getInfo())
    // println(book3.getInfo())

    println(book1.takeBook())
    println(book1.getInfo())

    println(book1.returnBook())
    println(book1.getInfo())

    //println(book3.getAge(2026))
    // println(book3.getInfo())

}

















