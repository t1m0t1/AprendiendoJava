
package ejercicios;
import java.util.Scanner;


public class ejercicio32 {

   
    public static void main(String args[]) {
        
        int num;
        int cont=0;
        int i;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero a calcular");
        num = teclado.nextInt();
        
        for (i = 1 ; i<= num; i++ ){
        if ((num % i)==0){
        cont ++;
            }
        }
        if (cont <=2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");}
    }
        }
    
