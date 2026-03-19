open class PersonaS3 (
    private var nombre:String = "",
    private var edad:Int = 0,
){
    open fun imprimirDatos():String{
        return "Hola, $nombre, tu edad es $edad"
    }
}

class DocentePersona(nombre: String, edad: Int) : PersonaS3(nombre, edad) {

    private val rol = "Docente"

    override fun imprimirDatos(): String {
        return super.imprimirDatos() + ", tu rol es $rol"
    }
}

class EstudiantePersona(nombre: String, edad: Int) : PersonaS3(nombre, edad) {

    private val rol = "Estudiante"

    override fun imprimirDatos(): String {
        return super.imprimirDatos() + ", tu rol es $rol"
    }
}

fun main(args: Array<String>) {
    val docente1 = DocentePersona("Jose",42)
    println(docente1.imprimirDatos())
    val estudiante1 = DocentePersona("Matthew",15)
    println(estudiante1.imprimirDatos())
}