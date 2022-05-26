package Bebida;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de produzir nomes para os clientes.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Nome_Cliente extends Thread{
    
    private BlockingQueue<String> nome_cliente;
 /**
 *  <p> recebe um BlockingQueue do tipo string para o nome do clinte </p>
 * @param nome_cliente
 */    
    public Nome_Cliente(BlockingQueue<String> nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
 /**
 *  <p> no metódo run é chamada a função "generateNomes" </p>   
 *  @since 1.0
 */      
    public void run() {
        try {           
            generateNomes();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 /**
 *  <p> Na função é executada a Thread, nessa função é gerado aleatoriamente o nome para o cliente e colocado no BlockingQueue </p>   
 *  @since 1.0
 */
    private void generateNomes() throws InterruptedException {
        String nomes[] = {"Elias", "Lucas", "Roberto", "Vitoria", "Camila", "Dariãn", "Huriel", "Daniel", "Darlan", "Jake", "Diulia", "Ana",
                          "Igor", "Arthur", "Roberta", "Victor", "Andrei", "Pedro", "Maria", "Nicolas"};
        
        for(int i = 1; i < 21; i++) {
            nome_cliente.put(nomes[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     }
}
