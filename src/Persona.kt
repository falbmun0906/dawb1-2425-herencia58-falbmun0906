import java.time.LocalDate
import java.time.temporal.ChronoUnit
import java.util.Date

/* PARTE 1

class Persona(val nombre: String, var edad: Int) {
    fun cumple() {
        println("¡Es el cumple de $nombre! Cumpleaños feliz, cumpleaños feliz...")
        edad += 1
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }
}*/

// PARTE 2

open class Persona(val nombre: String, val fechaNacimiento: LocalDate = LocalDate.now()) {

    init {
        require(nombre != "") {"*ERROR* El nombre no puede estar vacío."}
    }

    var edad: Int = calcularEdad().toInt()

    fun cumple() {
        println("¡Es el cumple de $nombre! Cumpleaños feliz, cumpleaños feliz...")
        edad += 1
    }

    fun calcularEdad(): Double {
        val hoy = LocalDate.now()
        val dias = ChronoUnit.DAYS.between(fechaNacimiento, hoy).toDouble()
        return dias / 365.25
    }

    open fun actividad() {
        println("$nombre está realizando una actividad.")
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }
}
