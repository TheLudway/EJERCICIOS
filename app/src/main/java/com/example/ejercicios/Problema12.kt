package com.example.ejercicios

// Nombre:
// Fecha:
// Descripción: Solución del Problema 12 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema12()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema12() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    val num1 = readln().toInt()
    println("Dame num2:")
    val num2 = readln().toInt()
    println("Dame num3:")
    val num3 = readln().toInt()

    if (num1 == num2 && num2 == num3){
        println("3")
    }else if ((num1 == num2 && num2 != num3) || (num3 == num1 && num3 != num2) || (num2 == num3 && num2 != num1)){
        println("2")
    }else{
        println("0")
    }
}