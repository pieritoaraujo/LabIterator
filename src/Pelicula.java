public class Pelicula {
    private String titulo;
    private String genero;
    private double ranking;

    public Pelicula(String titulo, String genero, double ranking) {
        this.titulo = titulo;
        this.genero = genero;
        this.ranking = ranking;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }
}
