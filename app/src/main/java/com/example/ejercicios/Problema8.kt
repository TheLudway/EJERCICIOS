package com.example.ejercicios

import kotlin.math.pow

// Nombre: Ludwig Alvarado Becerra
// Fecha: 06/02/2024
// Descripción: Solución del Problema 8 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    println("Dame la base:")
    val base = readln().toDouble()
    println("Dame el exponente:")
    val exponente = readln().toDouble()
    val resultado = base.pow(exponente)
    if (resultado > 5000){
        println("Muy grande.")
    }else{
        println("Números óptimos.")
    }


}