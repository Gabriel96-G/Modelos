public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private String genero;
    private short anioPublicacion;

    // Métodos
    //Constructor
    public Libro(String titulo, String autor, String genero, short anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;

    }

    // Constructor parcial
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        genero = null;
        anioPublicacion = 1800;
    }

    //Libro(String titulo, String autor){
        //this.titulo = titulo;
        //this.genero = genero;
        //genero = null;
        //anioPublicacion = 1800;
    //}

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public short getAnioPublicacion() {
        return anioPublicacion;
    }

   // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioPublicacion(short anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // equals()
    public boolean equals(Libro libro) {
        return this.titulo.equals(libro.titulo) && this.autor.equals(libro.autor) &&
                this.genero.equals(libro.genero) && (this.anioPublicacion == libro.anioPublicacion);

    }

    // toString()
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nGénero: + " + genero + "\nAño de publicación: " + anioPublicacion + "\n";
    }
}


