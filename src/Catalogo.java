public class Catalogo implements Agregado{
    private NodoCategoria raiz;
    public Catalogo(){
        raiz = new NodoCategoria("Terror");

        NodoCategoria accion = new NodoCategoria("Accion");
        NodoCategoria comedia = new NodoCategoria("Comedia");

        raiz.setIzquierda(accion);
        raiz.setDerecha(comedia);

        accion.agregarPelicula(new Pelicula("Machete","Accion", 10));
        accion.agregarPelicula(new Pelicula("SonComoNinos", "Comedia", 9.5));
        accion.agregarPelicula(new Pelicula("South Park", "Comedia", 8.7));
        accion.agregarPelicula(new Pelicula("Joker", "Accion", 8));
        accion.agregarPelicula(new Pelicula("It", "Terror", 9));
        accion.agregarPelicula(new Pelicula("Avengers", "Accion", 9.5));
        accion.agregarPelicula(new Pelicula("Chanfle", "Comedia", 7.9));
    }

    public NodoCategoria getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoCategoria raiz) {
        this.raiz = raiz;
    }

    @Override
    public Iterator createIterator(){
        return new PeliculaIterator(raiz);
    }
}
