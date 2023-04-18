
package Entidades;

import java.util.ArrayList;


public class Tipo {
    
    private String nombreTipo;
    private ArrayList<Producto> productos = new ArrayList();

    public Tipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
    
    public void agregarProducto(Producto producto1){
        productos.add(producto1);
    }
    
    public void mostrarProductos(){
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Override
    public String toString() {
        return "Clase de Producto" + nombreTipo + '}';
    }
    
}
