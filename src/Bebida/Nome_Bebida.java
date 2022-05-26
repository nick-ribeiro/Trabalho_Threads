package Bebida;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de produzir nome para as bebida.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Nome_Bebida extends Thread{
    
    private BlockingQueue<String> nome_bebida;
/**
 *  <p> recebe um BlockingQueue do tipo string para o nome da bidade </p>
 * @param nome_bebida
 */
    public Nome_Bebida(BlockingQueue<String> nome_bebida) {
        this.nome_bebida = nome_bebida;
    }
 /**
 *  <p> no metódo run é chamada a função "generateBebidas" </p>   
 *  @since 1.0
 */     
    public void run() {
        try {           
            generateBebidas();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 /**
 *  <p> Na função é executada a Thread, nessa função é gerado aleatoriamente o nome da bebida e colocado no BlockingQueue </p>   
 *  @since 1.0
 */    
    private void generateBebidas() throws InterruptedException {
        String bebidas[] = {"Cerveja", "Ice", "Caipirinha", "Caipirosca", "Cozumel", "Gin Tonica", "Whisky", "Whisky com Energetico", "Tequila", "Chopp",
            "Moscow Mule", "Champanhe", "Coca-Cola", "Guaraná", "Água com gás", "Energético", "Água", "Suco", "Cachaça", "Corote"};
        
        for(int i = 1; i < 21; i++) {
            nome_bebida.put(bebidas[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     }
}
