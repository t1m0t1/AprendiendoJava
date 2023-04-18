package ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author ti3m
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        int A[] = new int[10];
        int menor = 20;
        int mayor = 0;
        int cantMen = 0;
        int cantMay = 0;
        int entre1 = 0;
        int entre2 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las edades de 10 alumnos");

        for (int i = 0; i < A.length; i++) {
            System.out.println("Ingrese la edad");
            A[i] = teclado.nextInt();
            if (A[i] > mayor){
            mayor = A[i];}
            
            if (A[i] < menor){
            menor = A[i];}

            if (A[i] <= 12) {
                cantMen++;
            } else {
                if (A[i] >= 13 && A[i] <= 16) {
                    entre1++;
                } else {
                    if (A[i] >= 17 && A[i] <= 20) {
                        entre2++;
                    } else {
                        if (A[i] > 20) {
                            cantMay++;
                        }
                    }
                }
            }
        }
        System.out.println("La cantidad de mayores a 20 es: " + cantMay);
        System.out.println("La cantidad de menores a 12 es: " + cantMen);
        System.out.println("La cantidad de alumnos entre 13 y 16 es: " + entre1);
        System.out.println("La cantidad de alumnos entre 17 y 20 es: " + entre2);
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}
