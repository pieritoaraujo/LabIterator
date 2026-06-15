import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class PeliculaIterator implements Iterator{
    private Stack<NodoCategoria> pila;
    private List<Pelicula> peliculasActual;
    private int indice;

    public PeliculaIterator(NodoCategoria raiz) {
        pila = new Stack<>();

        if (raiz != null){
            pila.push(raiz);
        }

        peliculasActual = new ArrayList<>();
        indice = 0;

        cargarCategoria();
    }

    private void cargarCategoria(){
        while (!pila.isEmpty()){
            NodoCategoria actual = pila.pop();

            if (actual.getDerecha() != null){
                pila.push(actual.getIzquierda());
            }

            peliculasActual = actual.getPeliculas();

            if (!peliculasActual.isEmpty()){
                indice = 0;
                return;
            }
        }
        peliculasActual = null;
    }
    @Override
    public boolean hasNext(){
        if (peliculasActual == null){
            return false;
        }
        if (indice < peliculasActual.size()){
            return true;
        }
        cargarCategoria();

        return peliculasActual != null;
    }

    @Override
    public Pelicula next(){
        Pelicula pelicula = peliculasActual.get(indice);

        indice++;

        return pelicula;
    }
}
