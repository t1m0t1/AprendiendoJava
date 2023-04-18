
package tarchinimatiaspoo;
import java.util.Scanner;

public class TarchiniMatiasPOO {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("A continuacion ingrese la informacion del producto: ");
        System.out.println("Ingrese la marca del producto: ");
        String marca = teclado.nextLine();
        
        System.out.println("Ingrese la descripcion del producto: ");
        String descripcion = teclado.nextLine();
        
        System.out.println("Ingrese el codigo del producto: ");
        int codigo = teclado.nextInt();
        
        System.out.println("Ingrese el stock del producto: ");
        int stock = teclado.nextInt();
        
        System.out.println("Ingrese el punto de reposicion del producto: ");
        int puntoDeReposicion = teclado.nextInt();
        
        System.out.println("Ingrese el precio del producto: ");
        int precio = teclado.nextInt();
        
        Producto Producto1 = new Producto(marca , descripcion , codigo , stock , puntoDeReposicion , precio);
        
        boolean Salir = true;
        int Opcion;
        while (Salir) {
            
            System.out.println("Por favor ingrese la opreacion que desea realizar");
            System.out.println("1- Comprar");
            System.out.println("2- Vender");
            System.out.println("3- Reservar");
            System.out.println("4- Verificar Stock Bajo");
            System.out.println("5- Consultar Stock");
            System.out.println("6- Ver todos los datos del producto");
            System.out.println("7- Salir");
            System.out.println("Ingrese una opción: ");
            Opcion = teclado.nextInt();
            
             switch (Opcion) {
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = teclado.nextInt();
                    System.out.println("Ingrese el costo: ");
                    int costo = teclado.nextInt();
                    int compra = Producto1.Comprar(cantidad, costo);
                    System.out.println("el stock actual es: "+compra);
                    break;
                case 2: 
                    System.out.println("------------------------------------");
                    System.out.println("Ingrese la cantidad a vender: ");
                    cantidad = teclado.nextInt();
                    int vender=Producto1.Vender(cantidad);
                    if (vender == -1){
                        System.out.println("La venta no se pudo realizar por falta de stock");
                    }else{
                        System.out.println("El monto total de la venta es de: " + vender);
                    }
                    break;
                case 3:
                    System.out.println("------------------------------------");
                    System.out.println("Ingrese la cantidad que desea reservar");
                    cantidad = teclado.nextInt();
                    int reserva =Producto1.Reservar(cantidad);
                    if (reserva == -1){
                        System.out.println("El Stock es superior a 0");
                    }else{
                        System.out.println("La reserva se realizo correctamente \n el monto total es de: " + reserva);
                    }
                    break;
                case 4:
                    System.out.println("------------------------------------");
                    boolean verificacion=Producto1.VerificarStockBajo();
                    if (verificacion == false){
                        System.out.println("El Stock es optimo");
                    }else{
                        System.out.println("El Stock es bajo ");
                    }
                    break;
                case 5: 
                    System.out.println("------------------------------------");
                    System.out.println(Producto1.ConsultarStock());
                    break;
                case 6: 
                    System.out.println("------------------------------------");
                    System.out.println(Producto1.verTodos());
                    break;
                case 7:
                    System.out.println("------------------------------------");
                    System.out.println("Ha seleccionado la opcion 7 -Salir");
                    Salir = false;
                    break;
                default: 
                    System.out.println("------------------------------------");
                    System.out.println("Solo se permite opciones entre 1 y 7");
            }
    }
  }
}
