package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 4 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema4_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4_S2() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var i = 0
    var i_max = i
    var maxnum = -9999999
    while (n != 0){
        i++
        if (n > maxnum){
            maxnum = n
            i_max = i
        }
        println("n:")
        n = readln().toInt()
    }
    println("Posición del mayor = $i_max")
}