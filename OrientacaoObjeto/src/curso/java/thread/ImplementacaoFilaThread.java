package curso.java.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void  add(ObjetoFilaThread objetoFilaThread){
        pilha_fila.add(objetoFilaThread);
    }

    @Override
    public void run() {
        System.out.println("Fila rodando");
        
        while (true) {
            
            Iterator iteracao = pilha_fila.iterator();

            synchronized (iteracao) { /* bloquear o acesso a essa lista por outros processos */
                while(iteracao.hasNext()){ /* Enquanto conter dados na lista ira processar */
                ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

                /* Processar 10 mil notas fiscais*/
                /* Gerar uma lista enorme de PDF */
                /* Gerar um envio em massa de email */
                System.out.println("-----------------------------------------------------------");
                System.out.println(processar.getEmail());
                System.out.println(processar.getNome());
                
                iteracao.remove();

                try {
                    Thread.sleep(1000); /* Dar um tempo de descarga de memoria */
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

         try {
            Thread.sleep(1000); /* Processou toda a lista da um tempo de memoria */
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }  

       
    }
    
}
