/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosvectores;
import java.util.Scanner;

/**
 *
 * @author ti3m
 */
public class prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
       // declaro arreglo y tipo de datos
        
        int a [] = new int[10];
        int cv =0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese el numero N");
        int n = teclado.nextInt();
        
        // carga del arreglo
        
        for (int i = 0; i < a.length; i ++){
            System.out.println("Ingrese un numero: ");
            a [i] = teclado.nextInt();
            
            if (n == a[i]){
                cv ++;
            }
            
        }
        System.out.println("la cantidad es: "+ cv);
    }
}
