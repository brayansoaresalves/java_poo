package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setNome("Brayan Alves");
        aluno.setNomeEscola("jdev treinamento");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Java");

        double[] notas = {8.8, 9.7, 6.6, 8};

        disciplina.setNota(notas);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Logica de Programação");
        
        double[] notas2 = {10, 9.2, 9.4, 5};
        disciplina2.setNota(notas2);
        
        aluno.getDisciplinas().add(disciplina);
        aluno.getDisciplinas().add(disciplina2);

        System.out.println("Nome do Aluno = " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
        for (Disciplina disc: aluno.getDisciplinas()){
            System.out.println("Disciplinas do aluno ");
            System.out.println("Disciplina: " + disc.getDisciplina());
            System.out.println("Notas das disciplinas são: ");

            for (int pos = 0; pos < disc.getNota().length; pos++){
                System.out.println("Nota " + pos + " é igual a " + disc.getNota()[pos]);
            }
        }

    }
    
}
