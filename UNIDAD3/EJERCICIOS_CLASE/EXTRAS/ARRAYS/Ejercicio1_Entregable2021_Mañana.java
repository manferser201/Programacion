package com.company;
import java.util.Arrays;

public class Ejercicio1_Entregable2021_Mañana {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {};

        System.out.println(Arrays.toString(mezcla(a, b)));
    }

    public static int[] mezcla (int[] a, int[] b){
        
        int[] resultado = new int[(a.length + b.length)];
        int[] auxiliar;
        int i = 0, j = 0, puntero = 0;
        
        if (mayor(a,b)){
            while (i < a.length && j < b.length){
                resultado[puntero] = a[i];
                puntero++;

                resultado[puntero] = b[j];
                puntero++;

                i++;
                j++;
            }

            for (int k = i; k < a.length; k++) {
                resultado[puntero] = a[k];
                puntero++;
            }

        } else if(a.length == b.length){
            while (i < a.length && j < b.length){
                resultado[puntero] = a[i];
                puntero++;

                resultado[puntero] = b[j];
                puntero++;

                i++;
                j++;
            }

        } else {
            while (i < a.length && j < b.length){
                resultado[puntero] = a[i];
                puntero++;

                resultado[puntero] = b[j];
                puntero++;

                i++;
                j++;
            }

            for (int k = j; k < b.length; k++) {
                resultado[puntero] = b[k];
                puntero++;
            }
        }

        return resultado;
    }
    
    public static boolean mayor (int[] a, int[] b){
        
        if (a.length > b.length){
            return true;
        }
        return false;
    }
}
