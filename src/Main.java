void main() {
    Catalogo catalogo = new Catalogo();
    Iterator iterator = catalogo.createIterator();

    System.out.println("Esto es el catalogo");

    while (iterator.hasNext()){
        Pelicula pelicula = iterator.next();

        System.out.println(
                "| Titulo: " + pelicula.getTitulo() +
                        "- Genero: " + pelicula.getGenero() +
                        "- Ranking: " + pelicula.getRanking()
        );
    }
}