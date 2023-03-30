
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFabio = new Dev();
        devFabio.setNome("Fabio");
        devFabio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devFabio.getConteudosInscritos());
        devFabio.progredir();
        System.out.println(".");
        System.out.println("Conteudos concluídos" + devFabio.getConteudosInscritos());
        System.out.println("Conteudos concluídos" + devFabio.getConteudosConcluidos());
        System.out.println("XP:" + devFabio.calcularTotalxp());

        System.out.println("______");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println(".");
        System.out.println("Conteudos concluídos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluídos" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalxp());
    }
}