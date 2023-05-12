package controladores;

import dominio.Cadena;
import java.util.Scanner;
public class controladorCadena {

    Scanner sc = new Scanner(System.in);

    public Cadena crearCadena() {
        Cadena cadena = new Cadena();

        System.out.println("ingrese la frase");
        cadena.setFrase(sc.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        return cadena;
    }

    public void mostrarVocales (Cadena cadena){

        int cont=0;
        for (int i = 0 ; i< cadena.getLongitud() ; i++ ){

            switch (cadena.getFrase().charAt(i)){

                case 'a', 'e' , 'i' , 'o' , 'u':
                    cont++;
                    break;
            }
        }
            System.out.println("La cantidad de vocales son: " + cont);
    }

    public String invertirFrase(Cadena cadena){

        StringBuilder sb = new StringBuilder(cadena.getFrase());
        sb.reverse();

        String inverter= String.valueOf(sb);



        return inverter;
    }


}

