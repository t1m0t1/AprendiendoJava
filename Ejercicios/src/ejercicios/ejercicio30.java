
package ejercicios;
import java.util.Scanner;

public class ejercicio30 {


    public static void main(String args[]) {
        
        int num;
        int cant;
        int i;
        int cant3=0;
        int total=0;
        float promedio;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de numeros");
        cant = teclado.nextInt();
        
        for (i=0;i<cant;i++){
            System.out.println("ingrese un numero");
            num = teclado.nextInt();
            
        if (num%3==0 && num%5!=0) {
        total=total+num;
        cant3=cant3+1;
       
        }
        }
        promedio=total/cant3;
        System.out.println("El promedio es igual= "+promedio);
    }
}
