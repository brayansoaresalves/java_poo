package cursojava.exceccao;

public class ExcecaoProcessarNota extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ExcecaoProcessarNota(String mensagem) {
		super("vixi um erro no processamento das notas do aluno" + mensagem);
	}

}
