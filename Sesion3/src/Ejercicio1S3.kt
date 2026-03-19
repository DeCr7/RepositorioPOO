class EstudianteEjercicio1
{
    var nombre = ""
    var carnet = 0
    var carrera = ""
    var ano = ""

    fun mostrarDatos(){
        println("DATOS:")
        println("Nombre: $nombre")
        println("Carnet: $carnet")
        println("Carrera: $carrera")
        println("Año: $ano")
        println("")
    }
}

fun main()
{
    val estudianteUAM1 = EstudianteEjercicio1()
    estudianteUAM1.nombre = "Michael Schmidt"
    estudianteUAM1.carnet = 37347391
    estudianteUAM1.carrera = "Medicina"
    estudianteUAM1.ano = "3rd Año"
    estudianteUAM1.mostrarDatos()

    val estudianteUAM2 = EstudianteEjercicio1()
    estudianteUAM2.nombre = "Jeremiah Fitzgerald"
    estudianteUAM2.carnet = 92743012
    estudianteUAM2.carrera = "Psicología"
    estudianteUAM2.ano = "2nd Año"
    estudianteUAM2.mostrarDatos()

    val estudianteUAM3 = EstudianteEjercicio1()
    estudianteUAM3.nombre = "Lawrence Gordon"
    estudianteUAM3.carnet = 18249235
    estudianteUAM3.carrera = "Negocios Internacionales"
    estudianteUAM3.ano = "4th Año"
    estudianteUAM3.mostrarDatos()
}