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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    int a=0;
    int b=0;
    int mayor=0;
    
    Scanner teclado=new Scanner(System.in);
    
    System.out.println("Digite primer numero");
    a = teclado.nextInt();
    
        System.out.println("Digite primer numero");
        b = teclado.nextInt();
        
        if (a>b){
            System.out.println("el numero mayor es " + a);}
        if (b>a) {
            System.out.println("el numero mayor es " + b);}
        if (a==b){
            System.out.println("Los numeros son iguales");}
            
        }
}
