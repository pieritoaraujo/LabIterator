import java.util.ArrayList;
import java.util.List;

public class NodoCategoria {
    private String categoria;
    private List<Pelicula> peliculas;

    private NodoCategoria izquierda;
    private NodoCategoria derecha;

    public NodoCategoria(String categoria) {
        this.categoria = categoria;
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula (Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public NodoCategoria getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoCategoria izquierda) {
        this.izquierda = izquierda;
    }

    public NodoCategoria getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoCategoria derecha) {
        this.derecha = derecha;
    }
}
