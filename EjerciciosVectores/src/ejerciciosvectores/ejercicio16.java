
package ejerciciosvectores;
import java.util.Scanner;


public class ejercicio16 {

    public static void main(String args[]) {
        
        Scanner teclado =new Scanner(System.in);
        
        int N;
        System.out.println("Increge la cantidad de elementos");
        N = teclado.nextInt();
        
        int a[] = new int [N];
        int SC=0;
        int i =0;
        
        for (i =0; i<a.length; i++){
            System.out.println("Ingrese el numero");
            a[i] = teclado.nextInt();
                if (a[i] < 10){
                a[i] = 0;
                }else{
                        if (a[i] > 20){
                        a[i] = 1;
                                }else{
                                        SC++;
                        }
                            }
        }
        for(i=0; i<a.length; i++){
            System.out.print(a[i] +",");
        }
        System.out.println(" ");
        System.out.println(SC);
               
    }
}
