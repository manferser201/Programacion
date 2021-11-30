package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3_Examen2021_Mañana_Azul {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String posicionReina, posicionRey;

        System.out.println("INTRODUCE LA POSICIÓN DEL REY");
        posicionRey = teclado.nextLine();

        System.out.println("INTRODUCE LA POSICIÓN DE LA REINA");
        posicionReina = teclado.nextLine();

        if (jaque(posicionRey, posicionReina)){
            System.out.println("LA REINA ESTÁ HACIENDO JAQUE AL REY");
        } else {
            System.out.println("LA REINA NO ESTÁ HACIENDO JAQUE");
        }

    }

    public static boolean jaque(String posRey,String posReina) {

        int posicionXRey, posicionYRey, posicionXReina, posicionYReina;
        String[][] tablero = new String[8][8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "-";
            }
        }

        posicionXRey = 8 - Integer.parseInt("" + posRey.charAt(1));
        posicionYRey = posicionLetra(posRey.charAt(0));
        posicionXReina = 8 - Integer.parseInt("" + posReina.charAt(1));
        posicionYReina = posicionLetra(posReina.charAt(0));

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (posicionXRey == i && posicionYRey == j){
                    tablero[i][j] = "R";
                }

                if (posicionXReina == i && posicionYReina == j){
                    tablero[i][j] = "D";
                }

            }
            System.out.println(Arrays.toString(tablero[i]));
        }


        if (posicionXReina == posicionXRey || posicionYReina == posicionYRey){
            return true;
        } else {
            int i = posicionXReina - 1;
            int j = posicionYReina - 1;

            while (pertenece(i, j, tablero)){
                if (tablero[i][j].equals("R")){
                    return true;
                }
                i--;
                j--;
            }

            i = posicionXReina + 1;
            j = posicionYReina + 1;

            while (pertenece(i, j, tablero)){
                if (tablero[i][j].equals("R")){
                    return true;
                }
                i++;
                j++;
            }

            i = posicionXReina + 1;
            j = posicionYReina - 1;

            while (pertenece(i, j, tablero)){
                if (tablero[i][j].equals("R")){
                    return true;
                }
                i++;
                j--;
            }

            i = posicionXReina - 1;
            j = posicionYReina + 1;

            while (pertenece(i, j, tablero)){
                if (tablero[i][j].equals("R")){
                    return true;
                }
                i--;
                j++;
            }
        }

        return false;
    }

    public static boolean pertenece (int x, int y, String[][] tablero) {

        return x >= 0 && x <= (tablero.length - 1) && y >= 0 && y <= (tablero.length - 1);
    }

    public static int posicionLetra (char letra){

        Character[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra){
                return i;
            }
        }

        return -1;
    }
}
