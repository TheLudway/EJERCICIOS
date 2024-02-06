package com.example.ejercicios

// Nombre:
// Fecha:
// Descripción: Solución del Problema 13 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema13()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema13() {
    // Desarrolle aquí la lógica
    println("Dame un numero:")
    val num = readln().toInt()
    if ((num/100) % 10 < (num/10)%10 && (num/10)%10 < (num%10)){
        println("SÍ")
    }else{
        println("NO")
    }
}