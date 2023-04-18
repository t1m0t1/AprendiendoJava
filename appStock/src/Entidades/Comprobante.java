
package Entidades;


public class Comprobante {
   
    private double precio;

    private String concepto;

    private int cantidad;

    private double total;


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getConcepto() {
        return concepto;
    }


    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }
    
}
