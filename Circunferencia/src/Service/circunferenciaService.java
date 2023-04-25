package Service;
import java.util.Scanner;
import Class.Circunferencia;
public class circunferenciaService {
    Scanner sc = new Scanner(System.in);
    public Circunferencia  crearCircunferencia(){
        System.out.println("ingrese el radio");
        double radio = sc.nextDouble();
        Circunferencia c1 = new Circunferencia(radio);
        return c1;
    }

    public double area(Circunferencia c1){

        double area= Math.pow(Math.PI * c1.getRadio(),2);
        System.out.println("El area es igual a " + area);
        return area;
    }

    public double perimetro(Circunferencia c1){
        double perimetro= 2* Math.PI * c1.getRadio();
        System.out.println("El perimetro es igual a " + perimetro);
        return  perimetro;
    }
}
