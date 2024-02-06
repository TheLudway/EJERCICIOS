package com.example.ejercicios

// Nombre:
// Fecha:
// Descripción: Solución del Problema 11 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema11()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema11() {
    // Desarrolle aquí la lógica
    println("Dame el presupuesto:")
    val presupuesto = readln().toInt()
    println("Dame el valor de la comida:")
    val comida = readln().toInt()
    println("Dame el valor de la electricidad:")
    val electricidad = readln().toInt()
    println("Dame el valor del internet:")
    val internet = readln().toInt()
    println("Dame el valor del arriendo:")
    val arriendo = readln().toInt()

    if (presupuesto < (comida + electricidad + internet + arriendo)){
        println("Rayos estoy quebrado(a)!")
    }else{
        println("Vamos melos!")
    }
}