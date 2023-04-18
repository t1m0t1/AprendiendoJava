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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int A=0;
        int B=0;
        int C=0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("digite el primer numero");
        A= teclado.nextInt();
        
        System.out.println("digite el segundo numero");
        B= teclado.nextInt();
        
        System.out.println("digite el tercer numero");
        C= teclado.nextInt();
        
        if (A==B && A==C && B==C){
            System.out.println("Los numeros son iguales");
        }else{
            if (A!=B){
                if (A>B){
                    if (A!=C){
                        if (A>C){
                   System.out.println("El primer numero es el mayor");}
               }
               }
                } else {
                   System.out.println("Los dos primeros numeros son iguales");}

               if (B!=C){
                if (B>C){
                    System.out.println("El segundo numero es el mayor");}
               else {System.out.println("El tercer numero es el mayor");}
               } else {System.out.println("Los dos ultimos numeros son iguales");}
    }
    }
}
