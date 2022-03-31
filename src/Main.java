import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Quality Assurance #1\n");

        bootcamp.setDescricao("Conheça já o Bootcamp GFT Quality Assurance #1: " +
                "um programa feito para você que planeja desenvolver suas habilidades em QA. " +
                "\nCom cursos, desafios de códigos, mentorias e desafios de projeto, suas chances de ganhar destaque no mercado só aumentam! " +
                "\nNão perca essa chance e inscreva-se já.");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println(bootcamp.getNome());
        System.out.println(bootcamp.getDescricao());

        System.out.println("\n##################################################################\n");

        Dev denilson = new Dev();
        denilson.setNome("Denilson");
        denilson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Denilson: " + denilson.getConteudosInscritos());
        denilson.progredir();
        denilson.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos Inscritos Denilson: " + denilson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Denilson: " + denilson.getConteudosConcluidos());
        System.out.println("XP: " + denilson.calcularTotalXp());

        System.out.println("=================================");

        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + camila.getConteudosInscritos());
        camila.progredir();
        camila.progredir();
        camila.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos Inscritos Camila: " + camila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + camila.getConteudosConcluidos());
        System.out.println("XP: " + camila.calcularTotalXp());

    }
}
