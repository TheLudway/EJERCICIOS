package com.example.ejercicios

// Nombre: Ludwig Alvarado Becerra
// Fecha: 02/02/2024
// Descripción: Solución del Problema 6 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    /*
        Input:
            n:      Int, número entero
        Output:
            Int, suma de los digitos de n
     */
    println("Dame un número entero:")
    val n = readln().toInt()

    println("La suma de los dígitos del número $n es igual a ${n%10 + (n/10)%10 + (n/100)%10}.")
}