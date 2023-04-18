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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    
        int numero=0;
        String poligono= "";
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de lados del poligono");
        numero = teclado.nextInt();
        
        switch (numero){
            case 3: 
                System.out.println ("Triangulo");
                break;
            case 4:
                System.out.println ("Cuadrado");
                break;
            case 5:
                System.out.println ("Pentagono");
                break;
            default:
                System.out.println("El numero ingresado es incorrecto");
          
        }
    
    }
}
