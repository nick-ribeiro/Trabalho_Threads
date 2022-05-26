package Entretenimento;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Classe main tem a funcao de inicializar o projeto Entretenimento.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Main {
    
    public static void main(String[] args){
/**
 *  <p> ambos dos BlockingQueue são criados, irão inserir os dados na fila e passar para outras classes. </p>   
 *  @since 1.0
 */         
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);
        BlockingQueue<Double> queue2 = new LinkedBlockingQueue<>(10);
/**
 *  <p> São criadas as Threads tanto para banda quanto para valor e iniciadas. </p>   
 *  @since 1.0
 */                     
        new Thread(new Banda(queue)).start();
        new Thread(new Valor(queue2)).start();
/**
 *  <p> É iniciado a Thread para os consumidores. </p>   
 *  @since 1.0
 */         
        for (int j = 1; j < 11; j++) {
            new Thread(new Consumidor(queue, queue2)).start();
        }

    }
}