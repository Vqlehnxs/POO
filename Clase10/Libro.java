package Clase10;

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int aniodepublicacion;
    private int numerodepaginas;
    private boolean prestado;

    //constructor
    public Libro(String titulo, String autor, int aniodepublicacion, int numerodepaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.aniodepublicacion = aniodepublicacion;
        this.numerodepaginas = numerodepaginas;
        this.prestado = false; // Por defecto, el libro no está prestado
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAniodepublicacion() {
        return aniodepublicacion;
    }
    public int getNumerodepaginas() {
        return numerodepaginas;
    }
    public boolean isPrestado() {
        return prestado;
    }   
    
    //setters
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAniodepublicacion(int aniodepublicacion) {
        this.aniodepublicacion = aniodepublicacion;
    }
    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }
    //Metodos de negocio
    public boolean prestar() {
        if (!this.prestado) {
            this.prestado = true;
            return true; // Préstamo exitoso
        }
        return false; // El libro ya está prestado
    }
    public boolean devolver() {
        if (this.prestado) {
            this.prestado = false;
            return true; // Devolución exitosa
        }
        return false; // El libro no estaba prestado
    }
    // Metodo toStrign
    @Override
    public String toString() {
        return "Libro{" + "Titulo='" + titulo + '\'' + ", Autor='" + autor + '\'' + ", Año de publicacion=" + aniodepublicacion + ", Numero de paginas=" + numerodepaginas + ", Prestado?=" + prestado +'}';
    }
}
