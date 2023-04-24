package Class;

public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroDePaginas;

    public Libro (){

    }
    public Libro (int ISBN , String Titulo , String Autor , int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        NumeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", NumeroDePaginas=" + NumeroDePaginas +
                '}';
    }
}
