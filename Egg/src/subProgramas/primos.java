/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subProgramas;
import java.util.*;

/**
 *
 * @author ti3m
 */
public class primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero que desea comprobar si es primo");
        int num = teclado.nextInt();
        
        boolean primo = false;
         int anterior = num--;
         
        for (int i = 2; i < anterior; i++) {
            
            System.out.println("i: "+i+ "num: "+num);
            
            if (num % i != 0) {
                primo = true;
            }
        }
        System.out.println("primo= " + primo);
    }

}
