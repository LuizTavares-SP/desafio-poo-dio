import br.com.dio.desafio.dominio.Curso;
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


        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
