class Estudiante
{
    var nombre = ""
    var edad = 0

    fun estudiar(){
        println("$nombre está estudiando...")
    }
}

class Asignatura(private val nombre : String, private val precio : Double)
{
    fun getNombre(): String
    {
        return "La asignatura se llama: $nombre"
    }

    fun getPrecio(): Double
    {
        return precio
    }
}

fun main()
{
    val estudiante = Estudiante()
    estudiante.nombre = "Harry Joiner"
    estudiante.edad = 20
    estudiante.estudiar()

    estudiante.nombre = "Fernando Vega"
    estudiante.edad = 30
    estudiante.estudiar()

    val poo = Asignatura("POO", 250.0)

    println(poo.getNombre())
    println(poo.getPrecio())
}