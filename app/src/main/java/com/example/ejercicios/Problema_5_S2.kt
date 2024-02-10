package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 5 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema5_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5_S2() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var pares = 0
    while (n != -1){
        if (n % 2 == 0){
            pares ++
        }
        println("n:")
        n = readln().toInt()
    }
    println("Pares = $pares")
}