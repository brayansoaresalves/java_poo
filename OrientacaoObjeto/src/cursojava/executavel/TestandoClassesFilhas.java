package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Brayan");
		aluno.setIdade(16);
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Bruno");
		
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		
		secretario.setIdade(18);
		
		System.out.println(aluno);
		
		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println(aluno.msgMaiorIdade());
		
		System.out.println("Salario é = " + aluno.salario());
		System.out.println("Salario do diretor é: " + diretor.salario());
		System.out.println("Salario do secretario é = " + secretario.salario());
		
		testando(aluno);
		testando(diretor);
		testando(secretario);
	}
	
	public static void testando(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais: " + pessoa.getNome() + " é o salario é: "
				+ pessoa.salario());
	}

}
