/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author ti3m
 */
public class Ejercicios {

    public static void main(String[] args) {

//Var simples        
        int A = 10;
        int B = 20;
        int C = 30;

//Var de operaciones
        int suma;
        int resta;
        int multiplicacion;
        int division;

//Operaciones        
        suma = A + B + C;
        System.out.print("la suma es " + suma);
        
        resta = A - B;
        System.out.print("la resta es " + resta);
       
        multiplicacion = B * C;
        System.out.println("la multiplicacion es " + multiplicacion);

        if (C != 0) {
            division = A / C;
        } else {
            System.out.print("No se puede dividir entre 0");
        }
    }

}
