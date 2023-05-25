package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		

		if (new Secretario().autenticar(login, senha)) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		HashMap<String, List<Aluno>> map = new HashMap<String, List<Aluno>>(); 
		
		for (int qtd = 1; qtd <= 5; qtd++) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + " ?");
		/*String idade = JOptionPane.showInputDialog("Qual é a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de Nascimento?");
		String rg = JOptionPane.showInputDialog("Informe o registro geral?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mae?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Informe o numero da matricula?");
		String serie = JOptionPane.showInputDialog("Informe o numero da serie?");
		String nomeEscola = JOptionPane.showInputDialog("Informe o nome da escola");
		String dataMatricula = JOptionPane.showInputDialog("Informe a data da matricula!");*/
		
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(nome);
		/*aluno.setIdade(Integer.valueOf(idade));
		aluno.setRegistroGeral(rg);
		aluno.setNumerocpf(cpf);
		aluno.setNomemae(mae);
		aluno.setNomepai(pai);
		aluno.setDataNascimento(dataNascimento);
		aluno.setDataMatricula(dataMatricula);
		aluno.setSerieMatricula(serie);
		aluno.setNomeEscola(nomeEscola);*/
		
		for (int i =1; i<=1; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + i + " ?");
			String nota = JOptionPane.showInputDialog("Nota da Disciplina " + i +" ?");
			
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(nota));
			
			aluno.getDisciplinas().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {
			
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4?");
				aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");
			
			}
		}
		
		alunos.add(aluno);
		
		}
		
		map.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		map.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		map.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno: alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				map.get(StatusAluno.APROVADO).add(aluno);
			}else if (aluno.getAlunoAprovado2().equals(StatusAluno.RECUPERACAO)) {
				map.get(StatusAluno.RECUPERACAO).add(aluno);
			}else {
				map.get(StatusAluno.RECUPERACAO).add(aluno);
			}
		}
		
		System.out.println("Lista dos Aprovados");
		for (Aluno aluno : map.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado  = " + aluno.getAlunoAprovado2() + 
					" com a media de = " + aluno.getMediaNota());
		}
		
		System.out.println("Lista dos Reprovados");
		for (Aluno aluno : map.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado  = " + aluno.getAlunoAprovado2() + 
					" com a media de = " + aluno.getMediaNota());
		}
		
		System.out.println("Lista dos Recuperação");
		for (Aluno aluno : map.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado  = " + aluno.getAlunoAprovado2() + 
					" com a media de = " + aluno.getMediaNota());
		}
		
	}
	}

}
