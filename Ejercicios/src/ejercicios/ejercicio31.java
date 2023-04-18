
package ejercicios;
import java.util.Scanner;

public class ejercicio31 {


    public static void main(String args[]) {
        
        int numero;
        int fact;
        int a;
        
        Scanner teclado =new Scanner(System.in);
        
        System.out.println("Ingrese el numero a calcular");
        numero = teclado.nextInt();
        
        fact = numero;
        a = fact - 1;
        fact = fact * a;
        
        while (a != 1){
        a = a - 1;
        fact = fact * a;
        }
        
        System.out.println("el factorial de " + numero + " es: " + fact);
    }
    
}
