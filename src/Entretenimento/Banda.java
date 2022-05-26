package Entretenimento;

import java.util.concurrent.BlockingQueue;

/**
 * Thread que tem a funcao de produzir nome para as bandas.
 * @author Maria Eduarda Zanin Pereira
 * @author Nícolas R. Martins Paiva e Souza
 *
 */
public class Banda extends Thread{
    
    private BlockingQueue<String> banda;
/**
 *  <p> recebe um BlockingQueue do tipo string para o nome da banda </p>
 * @param banda
 */    
    public Banda(BlockingQueue<String> banda) {
        this.banda = banda;
    }
 /**
 *  <p> no metódo run é chamada a função "generateBandas" </p>   
 *  @since 1.0
 */         
    public void run() {
        try {
            generateBandas();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 /**
 *  <p> Na função é executada a Thread, nessa função é gerado aleatoriamente o nome da banda/cantor e colocado no BlockingQueue </p>   
 *  @since 1.0
 */       
    private void generateBandas() throws InterruptedException {
        String bandas[] = {"Maiara e Maraisa", "Chitaozinho e Chororo", "Jorge e Matheus", "Zeze Di Camargo e Luciano", 
            "Bruno e Marrone", "Simone e Simaria", "Matheus e Kaun", "Israel e Rodolffo", "Fernando e Sorocaba", "Bruno e Barreto"};
        
        for(int i = 1; i < 11; i++) {
            banda.put(bandas[(int)Math.floor(Math.random()*10)]);
            Thread.sleep(1000);
        }
     }
}
