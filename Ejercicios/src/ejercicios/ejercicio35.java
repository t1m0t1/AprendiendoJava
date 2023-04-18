
package ejercicios;
import java.util.Scanner;

public class ejercicio35 {

  
    public static void main(String args[]) {
        
        int num;
        int unidad;
        int decena;
        int centena; 
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero");
        num = teclado.nextInt();
        
        centena = num / 100;
        decena = (num - (centena*100)) / 10;
        unidad = num - (centena * 100 + decena * 10);
        
        System.out.println("La cantidad de centenas es " + centena);
        System.out.println("La cantidad de decenas es " + decena);
        System.out.println("La cantidad de unidades es " + unidad);
            }
    }

