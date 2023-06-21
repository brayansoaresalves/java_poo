package curso.java.thread;

import javax.swing.JOptionPane;

public class ThreadAprendendo {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em paralelo do envio de email */
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		/* Divisão das THreads -------------------------------------------------------------------------------------------------------- */

		/*Thread processando em paralelo do envio de nota fiscal */
		Thread threadNF = new Thread(thread2);
		threadNF.start();
		



		/*Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("CHEGOU AO FIM DO CODIGO DA THREAD");
		/*Fluxo do sistema, cadastro de venda, emissão de nota fiscal  */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i =0; i< 10; i++) {
				
					/*Quero executar esse envio com o tempo de parada, ou com o tempo determinado*/
					System.out.println("Executando alguma rotina, por exemplo envio de email");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			/*Fim do código em paralelo */
		}
		
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			/*Código da rotina que eu quero executar em paralelo */ 
				for (int i =0; i< 10; i++) {
				
					/*Quero executar esse envio com o tempo de parada, ou com o tempo determinado*/
					System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			/*Fim do código em paralelo */
		}
		
	};

}
