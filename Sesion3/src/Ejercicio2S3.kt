data class Producto(
    val nombre : String,
    val precio : Double,
    val cantidad : Int
)

fun main(){
    val arroz = Producto("Arroz", 15.8,50)
    val frijoles = Producto("Frijoles", 50.2, 50)
    val azucar = Producto("Azúcar", 27.5, 50)
    val aceite = Producto("Aceite", 39.3, 50)
    val jabon = Producto("Jabón", 18.4, 50)

    println(arroz)
    println(frijoles)
    println(azucar)
    println(aceite)
    println(jabon)
}