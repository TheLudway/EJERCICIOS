package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 3 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema3_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3_S2() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var suma = 0
    while (n != 0){
        suma += n
        println("n:")
        n = readln().toInt()
    }
    println("Suma = $suma")
}