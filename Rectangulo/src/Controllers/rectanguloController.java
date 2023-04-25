package Controllers;

import Class.Rectangulo;
import java.util.Scanner;
public class rectanguloController {
    Scanner sc = new Scanner(System.in);
    public Rectangulo crearRectangulo(){
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        r1.setBase(sc.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(sc.nextDouble());
        return r1;
    }

    public Rectangulo
}
