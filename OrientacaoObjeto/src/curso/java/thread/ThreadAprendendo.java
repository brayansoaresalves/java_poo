package curso.java.thread;

public class ThreadAprendendo {
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int i =0; i< 10; i++) {
			
			/*Quero executar esse envio com o tempo de parada, ou com o tempo determinado*/
			System.out.println("Executando alguma rotina, por exemplo envio de email");
			Thread.sleep(2000);
		}
		
		System.out.println("CHEGOU AO FIM DO CODIGO DA THREAD");
	}

}
