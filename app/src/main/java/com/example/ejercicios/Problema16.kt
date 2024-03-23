package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha:
// Descripción: Solución del Problema 16 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema16()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema16() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    println("m:")
    val m = readln().toInt()
    println("k:")
    val k = readln().toInt()
    if (k > n*m){
        println("NO")
    }else if (((k% m)%2 == 0) || ((k%n)%2 == 0) ){
        println("SÍ")
    }else{
        println("NO")
    }
}
