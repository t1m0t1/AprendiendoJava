/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author ti3m
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros");
        int N = teclado.nextInt();
        
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];
        
        //Genero los vectores
        for (int i = 0; i < A.length; i++) {
            System.out.println("Ingrese un número de A: ");
            A[i] = teclado.nextInt();  
        }
        int i = 0;
        for (int j = 0; j < B.length; j++) {
            B[j] = A[i] * A[i];    
        }
        int y =0;
        for (int k = N-1; k > 0; k--) {
            C[k] = B[y];
            y++;
        }
        int k = 0;
        for (i = 0; i < D.length; i++) {
            D[i] = B[k] - C[k];
            k++;
        }
        
        //Impresiones
        System.out.println("Vector B: ");
        for (int c = 0; c < B.length; c++) {
            System.out.println(B[c]);
        }
    }
}
    
