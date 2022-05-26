package Comida;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de produzir valores para a comida, qual sera pago pelo cliente.
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
 *  <p> Na função é executada a Thread, nessa função é gerado aleatoriamente o valor para a bibida e colocado no BlockingQueue </p>   
 *  @since 1.0
 */ 
    private void generateValores() throws InterruptedException {
        
        Double valores[] = {18.0, 17.0, 20.5, 45.0, 15.5, 22.5, 25.5, 19.0, 10.0, 25.5, 50.0, 5.5, 21.5, 7.5, 11.0, 12.0, 29.5, 35.0, 35.5, 32.5};
 
        for(int i = 1; i < 21; i++) {
            valor.put(valores[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     
    }
}