package Comida;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de produzir IDs para os clientes.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Id_Cliente extends Thread{
    
    private BlockingQueue<Integer> id;
/**
*  <p> recebe um BlockingQueue do tipo integer para o ID do cliente </p>
* @param id
*/   
    public Id_Cliente(BlockingQueue<Integer> id) {
        this.id = id;
    }
/**
 *  <p> no metódo run é chamada a função "generateIds" </p>   
 *  @since 1.0
 */      
    public void run() {
        try {            
            generateIds();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 /**
 *  <p> Na função é executada a Thread, gerando um valor para o ID começando com 1 até seu limite e colocado no BlockingQueue </p>   
 *  @since 1.0
 */     
    private void generateIds() throws InterruptedException {
 
        for(int i = 1; i < 21; i++) {
            id.put(i);
            Thread.sleep(1000);
        }
     }
} 

