
package libro;
import java.util.Scanner;


public class Libro {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       
        String titulo;
        String autor;
        
        System.out.println("Ingrese el Titulo del libro");
        titulo= teclado.nextLine();
        
        System.out.println("Ingrese el Autor del libro");
        autor= teclado.nextLine();
        
        System.out.println("El titulo es : " + titulo);
        System.out.println("El autor es : " + autor);
        System.out.println("El libro " + titulo + " fue escrito por " + autor);
    }
    
}
