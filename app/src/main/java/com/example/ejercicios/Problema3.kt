package com.example.ejercicios

import kotlin.math.pow
import kotlin.math.round

// Nombre: Ludwig Alvarado Becerra
// Fecha: 02/02/2024
// Descripción: Solución del Problema 3 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    // Desarrolle aquí la lógica
    println("Ingresa la asignatura:")
    val materia = readln()

    println("Ingresa nota primer corte:")
    val c1 = readln().toFloat()

    println("Ingresa nota segundo corte:")
    val c2 = readln().toFloat()

    println("Ingresa nota tercer corte:")
    val c3 = readln().toFloat()

    println("Asignatura: $materia")

    var definitiva = round((c1*0.333 + c2*0.333 + c3*0.334) * Math.pow(10.0, 3.0)) / Math.pow(10.0, 3.0)

    println("Definitiva: $definitiva")
}