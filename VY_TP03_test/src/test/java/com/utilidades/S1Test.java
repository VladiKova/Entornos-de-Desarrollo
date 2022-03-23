/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.utilidades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vladi
 */
public class S1Test {

    public S1Test() {
    }

    @Test
    public void testEsMayorQueCero() {

        assertAll(
                () -> assertFalse(S1.esMayorQueCero(-5),
                        "Numero negativo -> false"),
                () -> assertFalse(S1.esMayorQueCero(0), "Numero cero ->false"),
                () -> assertTrue(S1.esMayorQueCero(5), "Numero positivo ->true")
        );
    }

    @Test
    public void testEntreCeroYDiez() {
        assertAll(
                () -> assertFalse(S1.entreCeroYDiez(-5),
                        "Numero negativo-> false"),
                () -> assertFalse(S1.entreCeroYDiez(0),
                        "Numero cero-> false (Intervalo abierto)"),
                () -> assertTrue(S1.entreCeroYDiez(5),
                        "Numero positivo menor que 10-> true"),
                () -> assertFalse(S1.entreCeroYDiez(10),
                        "Numero 10-> false (Intervalo abierto)"),
                () -> assertFalse(S1.entreCeroYDiez(14),
                        "Numero mayor que 10-> false")
        );

    }

    @Test
    public void testNegativoPositivoCero() {

        assertAll(
                () -> assertEquals(S1.negativoPositivoCero(-2), 'n',
                        "Numero negativo -> retorna n"),
                () -> assertEquals(S1.negativoPositivoCero(5), 'p',
                        "Numero positivo -> retorna p"),
                () -> assertEquals(S1.negativoPositivoCero(0), 'c',
                        "Numero 0 -> retorna c")
        );
    }

    @Test
    public void testPagarEntrada() {
        assertAll(
                () -> assertEquals(S1.pagarEntrada(5), true,
                        "No paga entrada -> menor de edad"),
                () -> assertEquals(S1.pagarEntrada(30), false,
                        "Paga entrada -> mayor de edad y menor de 64"),
                () -> assertEquals(S1.pagarEntrada(65), true,
                        "No paga entrada -> mayor de 64"),
                () -> assertEquals(S1.pagarEntrada(64), false,
                        "Paga entrada -> limite de edad"),
                () -> assertEquals(S1.pagarEntrada(18), false,
                        "Paga entrada -> limite edad"),
                () -> assertNull(S1.pagarEntrada(-1), "Edad negativa no existe")
        );
    }

}
