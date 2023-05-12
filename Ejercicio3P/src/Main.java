import dominio.Persona;
import servicios.SPersona;

public class Main {
    public static void main(String[] args){

        SPersona sp = new SPersona();

        Persona p1 = new Persona("roberto",25,'m',80,1.85);
        Persona p2 = new Persona("lara",28,'f',77,1.60);
        Persona p3 = new Persona("manolo",35,'m',105,1.80);

        Persona [] personas= {p1, p3, p2};
        int [] imc = new int [3];
        boolean [] edad = new boolean [3];


        for (int i=1; i< personas.length;i++){
            imc [i]= sp.calcularIMC(personas[i]);
            edad [i]= sp.esMayorDeEdad(personas[i]);
        }


    }
}