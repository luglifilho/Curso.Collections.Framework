package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> consteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos =new LinkedHashSet<>();

        public void inscreverBootcamp(Bootcamp bootcamp) {
            this.consteudosInscritos.addAll(bootcamp.getConteudos());
            bootcamp.getDevsInscritos().add(this);


         }
        public void progredir() {
            Optional<Conteudo> conteudo = this.consteudosInscritos.stream().findFirst();
            if (conteudo.isPresent()){
                this.conteudosConcluidos.add(conteudo.get());
                this.consteudosInscritos.remove(conteudo.get());
            }else {
                System.err.println("Você não está matriculado em nenhum conteudo!");

            }
        }

        public double calcularTotalXp() {
            return this.conteudosConcluidos.stream()
                    .mapToDouble(conteudo -> conteudo.calcularXP())
                    .sum();


        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConsteudosInscritos() {
        return consteudosInscritos;
    }

    public void setConsteudosInscritos(Set<Conteudo> consteudosInscritos) {
        this.consteudosInscritos = consteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConsteudosInscritos(), dev.getConsteudosInscritos()) && Objects.equals(getConteudosConcluidos(), dev.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConsteudosInscritos(), getConteudosConcluidos());
    }
}
