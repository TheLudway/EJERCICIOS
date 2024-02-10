package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 9 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema9_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9_S2() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    if (n <=0){
        println("Error")
    }else {
        var suma = 0
        fun factorial(n: Int): Int {
            var fact = 1
            for (i in 1..n) {
                fact *= i
            }
            return fact
        }

        for (i in 1..n) {
            suma += factorial(i)
        }
        println("s = $suma")
    }
}