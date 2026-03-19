open class EmpleadoS3 (
    private var nombre:String = "",
    private var salario:Double = 0.0,
){
    open fun imprimirDatos():String{
        return "Hola, $nombre, tu salario es $salario"
    }
}

class Programador(nombre :String,salario:Double,var rol:String):EmpleadoS3(nombre,salario){
    override fun imprimirDatos(): String {
        return super.imprimirDatos() + ", tu rol es $rol"
    }
}

fun main(args: Array<String>) {
    val programador1 = Programador("Jose",1500.5,"Programador")
    print(programador1.imprimirDatos())
}