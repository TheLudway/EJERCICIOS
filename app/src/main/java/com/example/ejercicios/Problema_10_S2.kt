package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 10 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema10_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema10_S2() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    var cadena = ""
    if (n in 1..9){
        for (i in 1..n){
            cadena += "$i"
            println(cadena)
        }
    }else{
        println("Error")
    }
}