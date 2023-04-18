package ejerciciosvectores;

import java.util.Scanner;

public class EjercicioPractico3 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        //Inicializo variables
        int a[] = {15,64,13,22,12,39,45,98,77,18};
        int b[] = {27,15,32,45,68,88,92,18,66,18};
        int union[] = new int[20];
        int inter[] = new int[20];
        int i = 0;
        int j = 0;
        int in = 0;
        int un = 0;

        boolean B = false;

        //Primera parte de union 
        while (i < 10) {
            union[un] = a[i];
            i++;
            un++;
        }
        i = 0;

        //Interseccion
        while (j < 10) {

            while (i < 10 && B == false) {
                if (b[j] == a[i]) {
                    B = true;
                }
                i++;
            }
            if (B == true) {
                inter[in] = b[j];
                B = false;
                in++;
                j++;
            } else {
                union[un] = b[j];
                un++;
                j++;
            }
        }
        //Mostras union

        System.out.println("El vector union es: ");
        for (int mu1 = 0; mu1 < un; mu1++) {

            System.out.print(union[mu1] + ",");
        }

        System.out.println(" ");

        //Mostrar Interseccion
        
        System.out.println(" ");
        System.out.println("El vector interseccion es: ");

        for (int mu2 = 0; mu2 < in; mu2++) {
            System.out.print(inter[mu2] + ",");
            
        }
        System.out.println(" ");
        
    }
}
