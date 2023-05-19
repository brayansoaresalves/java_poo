package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Brayan");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Bruno");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		
		System.out.println(aluno);
	}

}
