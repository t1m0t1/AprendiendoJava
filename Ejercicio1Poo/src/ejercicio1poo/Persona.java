
package ejercicio1poo;
import java.util.Scanner;

public class Persona {
    private String Nombre;
    private int DNI;
    private int Edad;
    
    Scanner teclado = new Scanner(System.in);
    
    public Persona(){
    
    }
    public void Inicializar(){
        System.out.println("Ingrese el nombre y el apellido: ");
        Nombre = teclado.nextLine();
        System.out.println("Ingrese la edad: ");
        Edad = teclado.nextInt();
        System.out.println("Ingrese el DNI de la persona: ");
        DNI= teclado.nextInt();
    }

    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public int getDNI() {
        return DNI;
    }


    public void setDNI(int DNI) {
        this.DNI = DNI;
    }


    public int getEdad() {
        return Edad;
    }


    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void mostrar(){
        System.out.println("El nombre de la persona es: " + Nombre + "\n" + "Su edad es: " + Edad + "\n" + "y su Dni es: " + DNI);
    }
    
    public void esMayorDeEdad(){
        System.out.println("La persona es mayor de edad?: " + (Edad >= 18? "Si" : "No")); 
    }
}
