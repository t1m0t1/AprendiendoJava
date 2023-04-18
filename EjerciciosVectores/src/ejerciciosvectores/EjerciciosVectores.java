package ejerciciosvectores;
import java.util.Scanner;

public class EjerciciosVectores {

    public static void main(String[] args) {

        int a[] = new int[10];
        int cv = 0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int n = teclado.nextInt();

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un numero");
            a[i] = teclado.nextInt();

            if (n == a[i]) {
                cv++;
            }
        }
        System.out.println("La cantidad es: " + cv);
    }

}
