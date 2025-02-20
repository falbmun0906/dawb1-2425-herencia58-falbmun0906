import java.time.LocalDate
import java.time.Month

fun main() {
/*  PARTE 1

    val persona1: Persona = Persona("Fran", 30)

    println("Imprimido información de 'persona1'...")
    println(persona1)

    persona1.cumple()
    println("Imprimido información de 'persona1'...")
    println("Persona (nombre = ${persona1.nombre}, edad = ${persona1.edad})") */

// PARTE 2

    val persona1: Persona = Persona("Fran", LocalDate.of(1994, 6, 9))

    val estudiante1: Estudiante = Estudiante("Entomología", "Luque", LocalDate.of(2000, 2,24))

    println(estudiante1)
    persona1.actividad()
    estudiante1.actividad()

}

