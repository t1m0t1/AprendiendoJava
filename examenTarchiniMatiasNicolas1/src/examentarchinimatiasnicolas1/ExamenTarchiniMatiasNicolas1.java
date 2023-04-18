
package examentarchinimatiasnicolas1;
import java.util.Scanner;

public class ExamenTarchiniMatiasNicolas1 {


    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int N=0;
       int masV1=0;
       int esp1=0;
       int esp2=0;
       int masV2=0;
       
        System.out.println("Ingrese la cantidad de espectaculos");
        N=teclado.nextInt();
        
        int espectaculo[]=new int [N];
        int ventas1 []=new int [N];
        int ventas2 []=new int [N];
        int promedio []=new int [N*2];
        
        for (int i=0; i<espectaculo.length;i++){
            System.out.println("Ingrese el codigo del espectaculo: ");
            espectaculo [i]=teclado.nextInt();
            
        }
        
        for (int i=0; i<ventas1.length;i++){
            System.out.println("Ingrese las ventas de cada espectaculo en el 1° semestre: ");
            ventas1 [i]=teclado.nextInt();
            
            if (ventas1 [i]>masV1){
            masV1=ventas1 [i];
            esp1=i;
            }
        }
        
    for (int i=0; i<ventas2.length;i++){
            System.out.println("Ingrese las ventas de cada espectaculo en el 2° semestre: ");
            ventas2 [i]=teclado.nextInt();
            
            if (ventas2 [i]>masV2){
            masV2=ventas2 [i];
            esp2=i;
            
                }
            }
    
        System.out.println("Espectáculo que más vendió en 1º semestre: " + espectaculo [esp1] + "-Cantidad vendida: " + masV1);
        System.out.println("Espectáculo que más vendió en 2º semestre: " + espectaculo [esp2] + "-Cantidad vendida: " + masV2);
    
        for(int i=0; i<promedio.length;i++){
        promedio [i]=espectaculo[i];
            System.out.println("Cod.Espectaculo   Promedio");
            System.out.print(promedio [i] + "   ");
            i++;
            promedio[i]=(ventas1[i] +ventas2[i])/2 ;
            System.out.print(promedio [i]);
            System.out.println(" ");
        }
     }
    
}
