/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subProgramas;
import java.util.*;

/**
 *
 * @author ti3m
 */
public class codificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese una frase que termine con un punto(.)");
        String frase = teclado.nextLine();
        String res= "";
        
        int con= 0;
        int con1= 1;
        int a,b;
        while ( !frase.substring(con,con1).equals(".")){
            System.out.println(frase.substring(con, con1));
            switch(frase.substring(con,con1)){
                case "a":
                    res =res.concat("@");
                    break;
                case "e":
                    res =res.concat("#");
                    break;
                case "i":
                    res =res.concat("$");
                    break;
                case "o":
                    res =res.concat("%");
                    break;
                case "u":
                    res =res.concat("*");
                    break;
                default:
                    res =res.concat(frase.substring(con,con1));
                    break;
            }
            con++;
            con1++;
        }
        System.out.println(res);
        
        
        
        
    }

}
