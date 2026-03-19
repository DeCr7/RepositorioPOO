class Bus
{
    var numeroRuta = 0
    var capacidad = 0
    var conductor = ""

    fun iniciarRuta(){
        println("INICIANDO RUTA:")
        println("Número de Ruta: $numeroRuta")
        println("Capacidad de Pasajeros: $capacidad")
        println("Conductor de Ruta: $conductor")
        println("")
    }
}

fun main()
{
    val bus1 = Bus()
    bus1.numeroRuta = 111
    bus1.capacidad = 80
    bus1.conductor = "Matías Sánchez"
    bus1.iniciarRuta()

    val bus2 = Bus()
    bus2.numeroRuta = 118
    bus2.capacidad = 80
    bus2.conductor = "Pedro Ramírez"
    bus2.iniciarRuta()
}