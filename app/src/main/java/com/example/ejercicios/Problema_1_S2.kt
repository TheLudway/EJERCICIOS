package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 1 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema1_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema1_S2() {
    // Desarrolle aquí la lógica
    println("Ingresa N:")
    val N = readln().toInt()
    var i = 1
    while (i*i <= N){
        print("${i*i} ")
        i++
    }
}