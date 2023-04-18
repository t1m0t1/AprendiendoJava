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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        int num=0;
        int pos=0;
        int neg=0;
        int i=0;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese 5 numeros");
        
        for (i=0;i<5;i++){ num=teclado.nextInt();
        
        if (num>0){
        pos=pos+num;}
        else {
        neg=neg+num;}}
        System.out.println("El total de positivos es "+pos);
        System.out.println("El total de negaticos es "+neg);
    }
}
