package tarchinimatiaspoo;

public class Producto {

    private String Marca;
    private String Descripcion;
    private int Codigo;
    private int Stock;
    private int PuntoDeReposicion;
    private int Precio;

    public Producto() {
    }

    public Producto(String marca, String descripcion, int codigo, int stock, int puntoDeReposicion, int precio) {
        Marca = marca;
        Descripcion = descripcion;
        Codigo = codigo;
        Stock = stock;
        PuntoDeReposicion = puntoDeReposicion;
        Precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getPuntoDeReposicion() {
        return PuntoDeReposicion;
    }

    public void setPuntoDeReposicion(int PuntoDeReposicion) {
        this.PuntoDeReposicion = PuntoDeReposicion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int Comprar(int cantidad, int precio) {
        Stock = Stock + cantidad;
        Precio = precio;

        return Stock;
    }

    public int Vender(int cantidad) {
        int vender = 0;
        if (Stock >= cantidad) {
            Stock = Stock - cantidad;
            vender = (cantidad * Precio);

        } else {
            vender = -1;
        }
        return vender;
    }

    public int Reservar(int cantidad) {
        int reserva;
        if (Stock <= 0) {
            Stock = Stock - cantidad;
            reserva = ((cantidad * Precio) * 10) / 100;
        } else {
            reserva = -1;
        }
        return reserva;
    }

    public boolean VerificarStockBajo() {
        boolean verificacion = false;
        if (Stock < PuntoDeReposicion) {
            verificacion = true;
        }
        return verificacion;
    }

    public String ConsultarStock() {
        return "El Stock es de: " + Stock + "\n";
    }

    public String verTodos() {
        return "Marca: " + Marca + "\n" + "Descripcion: " + Descripcion + "\n" + "Codigo: " + Codigo + "\n" + "Stock: " + Stock + "\n" + "Punto de Reposicion: " + PuntoDeReposicion + "\n" + "Precio: " + Precio + "\n";
    }

}
