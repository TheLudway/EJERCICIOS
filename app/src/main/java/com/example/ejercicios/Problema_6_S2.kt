package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema6_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6_S2() {
    // Desarrolle aquí la lógica
    println("A:")
    val A = readln().toInt()
    println("B:")
    val B = readln().toInt()
    if (A >= B){
        for (i in A downTo B){
            print("$i ")
        }
    }else{
        for (i in A..B){
            print("$i ")
        }
    }
}