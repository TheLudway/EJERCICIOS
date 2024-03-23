package com.example.ejercicios

// Nombre: Ludwig Alvarado Becerra
// Fecha: 2/02/2024
// Descripción: Solución del Problema 2 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    /*
    Cosas que ingresa el usuario:
        a:  type Int
        b:  type Int
    Cosas que se imprimen:
        Una cadena con el resultado de la suma de los dos números enteros digitados por
        el usuario
     */
    println("Ingresa a:")
    val a = readln().toInt()
    println("Ingresa b:")
    val b = readln().toInt()
    println("$a + $b = ${a+b}")
}