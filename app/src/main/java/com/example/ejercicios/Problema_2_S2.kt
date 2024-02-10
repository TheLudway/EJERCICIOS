package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 2 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema2_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2_S2() {
    // Desarrolle aquí la lógica
    println("Ingresa x:")
    var x = readln().toFloat()
    println("Ingresa y:")
    val y = readln().toInt()
    var dias = 1
    while (x < y){
        x = (x + (x*0.1)).toFloat()
        dias++
    }
    println("Necesitas $dias días para correr bien los $y Km")
}