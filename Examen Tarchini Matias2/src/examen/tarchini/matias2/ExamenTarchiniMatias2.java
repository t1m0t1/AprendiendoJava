
package examen.tarchini.matias2;
//Importo clase Scanner
import java.util.Scanner;

public class ExamenTarchiniMatias2 {

    
    public static void main(String[] args) {
        
        //Creo objeto teclado 
        Scanner teclado = new Scanner(System.in);
        
        //Declaro Variables que nos serviran para dar dimension a la matriz.
        
        int N;
        int M;
        
        //Se le pide al usuario que increse la dimension de la matriz y se guarda en N y M.
        System.out.println("Ingrese la cantidad de filas: ");
        N = teclado.nextInt();

        System.out.println("Ingrese la cantidad de columnas: ");
        M = teclado.nextInt();

        //Se dimension la matriz A y la matriz resultante B (Ambas con las mismas dimensiones.
        int A[][] = new int[N][M];
        int B[][] = new int[N][M];

        //Carga de la matriz A
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("Ingrese los elementos de la fila " + i + "°");
                A[i][j] = teclado.nextInt();
                
                //Durante la carga preguntamos si el elemento de la matriz es negativo, de ser asi lo guardamos en la matriz B con el valor de 0.
                if (A[i][j] < 0) {
                    B[i][j] = 0;
                }
                //De no ser asi, le preguntamos si el elementeo es igual a 0, de ser asi le asignamos el valor de 1 en la matriz B.
                else {
                    if (A[i][j] == 0) {
                        B[i][j] = 1; 
                    }
                    //Al no cumplirse con las condiciones anteriores le preguntamos si es mayor a 0 y le asignamos el valor de 2.
                    // Este paso puede ser ovbiado, y solo poner else B[][]=2, sin preguntar Si el elemento es mayor a 0
                    else {
                        if (A[i][j] > 0) {
                            B[i][j] = 2;
                        }
                    }
                }
            }
        }
        //Se imprime linea en blanco
        System.out.println(" ");
        
        System.out.println("Matriz A");
        //Impresion de matriz A
        for (int i = 0; i < A.length; i++) {
            
            for (int j = 0; j < A[i].length; j++) {
               
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        System.out.println("Matriz B");
       
        //Impresion de matriz B
        for (int i = 0; i < A.length; i++) {
            
            for (int j = 0; j < A[i].length; j++) {
               
                System.out.print(B[i][j] + "  ");
            }
            System.out.println(" ");
        }
        
    }
    
}
