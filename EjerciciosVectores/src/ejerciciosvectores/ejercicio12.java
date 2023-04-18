
package ejerciciosvectores;
import java.util.Scanner;


public class ejercicio12 {


    public static void main(String args[]) {
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de alumnos;");
        int N = teclado.nextInt();
        N=N*2;
        
        int a [] = new int [N];
    int b [] = new int [N/2];
    int j = 0;
    int apro=0;
    int des=0;
    int cantA=0;
    int cantD=0;
    int i = 0 ;
        System.out.println("Ingresar alumno y nota: ");
        
        for (i = 0; i<a.length ; i++){
            System.out.println("ingrese alumno");
            a [i] = teclado.nextInt();
                i++;
                    System.out.println("Ingrese nota del alumno");
                    a [i] = teclado.nextInt();
                        
                    if (a [i] >= 6 ){
                        apro = apro + a [i];
                        cantA ++;
                        
                        i--;
                        b [j] = a [i];
                        i++;
                        j++;
                        
                    }else{
                        des = des + a [i];
                        cantD ++;
                    }
        }
        
        for (int h=0; h<j; h++){
            System.out.print(b [h] + ",");
        }
        apro = apro / cantA;
        des = des / cantD;
        
        System.out.println(" ");
        System.out.println("el promedio de los alumnos aprobados es: " + apro );
        System.out.println("el promedio de los alumnos desaprobados es " + des);
        
    }
}
