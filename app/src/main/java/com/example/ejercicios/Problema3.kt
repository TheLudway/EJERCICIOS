package com.example.ejercicios

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
    /*
    Programa que imprime en consola el promedio de los tres cortes de una asignatura
    Input:
        materia:    String, asignatura la cual se está evaluando
        c1:         Float, nota que pertenece al primer corte
        c2:         Float, nota que pertenece al segundo corte
        c3:         Float, nota que pertenece al último corte
    Output:
        Float: c1*33% + c2*33% + c3*34% Resultado redondeado a 3 dígitos
     */
    println("Ingresa la asignatura:")
    val materia = readln()

    println("Ingresa nota primer corte:")
    val c1 = readln().toFloat()

    println("Ingresa nota segundo corte:")
    val c2 = readln().toFloat()

    println("Ingresa nota tercer corte:")
    val c3 = readln().toFloat()

    println("Asignatura: $materia")

    // Se múltiplica por 1000 para luego ser redondeado al entero más cercano y luego
    // dividir entre 1000 para que la salida sea un flotante
    var definitiva = round((c1*0.333 + c2*0.333 + c3*0.334)*10000) / 10000

    println("Definitiva: ${definitiva}")
}