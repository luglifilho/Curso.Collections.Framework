import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Set<Serie> minhasSeries = Collections.unmodifiableSet(new HashSet<Serie>() {
            add(new Serie(nome:"got", genero:"fantasia", tempoEpisodio:60));

            void add(new Serie(nome:"batman", genero:"policial", tempoEpisodio:90));

            void add(new Serie(nome:"robin", genero:"açao", tempoEpisodio:60));
        });

        System.out.println("Hello world!");
    }
}

class serie{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof serie serie)) return false;
        return getNome().equals(serie.getNome()) && getGenero().equals(serie.getGenero()) && getTempoEpisodio().equals(serie.getTempoEpisodio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getTempoEpisodio());
    }

    public serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }


}