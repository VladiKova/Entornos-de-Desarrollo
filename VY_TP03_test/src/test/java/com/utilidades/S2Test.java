/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.utilidades;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vladi
 */
public class S2Test {

    public S2Test() {
    }

    @Test

    public void testMesDelAnio() { //Arraylist

     /**  ArrayList< String> listaMeses = new ArrayList<String>();
        listaMeses.add("enero");
        listaMeses.add("febrero");
        listaMeses.add("marzo");
        listaMeses.add("abril");
        listaMeses.add("mayo");
        listaMeses.add("junio");
        listaMeses.add("julio");
        listaMeses.add("agosto");
        listaMeses.add("septiembre");
        listaMeses.add("octubre");
        listaMeses.add("noviembre");
        listaMeses.add("diciembre");
        ArrayList< Integer> numeroMes = new ArrayList<>();
        listaMeses.add("1");
        listaMeses.add("2");
        listaMeses.add("3");
        listaMeses.add("4");
        listaMeses.add("5");
        listaMeses.add("6");
        listaMeses.add("7");
        listaMeses.add("8");
        listaMeses.add("9");
        listaMeses.add("10");
        listaMeses.add("11");
        listaMeses.add("12");
        assertLinesMatch(S2.mesDelAnio(Integer.parseInt(numeroMes)),
                listaMeses); */

        //He llegado hasta ahí con el el arraylist, despues no deja convertir en el numero del mes al int, sin embargo
        //creo que es el problema del metodo, puesto que solo recibe un parametro cada vez, por lo tanto creo que funconaría
        //cambiando el método. De todas formas no me acordaba muy bien lo que dijiste el lunes de la forma correcta de hacerlo
     
     assertAll(
                () -> assertEquals(S2.mesDelAnio(1), "enero",
                        "El mes 1 es enero"),
                () -> assertEquals(S2.mesDelAnio(2), "febrero",
                        "El mes 2 es febrero"),
                () -> assertEquals(S2.mesDelAnio(3), "marzo",
                        "El mes 3 es marzo"),
                () -> assertEquals(S2.mesDelAnio(4), "abril",
                        "El mes 4 es abril"),
                () -> assertEquals(S2.mesDelAnio(5), "mayo",
                        "El mes 5 es mayo"),
                () -> assertEquals(S2.mesDelAnio(6), "junio",
                        "El mes 6 es junio"),
                () -> assertEquals(S2.mesDelAnio(7), "julio",
                        "El mes 7 es julio"),
                () -> assertEquals(S2.mesDelAnio(8), "agosto",
                        "El mes 8 es agosto"),
                () -> assertEquals(S2.mesDelAnio(9), "septiembre",
                        "El mes 9 es septiembre"),
                () -> assertEquals(S2.mesDelAnio(10), "octubre",
                        "El mes 10 es octubre"),
                () -> assertEquals(S2.mesDelAnio(11), "noviembre",
                        "El mes 11 es novimebre"),
                () -> assertEquals(S2.mesDelAnio(12), "diciembre",
                        "El mes 12 es diciembre")
        );

    }

    @Test
    public void testDiasDelMes() {
        assertAll(
                () -> assertEquals(S2.diasDelMes(1), 31, "Enero tiene 31 ddías"),
                ()
                -> assertEquals(S2.diasDelMes(2), 28, "Febrero tiene 28 días"),
                () -> assertEquals(S2.diasDelMes(3), 31, "Marzo tiene 31 días"),
                () -> assertEquals(S2.diasDelMes(4), 30, "Abril tiene 30 días"),
                () -> assertEquals(S2.diasDelMes(5), 31, "Mayo tiene 31 días"),
                () -> assertEquals(S2.diasDelMes(6), 30, "Junio tiene 30 días"),
                () -> assertEquals(S2.diasDelMes(7), 31, "julio tiene 31 días"),
                () -> assertEquals(S2.diasDelMes(8), 31, "Agosto tiene 31 días"),
                () -> assertEquals(S2.diasDelMes(9), 30,
                        "Septiembre tiene 30 días"),
                () -> assertEquals(S2.diasDelMes(10), 31,
                        "Octubre tiene 31 días"),
                () -> assertEquals(S2.diasDelMes(11), 30,
                        "Noviembre tiene 30 días"),
                () -> assertEquals(S2.diasDelMes(12), 31,
                        "Diciembre tiene 31 días"),
                () -> assertEquals(S2.diasDelMes(0), -1,
                        "Valor >1 y >12 es inválido"),
                () -> assertEquals(S2.diasDelMes(13), -1,
                        "Valor >1 y >12 es inválido")
        );

    }

    @Test
    public void testMedia() {
        float[] num = new float[]{2.2f, 3.4f, 5.6f, 10.1f}; //Aqui puedo ir cambiado los numeros cada vez que quiera testear
        float suma = 0f;
        float media = 0;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];

        }
        media = suma / num.length;

        assertEquals(S2.media(new float[]{2.2f, 3.4f, 5.6f, 10.1f}), media,
                "Las medias de los dos arrays tiene que coincidir");

    }

    @Test
    public void testMayor() {

        int[] probar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mayor = 0;
        mayor = probar[0];
        for (int i = 1; i < probar.length; i++) {
            if (probar[i] > mayor) {
                mayor = probar[i];

            }

        }
        assertEquals(S2.mayor(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), mayor);

    }

}
