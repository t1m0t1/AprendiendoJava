
package examen;
import java.util.Scanner;

public class Examen {

    
    public static void main(String[] args) {
        
        int TI;
        int KM;
        int NPR;
        double CK = 0;
        int NP;
        double TO;
        double CP;
        
        System.out.println("Ingrese autobus");
        
        Scanner teclado = new Scanner(System.in);
        TI = teclado.nextInt();
        
        System.out.println("Ingrese la cantidad de kilometros a recorrer");
         KM = teclado.nextInt();
        
        System.out.println("ingrese la cantidad de personas");
        NPR = teclado.nextInt();
        
        if (TI == 1){
        CK = 2.00;}
        else {
        if (TI == 2){
        CK = 2.5;
        }else{
        CK = 3.00;}
        }
         if (NPR < 20){ NP = 20;
        }
        else{
        NP = NPR;}
        
        TO = NP * CK * KM;
        CP = TO / NPR;
        
        System.out.println("El costo por persona es " + CP);
        System.out.println("El costo total es " + TO);
    }   
    }
        
        
       
    