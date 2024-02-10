package com.example.ejercicios

// Nombre: Ludwig Alvarado
// Fecha:
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema14()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema14() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    val num1 = readln().toInt()
    println("Dame num2:")
    val num2 = readln().toInt()
    println("Dame num3:")
    val num3 = readln().toInt()
    if ((num1 == num2 && num1 > num3) || (num3 == num1  && num3 > num2) || (num2 == num3 && num2 > num1) ){
        println("Hay un empate!")
    }else if (num1 > num2 && num1 > num3){
        println(num1)
    } else if(num2 > num1 && num2 > num3){
        println(num2)
    }else{
        println(num3)
    }

}