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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
       int x=0;
       int y=0;
       int aux=0;
       
       Scanner teclado =new Scanner(System.in);
       
       System.out.println("digite un numero");
       x=teclado.nextInt();
       
       System.out.println("Digite segundo numero");
       y=teclado.nextInt();
       
       aux = x;
       x = y;
       y = aux;
       
       System.out.println("x es igual a " +x);
       System.out.println("y es igual a " +y);
    }
}
