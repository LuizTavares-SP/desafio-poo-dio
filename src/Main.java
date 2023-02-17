import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso de Java");
        curso.setDescricao("Descrição do Curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do Curso JavaScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Total mentoria na linguagem Java");
        mentoria.setData(LocalDate.now());


        Bootcamp java = new Bootcamp();
        java.setNome("Java Developer");
        java.setDescricao("Bootcamp Java Developer");
        java.getConteudos().add(curso);
        java.getConteudos().add(curso2);
        java.getConteudos().add(mentoria);

        Dev developerLuiz = new Dev();
        developerLuiz.setNome("Luiz");
        developerLuiz.inscreverBootcamp(java);

        System.out.println("Conteúdos inscritos: " + developerLuiz.getConteudosInscritos());
        developerLuiz.progredir();
        developerLuiz.progredir();
        System.out.println("Conteúdos inscritos: " + developerLuiz.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + developerLuiz.getConteudoConcluidos());
        System.out.println("XP: " + developerLuiz.calcularTotalXp());


        Dev developerEliana = new Dev();
        developerEliana.setNome("Eliana");
        developerEliana.inscreverBootcamp(java);

        System.out.printf("Conteúdos inscritos: %s%n", developerEliana.getConteudosInscritos());
        developerEliana.progredir();
        System.out.printf("Conteúdos inscritos: %s%n", developerEliana.getConteudosInscritos());
        System.out.printf("Conteúdos concluidos: %s%n", developerLuiz.getConteudoConcluidos());
        System.out.println("XP: " + developerEliana.calcularTotalXp());
    }
}
