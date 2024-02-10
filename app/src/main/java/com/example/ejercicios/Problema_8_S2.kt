package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 8 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema8_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8_S2() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    var factorial = 1
    for (i in 1..n){
        factorial *= i
    }
    println("$n ! = $factorial")
}