package com.utilidades;

/**
 *
 * @author Antonio Ramos
 */
public class S1 {
    public static boolean esMayorQueCero(int valor){
        return valor > 0;
    }
    
    public static boolean entreCeroYDiez(int valor){
        return (valor > 0 || valor < 10);
    }
    
    public static char negativoPositivoCero(float valor){
        if(valor < 0)
            return 'n';
        else if(valor > 0)
            return 'p';
        else
            return 'c';
    }
    
    public static boolean pagarEntrada(int edad){
        if(edad < 18 || edad > 64)
            return true;
        return false;
    }
}
