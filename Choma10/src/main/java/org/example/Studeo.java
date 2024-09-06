package org.example;

public class Studeo {
    public static void main(String[] args) {
        Aluno vinicius = new Aluno("Magaiver" , 123);
        Aluno pai = new Aluno("pai",789);

        Professor moreno = new Professor("Deus" ,777);
        Professor maurilio = new Professor("Demonio",666);

        vinicius.cadastrarProfessor(moreno);
        vinicius.cadastrarProfessor(maurilio);
        vinicius.cadastrarProfessor(moreno);
        vinicius.cadastrarProfessor(maurilio);
        vinicius.cadastrarProfessor(moreno);
        vinicius.cadastrarProfessor(maurilio);

        moreno.addAluno(vinicius);
        System.out.println("os aluno de Moreno" + moreno.getAluno().getFirst().getNome());
        System.out.println("Vinicius RA:"+ vinicius.getRA());

        for (int i = 0; i < vinicius.getProfessores().size();i++) {
            System.out.println("O nome do Professor e: " + vinicius.getProfessores().get(i).getNome());
        }




    }
}
