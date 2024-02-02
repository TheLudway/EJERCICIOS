package com.example.ejercicios

// Nombre: Ludwig Alvarado Becerra
// Fecha: 02/02/2024
// Descripción: Solución del Problema 7 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    /*
        Input:
            N:      Int, sonidos del grillo por minuto, debe ser positivo, si no, excepción.
        Output:
            temperatura:    Float, temperatura en Farenheit con la fórmula N/4.0 + 40.0
     */
    println("¿Cuántos sonidos del grillo escuchaste por minuto?")
    val sonidosGrillo = readln().toInt()

    // Validación para que estrictamente sea un número entero positivo
    if (sonidosGrillo < 0){
        println("Seguro investigador, ¿un grillo puede hacer ese número de sonidos?")
    }else {

        val temperatura = sonidosGrillo / 4.0 + 40.0

        println("Dados los sonidos del grillo, la temperatura es de $temperatura °F.")
    }
}