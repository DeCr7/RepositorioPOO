data class EstudianteData(
    val cif : String,
    val nombre : String,
    val carrera : String,
    val promedio : Double
)

fun main(){
    val solieth = EstudianteData("991",
        "Solieth",
        "ISI",
        92.0)
}