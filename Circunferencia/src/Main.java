import Service.circunferenciaService;
import Class.Circunferencia;
public class Main {
    public static void main(String[] args) {
        circunferenciaService service = new circunferenciaService();
        Circunferencia c1 = service.crearCircunferencia();
        service.area(c1);
        service.perimetro(c1);
    }
}