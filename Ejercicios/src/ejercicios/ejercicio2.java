/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author ti3m
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("Digite un numero");
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        numero = teclado.nextInt();
        int anterior=numero-1;
        int posterior= numero+1;
        System.out.println("El numero anterior es " + anterior);
        System.out.println("El numero posterior es " + posterior);
    }
}
