package com.utilidades;

/**
 *
 * @author Antonio Ramos
 */
public class S2 {
    public static String mesDelAnio(int mes){
        switch(mes){
            case 1:
                return "enero";
            case 2:
                return "febrero";
            case 3:
                return "marzo";
            case 4:
                return "abril";
            case 5:
                return "mayo";
            case 6:
                return "junio";
            case 7:
                return "julio";
            case 8:
                return "agosto";
            case 9:
                return "septiembre";
            case 10:
                return "octubre";
            case 11:
                return "noviembre";
            default:
                return "valor incorrecto";
        }
    }
    
    public static int diasDelMes(int mes){
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
                return 30;
            default:
                return -1;
        }
    }
    
    public static float media(float[] valores){
        float suma = 0f;
        
        for(int i = 1; i < valores.length; i++)
            suma += valores[i];
        return suma/valores.length;
    }
    
    public static int mayor(int[] valores){
        int mayor = 0;
        
        mayor = valores[0];
        for(int i = 1; i < valores.length; i++)
            if(mayor > valores[i])
                mayor = valores[i];
        return mayor;
    }
}
