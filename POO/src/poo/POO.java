
package poo;
import java.util.Scanner;

public class POO {
   
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        CuentaBancaria Cuenta1 = new CuentaBancaria();
        
        System.out.println("Ingrese El Apellido: ");
        Cuenta1.setApellido(teclado.next());
        
        System.out.println("Ingrese El Nombre: ");
        Cuenta1.setNombre(teclado.next());
        
        
    }
    
}
