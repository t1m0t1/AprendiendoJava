//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.

package array;
import java.util.*;

/**
 *
 * @author ti3m
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int[] arr = new int[100];
        int cont = 1;
        for (int i = 0; i < 100; i++) {
            arr [i]=cont;
            cont++;
            System.out.println(arr[i]);
            
        }
    }

}
