/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.estructurasDeControl;

import java.util.*;

/**
 *
 * @author ti3m
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el limite");
        int limite = teclado.nextInt();
        int suma = 0;

        
        while (suma < limite) {            
        System.out.println("Ingrese un numero a sumar");
        int numero = teclado.nextInt();
             suma += numero;
            
        }
        
        System.out.println("El numero es:" + suma + " y el limite es " + limite);

    }
    
}
