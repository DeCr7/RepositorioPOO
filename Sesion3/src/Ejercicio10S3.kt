class Libro
{
    var titulo = ""
    var autor = ""
    var anoPublicacion = 0

    fun mostrarInformacion(){
        println("DATOS:")
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de Publicación: $anoPublicacion")
        println("")
    }
}

fun main()
{
    val libro1 = Libro()
    libro1.titulo = "Java Básico"
    libro1.autor = "Luis Felipe Wanumen Silva"
    libro1.anoPublicacion = 2017
    libro1.mostrarInformacion()

    val libro2 = Libro()
    libro2.titulo = "C/C++. Curso de programación"
    libro2.autor = "Miguel Ángel Acera García"
    libro2.anoPublicacion = 2017
    libro2.mostrarInformacion()

    val libro3 = Libro()
    libro3.titulo = "Lógica de programación orientada a objetos"
    libro3.autor = "Efraín Manuel Oviedo Regino"
    libro3.anoPublicacion = 2015
    libro3.mostrarInformacion()

    val libro4 = Libro()
    libro4.titulo = "Desarrollo ágil esencial: Vuelta a las raíces"
    libro4.autor = "Robert C. Martin"
    libro4.anoPublicacion = 2020
    libro4.mostrarInformacion()
}