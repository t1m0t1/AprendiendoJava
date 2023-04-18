
package vectores;
import java.util.Scanner;
/**
 *
 * @author ti3m
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int a[] = new int[10];
        int cv = 0;

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un numero");
            a[i] = teclado.nextInt();

            if (n == a[i]) {
                cv++;
            }
        }
        System.out.println("La cantidad es: " + cv);
    }
    
}
