package Bebida;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de consumir o projeto Bebida.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Consumidor extends Thread{
    
    private BlockingQueue<Integer> id;
    private BlockingQueue<String> nome_cliente;
    private BlockingQueue<String> nome_bebida;
    private BlockingQueue<Double> valor;
    private BlockingQueue<Integer> quant;
    
/**
 * <p> recebe um BlockingQueue do id e nome do cliente, bebida, valor e quantidade </p>
 * @param id
 * @param nome_cliente
 * @param nome_bebida
 * @param valor
 * @param quant
*/
    public Consumidor(BlockingQueue<Integer> id, BlockingQueue<String> nome_cliente, BlockingQueue<String> nome_bebida, BlockingQueue<Double> valor, BlockingQueue<Integer> quant) {
        this.id = id;
        this.nome_cliente = nome_cliente;
        this.nome_bebida = nome_bebida;
        this.valor = valor;
        this.quant = quant;
    }

/**
 *  <p> no metódo run é consumido os BlockQueue, assim é liberado espaço da fila. </p>   
 *  @since 1.0
 */ 
    public void run() {
        try {
                Integer ids = id.take();
                String nomes = nome_cliente.take();
                String bebidas = nome_bebida.take();
                Double valores = valor.take();
                Integer quantidades = quant.take();
                Thread.sleep(1000);
                
                System.out.println("ID: " + ids + ". O cliente " + nomes + " consumiu " + quantidades + " " + bebidas + "(s) e pagou um total de R$" + valores * quantidades);
                
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
