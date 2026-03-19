package run

fun main(){
    //Mutable
    var age = 0
    println(age)

    age = 13
    println(age)

    var name = "Mary P."
    println(name)

    name = "Maria P."
    println(name)

    //Variables Inmutables
    val college = "UAM"
    println(college)

    //college = "UNICIT"

    //Variables de tipo entero
    val quantity : Int = 20
    var totalStudents : Int = 21
    println("Cantidad: $quantity \nTotal de estudiantes: $totalStudents")

    //Variables de tipo decimal
    val price : Double = 99.99
    var average : Float = 100.0f
    println("Promedio: $average \nPrecio $price")

    //Texto
    val phrase : String = "Vamos Jaguares..."
    println(phrase)

    //Caracter
    var grade : Char = 'A'
    println("Tu calificación es $grade")

    //Booleanos
    var isActivo : Boolean = true
    isActivo = false
    println(!isActivo)

    val precioBase = 1000.0
    val total = calcularTotalConIVANic(precioBase)
    println("Precio base: $1000.00")
    println("IVA (15%): $${precioBase * 0.15}")
    println("Total con IVA: $$total")
}

fun calcularTotalConIVANic(precioBase: Double): Double {
        val ivaTasa = 0.15
        val iva = precioBase * ivaTasa
        return precioBase + iva
    }