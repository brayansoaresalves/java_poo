package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa{
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatricula;
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public Aluno() {};
	
	public Aluno(String dataMatricula, String nomeEscola, String serieMatricula, List<Disciplina> disciplinas) {
		super();
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatricula = serieMatricula;
		this.disciplinas = disciplinas;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatricula() {
		return serieMatricula;
	}

	public void setSerieMatricula(String serieMatricula) {
		this.serieMatricula = serieMatricula;
	}


	public double getMediaNota() {
		
		double soma = 0.0;
		for(Disciplina disciplina : disciplinas) {
			soma += disciplina.getMediaNotas();
		}
		return soma / disciplinas.size();
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		
		if (media > 7) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatricula="
				+ serieMatricula + ", disciplinas=" + disciplinas + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral + ", numerocpf=" + numerocpf
				+ ", nomemae=" + nomemae + ", nomepai=" + nomepai + "]";
	}

	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return idade >= 21;
	}

	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba o aluno " + this.nome + " é maior de idade. " : 
			"Oba o aluno " + this.nome + " é menor de idade. ";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1590.00;
	}
	
}

