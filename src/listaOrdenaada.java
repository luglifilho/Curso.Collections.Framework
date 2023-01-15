import java.util.ArrayList;
import java.util.List;

public class listaOrdenaada {

    public void main(String[] args) {

        List<Gato> meuGatos = new ArrayList<>() {
            {

                add(new Gato("João", 18, "preto"));
                add(new Gato("Marcos", 10, "amarelo"));
                add(new Gato("mirtes", 4, "branca"));

            }
        };

        System.out.println(meuGatos);
    }

    static class Gato implements Comparable {

        public String nome;
        public Integer idade;
        public String cor;

        public Gato(String nome, Integer idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        @Override
        public int compareTo(Gato g1, Gato g2) {

            return 0;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
}
