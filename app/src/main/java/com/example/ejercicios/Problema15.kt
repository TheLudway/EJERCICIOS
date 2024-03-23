package com.example.ejercicios

// Nombre:
// Fecha:
// Descripción: Solución del Problema 15 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema15()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema15() {
    // Desarrolle aquí la lógica
    println("Dame un numero de 4 cifras:")
    val num = readln().toInt()

    if (num/100 == (num%10*10 + (num/10%10)) ){
        println("SÍ")
    }else{
        println("NO")
    }
}