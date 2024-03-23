package com.example.ejercicios

// Nombre: Ludwig Alvarado Becerra
// Fecha: 02/02/2024
// Descripción: Solución del Problema 4 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    /*
        Input:
            a1:     Double, representa el primer artículo
            a2:     Double, representa el segundo artículo
            a3:     Double, representa el tercer artículo
        Output:
            Valor Neto:   Double, suma de los tres artículos
            Valor total:  Double, valor neto más el 18% del valor neto
     */
    println("Ingresa valor artículo 1:")
    val a1 = readln()?.toDouble()!!

    println("Ingresa valor artículo 2:")
    val a2 = readLine()?.toDouble()!!

    println("Ingresa valor artículo 3:")
    val a3 = readln()?.toDouble()!!

    val valorNeto = a1+a2+a3
    val valorTotal = valorNeto + valorNeto*0.18

    println("Valor neto: $valorNeto")
    println("Valor total: $valorTotal")

}