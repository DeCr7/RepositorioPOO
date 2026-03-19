class Taxi
{
    var placa = ""
    var conductor = ""
    var modelo = ""

    fun iniciarServicio(){
        println("INICIAR SERVICIO:")
        println("Placa: $placa")
        println("Conductor: $conductor")
        println("Modelo: $modelo")
    }
}

fun main()
{
    val taxi1 = Taxi()
    taxi1.placa = "M-84343"
    taxi1.conductor = "Gabriel"
    taxi1.modelo = "Toyota"
    taxi1.iniciarServicio()

    val taxi2 = Taxi()
    taxi2.placa = "M-93253"
    taxi2.conductor = "Fritz"
    taxi2.modelo = "Hyundai"
    taxi2.iniciarServicio()

    val taxi3 = Taxi()
    taxi3.placa = "M-29438"
    taxi3.conductor = "Andrew"
    taxi3.modelo = "Ford"
    taxi3.iniciarServicio()
}