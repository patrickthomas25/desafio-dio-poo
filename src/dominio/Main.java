package dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação de Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda Java do básico ao avançado");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Boot");
        curso2.setDescricao("Desenvolvimento de aplicações com Spring Boot");
        curso2.setCargaHoraria(60);

        // Criação de Mentoria
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Carreira em TI");
        mentoria1.setDescricao("Orientações de carreira na área de Tecnologia da Informação");
        mentoria1.setDataMentoria(LocalDate.now());

        // Criação de Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp intensivo para desenvolvedores Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        // Criação de Devs e inscrição no Bootcamp
        Dev devPietro = new Dev();
        devPietro.setNome("Pietro");
        devPietro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pietro: " + devPietro.getConteudosInscritos());
        devPietro.progredir();
        devPietro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pietro: " + devPietro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pietro: " + devPietro.getConteudosConcluidos());
        System.out.println("XP Pietro: " + devPietro.calcularTotalXp());

        System.out.println("------------------------------------------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP Maria: " + devMaria.calcularTotalXp());
        System.out.println("------------------------------------------------------------------------");

        // Adicionando conteúdo extra e verificando dados do Bootcamp
        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Angular");
        curso3.setDescricao("Desenvolvimento front-end com Angular");
        curso3.setCargaHoraria(50);
        bootcamp.getConteudos().add(curso3);

        System.out.println("Conteúdos do Bootcamp: " + bootcamp.getConteudos());
        System.out.println("Devs Inscritos no Bootcamp: " + bootcamp.getDevsInscritos());
        System.out.println("Data Inicial do Bootcamp: " + bootcamp.getDataInicial());
        System.out.println("Data Final do Bootcamp: " + bootcamp.getDataFinal());

    }
}
