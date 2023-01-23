package ejercicio04.entidedas;

//import java.util.Comparator;

public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion; //tipos de dato de objeto (no es primitivo), por eso la mayuscula

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
//    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
//    @Override    
//    public int compare(Pelicula p1, Pelicula p2){
//       // return Double.compare(p1.getDuracion(),p2.getDuracion());
//       return p1.getDuracion().compareTo(p2.duracion);
//    }
//    
//    };
//     public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
//    @Override    
//    public int compare(Pelicula p1, Pelicula p2){
//        return p1.getDirector().compareTo(p2.getDirector());
//    }
//    
//    };
//     public static Comparator<Pelicula> compararNombre = new Comparator<Pelicula>(){
//    @Override    
//    public int compare(Pelicula p1, Pelicula p2){
//        return p1.getTitulo().compareTo(p2.getTitulo());
//    }
//    
//    };


    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
    
}//Class
