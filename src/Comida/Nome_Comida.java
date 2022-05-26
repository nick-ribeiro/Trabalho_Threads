package Comida;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de produzir nome para as comida.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Nome_Comida extends Thread{

    static String comida;
/**
 *  <p> recebe um BlockingQueue do tipo string para o nome de comida </p>
 * @param nome_comida
 */
    private BlockingQueue<String> nome_comida;
    
    public Nome_Comida(BlockingQueue<String> nome_comida) {
        this.nome_comida = nome_comida;
    }
 /**
 *  <p> no metódo run é chamada a função "generateComidas" </p>   
 *  @since 1.0
 */        
    public void run() {
        try {          
            generateComidas();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 /**
 *  <p> Na função é executada a Thread, nessa função é gerado aleatoriamente o noma da comida e colocado no BlockingQueue </p>   
 *  @since 1.0
 */
    private void generateComidas() throws InterruptedException {
        String comidas[] = {"Xis Salada", "Xis Calabresa", "Xis Strogonoff", "Xis Tudo", "Batata frita palito", "Batata frita rustica", "Polenta frita",
                            "Queijo frito", "Alcatra simples", "Coraçãozinho", "Onions rings", "Petit gateau", "Pastel de chocolate", "Hamburguer de cheddar", "Hamburguer duplo", 
                            "Pastel de presunto", "Pastel de frango", "Pastel de carne", "Pastel queijo", "Aipim frito"};
        
        for(int i = 1; i < 21; i++) {
            nome_comida.put(comidas[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     }

}
