/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subProgramas;

import java.util.*;

/**
 *
 * @author ti3m
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matriz2 = {{1, -2, 3}, {4, 55, 6}, {7, 8, 9}};
        int[][] matrizT = new int[3][3];
        int[][] matrizT2 = new int[3][3];
        int[][] matrizAT = new int[3][3];
        int[][] matrizAT2 = new int[3][3];

        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                int res;
                matrizT[j][i] = matriz[i][j];
                matrizT2[j][i] = matriz2[i][j];

            }
        }

        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {

                matrizAT[i][j] = matrizT[i][j] * (-1);
                matrizAT2[i][j] = matrizT2[i][j] * (-1);
            }
        }

        System.out.println(comparar(matriz, matrizAT));
        System.out.println(comparar(matriz2, matrizAT2));

    }

    public static boolean comparar(int[][] matriz1, int[][] matriz2) {
        boolean isAntisimetrica = true;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if (matriz1[i][j] == matriz2[i][j]) {
                } else {
                    isAntisimetrica = false;
                }

            }
        }
        return isAntisimetrica;
    }

}
