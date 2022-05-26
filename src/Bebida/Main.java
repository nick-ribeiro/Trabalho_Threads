package Bebida;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Classe main tem a funcao de inicializar o projeto Bebida.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Main {
    
    public static void main(String[] args){
/**
 *  <p> Os cinco BlockingQueue são criados, irão inserir os dados na fila e passar para outras classes. </p>   
 *  @since 1.0
 */  
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(20);
        BlockingQueue<String> queue2 = new LinkedBlockingQueue<>(20);
        BlockingQueue<String> queue3 = new LinkedBlockingQueue<>(20);
        BlockingQueue<Double> queue4 = new LinkedBlockingQueue<>(20);
        BlockingQueue<Integer> queue5 = new LinkedBlockingQueue<>(20);
/**
 *  <p> São criadas as Threads tanto para id e nome do cliente, bebida, valor e quantidade. </p>   
 *  @since 1.0
 */                
        new Thread(new Id_Cliente(queue)).start();
        new Thread(new Nome_Cliente(queue2)).start();
        new Thread(new Nome_Bebida(queue3)).start();
        new Thread(new Valor(queue4)).start();
        new Thread(new Quantidade(queue5)).start();
/**
 *  <p> É iniciado a Thread para os consumidores. </p>   
 *  @since 1.0
 */
        for (int j = 1; j < 21; j++) {
            new Thread(new Consumidor(queue, queue2, queue3 ,queue4, queue5)).start();
        }

    }
}
