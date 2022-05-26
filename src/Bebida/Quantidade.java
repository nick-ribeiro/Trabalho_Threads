package Bebida;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de produzir quantidade de bebida, qual sera consumido pelo cliente.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Quantidade extends Thread{
    
    private BlockingQueue<Integer> quant;
 /**
 *  <p> recebe um BlockingQueue do tipo integer para a quantidade </p>
 * @param quant
 */         
    public Quantidade(BlockingQueue<Integer> quant) {
        this.quant = quant;
    }
 /**
 *  <p> no metódo run é chamada a função "generateQuantidade" </p>   
 *  @since 1.0
 */      
    public void run() {
        try {      
            generateQuantidade();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 /**
 *  <p> Na função é executada a Thread, nessa função é gerado aleatoriamente a quantidade de bebida e colocado no BlockingQueue </p>   
 *  @since 1.0
 */        
    private void generateQuantidade() throws InterruptedException {
        
        Integer quantidades[] = {5, 6, 9, 15, 10, 20, 7, 2, 3, 1, 4, 8, 11, 12, 18, 13, 25, 17, 16, 14};
 
        for(int i = 1; i < 21; i++) {
            quant.put(quantidades[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     }
}
