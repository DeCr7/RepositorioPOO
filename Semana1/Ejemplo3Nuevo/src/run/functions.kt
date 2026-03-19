package run

fun sayHello() {
    println("Hola Mundo desde la UAM!")
}

fun greet(name: String) {
    println("Hola $name, mucho gusto!")
}

//fun main(args: Array<String>) {
//    sayHello()
//    greet("Solieth")
//}

//funciones que retornen un valor
fun addGrade(grade : Int, extra : Int): Int {
    return grade + extra
}

fun getScore(score : Int, extra : Int) : Int = score + extra

fun createUser (name : String, rol : String = "Usuario"){
    println("Usuario $name y su rol $rol")
}

fun main(args: Array<String>){
    sayHello()
    greet("Solieth")
    val grade = "Nota final ${addGrade(70,10)}"
    println(grade)

    println("Nota final ${addGrade(70,10)}")

    println("Aumento ${getScore(100,20)}")

    println("${createUser(name = "Alejandro")}")
    println("${createUser(rol = "Gerente", name = "Alejandro")}")
}