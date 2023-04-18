
package Entidades;


public class Producto {
    
    private int CU;
    private String nombreProducto;
    private String cantidadProducto;

    public Producto(int CU, String nombreProducto, String cantidadProducto) {
        this.CU = CU;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
    }



    
    public int getCU() {
        return CU;
    }

    public void setCU(int CU) {
        this.CU = CU;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return  "CU=" + CU + ",Producto=" + nombreProducto + ", cantidad=" + cantidadProducto + '}';
    }

    
    
    
    
    
}
