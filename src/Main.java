import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição curso java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devAnderson.getConteudosInscritos());

        devAnderson.progredir();
        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos" + devAnderson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devAnderson.getConteudosConcluidos());
        System.out.println("XP: " + devAnderson.calcularTotalXp());

        System.out.println("==============================");

        Dev devKarlos = new Dev();
        devKarlos.setNome("Karlos");
        devKarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devKarlos.getConteudosInscritos());

        devKarlos.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos" + devKarlos.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devKarlos.getConteudosConcluidos());
        System.out.println("XP: " + devKarlos.calcularTotalXp());
    }
}