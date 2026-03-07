fun main() {

    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    val officeDevices = listOf(Printer(false,true,"Samsung",220),
        Laptop(true,67,false,"Sony",220),
        Lamp("Ping",120,true))

    for(officeDevice in officeDevices){
        officeDevice.printInfo()
        officeDevice.turnOn()
        if(officeDevice is Connectable){ officeDevice.connectToWiFi("Office-Guest")}
        if(officeDevice is Chargeable) officeDevice.charge()
        officeDevice.turnOff()
    }
}
interface Turnable{//техника, которую можно включать и выключать

    val isOn: Boolean

    fun turnOn()
    fun turnOff()
}

interface Chargeable{// техника, которую нужно заряжать
val batteryLevel: Int
    fun charge()
}

interface Connectable{//техника, которая может подключаться к Wi-Fi
val isConnected: Boolean
    fun connectToWiFi(networkName: String)
}

abstract class OfficeDevice() {

    abstract val brand:String
    abstract val powerConsumption: Int
    abstract fun  getDeviceType(): String
    fun printInfo(){
        println("Устройство: ${getDeviceType()}, бренд: $brand, потребление: $powerConsumption Вт")
    }

}

class Printer(
    override val isOn: Boolean,
    override val isConnected: Boolean,
    override val brand: String,
    override val powerConsumption: Int
):OfficeDevice(),Turnable,Connectable{

    override fun turnOn() {
        println("Принтер $brand готов к печати")

    }
    override fun turnOff() {
        println("Принтер $brand выключен")
    }

    override fun connectToWiFi(networkName: String) {
        println("Принтер  $brand подключён к сети $networkName")

    }

    override fun getDeviceType(): String {
        return "Принтер"
    }

}
class Laptop(
    override val isOn: Boolean,
    override val batteryLevel: Int,
    override val isConnected: Boolean,
    override val brand: String,
    override val powerConsumption: Int):OfficeDevice(), Turnable, Chargeable, Connectable{

    override fun turnOn() {
        println("Ноутбук $brand загружается")

    }

    override fun turnOff() {
        println("Ноутбук $brand завершает работу")
    }

    override fun charge() {
        println("Ноутбук $brand заряжается. Уровень: $batteryLevel%")
    }

    override fun connectToWiFi(networkName: String) {
        println("Ноутбук $brand подключён к $networkName")
    }

    override fun getDeviceType(): String {
        return "Ноутбук"
    }
}

class Lamp(
    override val brand: String,
    override val powerConsumption: Int,
    override val isOn: Boolean
):OfficeDevice(),Turnable{


    override fun turnOn() {
        println("Лампа $brand светит")

    }

    override fun turnOff() {
        println("Лампа $brand погасла")
    }

    override fun getDeviceType(): String {
        return "Лампа"
    }

}

