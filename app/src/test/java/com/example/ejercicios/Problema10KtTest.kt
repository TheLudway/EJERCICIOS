package com.example.ejercicios


import org.junit.After
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.PrintStream

class Problema10KtTest {
    private val originalIn: InputStream = System.`in`
    private val originalOut: PrintStream = System.out
    private lateinit var outContent: ByteArrayOutputStream

    @Before
    fun setUpStreams() {
        // Simulamos las entradas del usuario
        val simulatedInput = "10\n100\n23\n-10\n-5\n"
        System.setIn(ByteArrayInputStream(simulatedInput.toByteArray()))

        // Capturamos las salidas del sistema
        outContent = ByteArrayOutputStream()
        System.setOut(PrintStream(outContent))
    }

    @After
    fun restoreStreams() {
        // restaura System.in y System.out a sus estados originales después de cada prueba.
        System.setIn(originalIn)
        System.setOut(originalOut)
    }

    @Test
    fun problema10_esCorrecto() {
        // Ejecutamos la función
        repeat(5) {
            problema10()
        }
        val ls = System.lineSeparator()
        // Verificamos las salidas
        val caso1 = "Dame num:"+ls+"Divisible."+ls
        val caso2 = "Dame num:"+ls+"Divisible."+ls
        val caso3 = "Dame num:"+ls+"No divisible."+ls
        val caso4 = "Dame num:"+ls+"Divisible."+ls
        val caso5 = "Dame num:"+ls+"No divisible."+ls

        val expectedOutput = caso1 + caso2 + caso3 + caso4 + caso5

        assertEquals(expectedOutput, outContent.toString())
    }
}