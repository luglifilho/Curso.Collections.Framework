import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descricao do curso de JavaScript");
        curso2.setCargaHoraria(10);






        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de JAVA");
        mentoria.setDescricao("descriçao da mentoria de JAVA");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
            bootcamp1.setNome("Bootcamp Java developer");
            bootcamp1.setDescricao("Derscriçao deste bootcamp JAVA");
            bootcamp1.getConteudos().add(curso1);
            bootcamp1.getConteudos().add(curso2);
            bootcamp1.getConteudos().add(mentoria);

        Dev desenvolvedor1 = new Dev();
        desenvolvedor1.setNome("Daniel");
        desenvolvedor1.inscreverBootcamp(bootcamp1);
        desenvolvedor1.progredir();
        System.out.println("Conteudos Inscritos" + desenvolvedor1.getConsteudosInscritos());
        System.out.println("Conteudos Concluidos" + desenvolvedor1.getConteudosConcluidos());
        System.out.println("XP: " + desenvolvedor1.calcularTotalXp());


        Dev desenvolvedor2 = new Dev();
        desenvolvedor2.setNome("Camila");
        desenvolvedor2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos" + desenvolvedor2.getConsteudosInscritos());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}