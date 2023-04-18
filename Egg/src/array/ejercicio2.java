/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package array;

import java.util.*;

/**
 *
 * @author ti3m
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
//            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);

        }

        System.out.println("Ingrese el numero que desea buscar");
        int num = teclado.nextInt();

        encontrar(num, arr);
    }

    public static void encontrar(int num, int[] arr) {
        int repetido = 0;
        boolean encontrado = false;
        int donde = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                if (encontrado == false) {
                    donde = i;
                    encontrado = true;
                } else {
                    repetido++;
                }

            }
        }
        if (encontrado) {
            if (encontrado && repetido > 0) {
                System.out.println("El numero se encuentra en la posicion " + donde + " y se repite: " + repetido + " veces");
            } else {
                System.out.println("El numero se encuentra en la posicion " + donde);
            }
        } else {
            System.out.println("El numero no existe");
        }

    }
}
