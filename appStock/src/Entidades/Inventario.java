
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventario {
    
    private static ArrayList<Tipo> tipos = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    private static int UC=0;
    
    public static void main(String[] args) {
        
        int opcion =0;
        
        
        do{
            System.out.println("1- Agregar Producto");
            System.out.println("2- Agregar tipo de Producto");
            System.out.println("3- Mostrar listas de productos");
            System.out.println("4- Salir");
            System.out.println("Por Favor Elija una Opcion");
            opcion= sc.nextInt();
        
            switch(opcion){
                case 1:
                    System.out.println("Ingrese Los datos del producto separados por - . ejemplo Nombre-Cantidad");
                    sc.nextLine();
                    String[] datos = sc.nextLine().split("-");
                    UC++;
                    
                    Producto producto1 = new Producto(UC,datos[0],datos[1]);
                    
                    int numTipo=0;
                    String nombreTipo= "";
                    
                    if(tipos.isEmpty()){
                    numTipo =0;
                        System.out.println("Ingrese el tipo del producto");
                        nombreTipo = sc.nextLine();
                    }else{
                        for (int i = 0; i < tipos.size(); i++) {
                            System.out.println(i +"--->"+ tipos.get(i).getNombreTipo());  
                        }
                        System.out.println(tipos.size() +"----> Disponible");
                        
                        System.out.println("Seleccione un numero de tipo de producto");
                        numTipo=sc.nextInt();
                        
                        if(numTipo >= tipos.size()){
                            System.out.println("Ingese el nombre del tipo de producto");
                            
                            sc.nextLine();
                            nombreTipo=sc.nextLine();
                            
                        }
                    }
                    agregarProducto(numTipo,nombreTipo,producto1);
                
                
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Esta opcion no se encuentra disponible");
                    break;
            }
        }while(opcion !=4);
    }//Cierra main
    
    public static void agregarProducto(int numTipo,String nombreTipo, Producto producto1){
        if(numTipo<tipos.size()){
            tipos.get(numTipo).agregarProducto(producto1);
        }else{
        Tipo tipo1 = new Tipo(nombreTipo);
        tipo1.agregarProducto(producto1);
        tipos.add(tipo1);
        }
        System.out.println(tipos);
        for (int i = 0; i < tipos.size(); i++) {
           tipos.get(i).mostrarProductos();
        }
    }
    
}
