
package ejercicios;
import java.util.Scanner;

public class ejercicio22 {

    
    public static void main(String args[]) {
        
        int limit;
        int post = 1;
        int aux = 0;
        int ant = 0;

        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese hasta que numero quiere calcular");
        limit = teclado.nextInt();
        
        while (aux<limit){
            ant = post;
            post = aux;
            aux = ant + post;


        System.out.println("Anterior es igual a : " + ant);
        System.out.println("Posterior es igual a : " + post);
        System.out.println("Fibonacci es igual a : " + aux);            
            
        }

    }
}
