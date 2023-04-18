
package ejercicios;
import java.util.Scanner;


public class ejercicio33 {


    public static void main(String args[]) {
        
        // Variables
        int i;
        int divSum = 0;
        int num = 0 ;
       
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero a calcular");
        num = teclado.nextInt();
        
        int perfecto = num - 1;
        
        for (i=1;i <= perfecto;i++){
            
            if (num % i == 0){
            divSum = divSum + i;}
            }
        if (num == divSum){
            System.out.println("El numero es perfecto");}
        else{
            System.out.println("El numero no es perfecto");}
    }
}
