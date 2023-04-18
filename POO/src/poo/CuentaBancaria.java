
package poo;


public class CuentaBancaria {
    
    
    //Atributos de classe
    
    private String Apellido;
    private String Nombre;
    private int DNI;
    private int NCuenta;
    private int Saldo;
    private boolean EsCuentaCorriente;
    
    
    //Constructores
    public CuentaBancaria(){
        Apellido = "Montes";
        Nombre = "Emanuel";
        DNI = 35452698;
        NCuenta = 000001;
        Saldo = 500;
        EsCuentaCorriente = true;
        
    }
    public CuentaBancaria(String Apellido, String Nombre, int DNI, int NCuenta, int Saldo, boolean EsCuentaCorriente){
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.NCuenta = NCuenta;
        this.Saldo = Saldo;
        this.EsCuentaCorriente = EsCuentaCorriente;
        
    }
    
   

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the DNI
     */
    public int getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the NCuenta
     */
    public int getNCuenta() {
        return NCuenta;
    }

    /**
     * @param NCuenta the NCuenta to set
     */
    public void setNCuenta(int NCuenta) {
        this.NCuenta = NCuenta;
    }

    /**
     * @return the Saldo
     */
    public int getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the EsCuentaCorriente
     */
    public boolean isEsCuentaCorriente() {
        return EsCuentaCorriente;
    }

    /**
     * @param EsCuentaCorriente the EsCuentaCorriente to set
     */
    public void setEsCuentaCorriente(boolean EsCuentaCorriente) {
        this.EsCuentaCorriente = EsCuentaCorriente;
    }
    
   
}
