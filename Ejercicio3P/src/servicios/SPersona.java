package servicios;

import dominio.Persona;

import java.util.Scanner;

public class SPersona {
    Scanner sc = new Scanner(System.in);
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingrese el nommbre de la persona");
        persona.setNombre(sc.nextLine());

        System.out.println("Ingrese la edad de la persona");
        persona.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el sexo de la persona");
        persona.setSexo(sc.next().charAt(0));
        System.out.println("Ingrese la altura de la persona");
        persona.setAltura(sc.nextDouble());
        System.out.println("Ingrese el peso de la persona");
        persona.setPeso(sc.nextDouble());

        return persona;
    }

    public boolean esMayorDeEdad(Persona persona){
        boolean mayor = false;
            if (persona.getEdad() >= 18){
                mayor=true;
            }
        return mayor;
    }

    public int calcularIMC (Persona persona){
        int res;
        double imc = persona.getPeso()/ Math.pow(persona.getAltura(),2);

        if(imc < 20){
            res=-1;
        }else if(imc >= 20 && imc <= 25){
            res=0;
        }else{
            res=1;
        }

        return res;
    }

 public void pEdades(boolean personas []){

        int mayor=0;
        int menor=0;
        for (int i = 0 ; i < personas.length ; i++ ){
            if(personas[i]){
                mayor++;
            }else{
                menor++;
            }
        }
        if (mayor > 0){

         System.out.println("El porcentaje de mayores de edad es de: " + (mayor / 4 * 100));
        }
 }
}
