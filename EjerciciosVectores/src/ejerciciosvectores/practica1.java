
package ejerciciosvectores;
import java.util.Scanner;


public class practica1 {


    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int a [][]= new int [3][3];
        
        for (int j =0; j<a.length;j++){
            for (int i =0; i<a.length-1;i++){
            System.out.println("Ingrese el primer numero");
            a [i][j]= teclado.nextInt();
            
            i++;
            
            System.out.println("Ingrese el Segundo numero");
            a [i][j]= teclado.nextInt();
                
            
            
             a[2][j] = a [0][j] + a [1][j]; 
            }
        }
        System.out.println("Los resultados son:");
        System.out.println("La primera suma es: " + a[2][0]);
        System.out.println("La primera suma es: " + a[2][1]);
        System.out.println("La primera suma es: " + a[2][2]);
            
        
        }
    }

