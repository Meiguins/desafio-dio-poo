import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição");
        curso1.setCargaHoraria(21);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso java");
        curso2.setDescricao("Descrição");
        curso2.setCargaHoraria(11);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);
    }
}
