/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
package egg.estructurasDeControl;

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
        
        System.out.println("ingrese la palabra a comparar");
        String palabra = teclado.next();
        
        if(palabra.equalsIgnoreCase("eureka")) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
        
        
    }
    
}
