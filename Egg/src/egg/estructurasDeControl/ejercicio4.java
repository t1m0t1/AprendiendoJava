/*
 * Crear un programa que dado un número determine si es par o impar.
 */
package egg.estructurasDeControl;

import java.util.*;

/**
 * @author ti3m
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrse el numero a comparar");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es ");
        }

    }

}
