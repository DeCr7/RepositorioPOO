interface Vehiculo {
    fun mover(movimiento: String)
}

class Camion : Vehiculo {
    override fun mover(movimiento: String) {
        println("El camión se mueve: $movimiento")
    }
}

class Motocicleta : Vehiculo {
    override fun mover(movimiento: String) {
        println("La motocicleta se mueve: $movimiento")
    }
}

fun main() {
    val camion = Camion()
    val moto = Motocicleta()

    camion.mover("transportando carga pesada")
    moto.mover("avanzando rápidamente")
}