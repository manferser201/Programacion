package com.company;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i+j;
            }

            System.out.println(Arrays.toString(a[i]));
        }
    }
}
