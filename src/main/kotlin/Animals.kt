fun main() {

    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    abstract class Animal() {

        abstract val name: String

        open fun makeSound() {
            println("Животное")
        }
    }

    class Dog(override val name: String) : Animal() {
        override fun makeSound() {

            println("$name - Гав")
        }

    }

    class Cat(override val name: String) : Animal() {
        override fun makeSound() {
            println("$name - Мяуу! ")
        }

    }

    class Bird(override val name: String) : Animal() {
        override fun makeSound() {
            super.makeSound()
            println("$name - ФрФрФР")
        }
    }

//вывод объектами

    Dog("Вася").makeSound()
    Cat("Несси").makeSound()
    Bird("Кафл").makeSound()

//вывод обычным списком
    val animals = listOf(Dog("Несси"), Cat("Амиго"), Bird("Вика"))

//пройтись по списку с помощью for

    for (animal in animals) {
        animal.makeSound()
    }

//пройтись по списку с помощью forEach

    animals.forEach { animal -> animal.makeSound() }

}