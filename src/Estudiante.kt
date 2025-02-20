import java.time.LocalDate

class Estudiante(val carrera: String, nombre: String, fechaNacimiento: LocalDate): Persona(nombre, fechaNacimiento) {

    override fun actividad() {
        println("$nombre está jugando con escarabajos.")
    }

    override fun toString(): String {
        return "${super.toString().dropLast(1)}, Carrera: $carrera)"
    }
}