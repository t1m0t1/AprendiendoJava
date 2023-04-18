
package ejerciciosvectores;
import java.util.Scanner;


public class ejercicio18 {

   
    public static void main(String args[]) {
        
        int a [] [] = new int [4] [4] ;
        
        int suma=0;
        Scanner teclado =new Scanner(System.in);
        
        System.out.println("Ingrese la matriz");
        
        for (int i = 0;i < a.length; i++){
            System.out.println("Ingrese los numeros de la fila " + i + " :");
            
            for (int j = 0;j <a[i].length; j++){
                System.out.println("Ingrese un numero: ");
                a [i] [j]= teclado.nextInt();
                suma = suma + a [i] [j];
            }
            
        }
        System.out.println("La suma total es: " + suma);
    }
}
