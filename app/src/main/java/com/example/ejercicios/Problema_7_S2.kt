package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha: 10/02/2024
// Descripción: Solución del Problema 7 de la guía de Kotlin y los ciclos

// Función principal
import kotlin.math.*
fun main() {
    problema7_S2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7_S2() {
    // Desarrolle aquí la lógica
    println("N:")
    val N = readln().toInt()
    if (N <= 0){
        println("Error")
    }else{
        var resultado = 0
        for (i in 1..N){
            var n = i.toDouble()
            resultado = (resultado + n.pow(3.0)).toInt()
        }
        println("s = $resultado")
    }


}