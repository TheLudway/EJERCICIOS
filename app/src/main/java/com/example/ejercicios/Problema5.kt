package com.example.ejercicios

// Nombre: Ludwig Alvarado Becerra
// Fecha: 02/02/2024
// Descripción: Solución del Problema 5 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    /*
        Input:
            e:      Int, Número de estudiantes
            m:      Int, Número de manzanas
        Output:
            m/e:    Int, manzanas que recibe cada estudiante
            m%e:    Int, manzanas que quedan en el resto
     */
    println("e:")
    val e = readln().toInt()
    println("m:")
    val m = readln().toInt()

    println("Cada estudiante recibirá: ${m/e} manzanas.")
    println("Quedarán en la canasta: ${m%e} manzanas.")
}