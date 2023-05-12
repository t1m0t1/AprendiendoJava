import controladores.controladorCadena;
import dominio.Cadena;

public class Main {
    public static void main(String[] args) {

        controladorCadena cc = new controladorCadena();

        Cadena cadena = cc.crearCadena();

        System.out.println(cadena);

        cc.mostrarVocales(cadena);

    }
}