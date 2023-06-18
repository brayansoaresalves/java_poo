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

        double[] notas = { 8.8, 9.7, 6.6, 8 };

        disciplina.setNota(notas);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Logica de Programação");

        double[] notas2 = { 10, 9.2, 9.4, 5 };
        disciplina2.setNota(notas2);

        aluno.getDisciplinas().add(disciplina);
        aluno.getDisciplinas().add(disciplina2);

        // -------------------------------------------------------------------------------------

        Aluno[] arrayAlunos = new Aluno[1];
        arrayAlunos[0] = aluno;

        for (int pos = 0; pos <= arrayAlunos.length; pos++) {
            System.out.println("Nome do Aluno é: " + arrayAlunos[pos].getNome());

            for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
                System.out.println("Nome da Disciplina é: " + d.getDisciplina());

                for (int posNota = 0; posNota < d.getNota().length; posNota++) {
                    System.out.println("As notas n° " + posNota + " é igual = " + d.getNota()[posNota]);
                }
            }
        }
    }

}
