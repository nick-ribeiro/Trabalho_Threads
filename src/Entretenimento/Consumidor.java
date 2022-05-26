package Entretenimento;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de consumir o projeto Entretenimento.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */

public class Consumidor extends Thread{

    private BlockingQueue<String> banda;
    private BlockingQueue<Double> valor;
    
/**
 * <p> recebe um BlockingQueue do valor e da banda </p>
 * @param valor
 * @param banda
*/ 
    public Consumidor(BlockingQueue<String> banda, BlockingQueue<Double> valor) {
        this.banda = banda;
        this.valor = valor;
    }
/**
*  <p> no metódo run é consumido os BlockQueue, assim é liberado espaço da fila. </p>   
*  @since 1.0
*/ 
    public void run() {
        try {
                String bandas = banda.take();
                Double valores = valor.take();
                Thread.sleep(1000);
                
                System.out.println("Banda contratada: " + bandas + ". No valor de R$" + valores);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
