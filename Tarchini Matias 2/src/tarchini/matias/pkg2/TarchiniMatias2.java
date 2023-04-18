
package tarchini.matias.pkg2;
import java.util.Scanner;


public class TarchiniMatias2 {
    
    
    public static void main(String[] args) {
    
        int c = 1;
        int suma = 0;
        int n;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        n = teclado.nextInt();
        
        
        while (c <= n){
            if (c % 2 == 0){
            suma = suma + c;
            System.out.print(c + ",");
            }c++;
        }
        System.out.println(" ");
        System.out.println("La suma es " + suma);
       
    }
    
}
