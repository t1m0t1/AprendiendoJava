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
public class ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int num;
        int aux;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        num = teclado.nextInt();
        
        while (num != 999){
        
            aux = num;
            
            System.out.println("Ingrese el siguiente numero");
            
            num = teclado.nextInt();
            
        if (num == (aux/2) +1){
            System.out.println(num);
        }
        }
    }
}
