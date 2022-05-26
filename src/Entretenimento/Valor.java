package Entretenimento;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de produzir valores para o show.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Valor extends Thread{
    
    private BlockingQueue<Double> valor;   
/**
 *  <p> recebe um BlockingQueue do tipo double para o valor </p>
 * @param valor
 */   
    public Valor(BlockingQueue<Double> valor) {
        this.valor = valor;
    }
 /**
 *  <p> no metódo run é chamada a função "generateValores" </p>   
 *  @since 1.0
 */        
    public void run() {
        try {
            generateValores();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
 /**
 *  <p> Na função é executada a Thread, nessa função é gerado aleatoriamente o valor para o show e colocado no BlockingQueue </p>   
 *  @since 1.0
 */ 
    private void generateValores() throws InterruptedException {
        Double valores[] = {200.0, 400.0, 500.0, 600.0, 1000.0, 700.0, 900.0, 300.0, 450.50, 1200.0};
 
        for(int i = 1; i < 11; i++) {
            valor.put(valores[(int)Math.floor(Math.random()*10)]);
            Thread.sleep(1000);
        }
     }
}
