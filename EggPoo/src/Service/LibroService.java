package Service;
import Class.Libro;
import java.util.Scanner;
public class LibroService {
    Scanner sc = new Scanner(System.in);

    public Libro crearLibro(){
        Libro libro = new Libro();
        System.out.println("Ingrese el ISBN del libro");
        libro.setISBN(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el Titulo del libro");
        libro.setTitulo(sc.nextLine());
        System.out.println("Ingrese el Autor del libro");
        libro.setAutor(sc.next());
        System.out.println("Ingrese el Numero de paginas del libro");
        libro.setNumeroDePaginas(sc.nextInt());
        System.out.println(libro.toString());

        return libro;
    }


}
