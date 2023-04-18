
package ejerciciosvectores;
import java.util.Scanner;


public class ejercicio2 {

   
    public static void main(String args[]) {
        
        int a[] = new int [10];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese 10 numeros para el vector");
        
        //ejercicio 2
        int suma = 0;
        int cantSum = 0;
        
        for ( int i = 0; i < a.length; i++){
            System.out.println("Ingrese un numero");
        a [i] = teclado.nextInt();
        
        if (a[i] >= 5){
        suma = suma + a[i];
        cantSum ++;}
            }
        System.out.println("La suma es de: " + suma);
        System.out.println("La cantidad de veces es de: " + cantSum);
        
    }
}
