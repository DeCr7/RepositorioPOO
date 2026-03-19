data class Pedido(
    val cliente : String,
    val platillo : String,
    val precio : Double
)

fun main(){
    val platillo1 = Pedido("Mario","Enchiladas",50.5)
    val platillo2 = Pedido("Henry","Gallopinto con Queso",30.25)
    val platillo3 = Pedido("William","Vigorón",45.75)

    println(platillo1)
    println(platillo2)
    println(platillo3)
}