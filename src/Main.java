import br.com.projeto.desafio.dominio.Bootcamp;
import br.com.projeto.desafio.dominio.Curso;
import br.com.projeto.desafio.dominio.Dev;
import br.com.projeto.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando os Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do Curso de JS");
        curso2.setCargaHoraria(4);

        // Criando a Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        // Criando o Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando o(s) Participante(s) e progredindo
        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mateus: " + devMateus.getConteudosIncritos());
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mateus: " + devMateus.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Mateus: " + devMateus.getConteudosConcluidos());
        System.out.println("XP: " + devMateus.calcularTotalXP());
    }
}
