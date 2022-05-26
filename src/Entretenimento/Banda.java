package Entretenimento;

import java.util.concurrent.BlockingQueue;

public class Banda extends Thread{
    
    private BlockingQueue<String> banda;
    
//  recebe um BlockingQueue do tipo String p nomes da banda
    public Banda(BlockingQueue<String> banda) {
        this.banda = banda;
    }
    public void run() {
        try {
//  chama a função
            generateBandas();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
   
//  nessa função é gerado aleatoriamente o nome da banda/cantor e colocado no BlockingQueue
    private void generateBandas() throws InterruptedException {
        String bandas[] = {"Maiara e Maraisa", "Chitaozinho e Chororo", "Jorge e Matheus", "Zeze Di Camargo e Luciano", 
            "Bruno e Marrone", "Simone e Simaria", "Matheus e Kaun", "Israel e Rodolffo", "Fernando e Sorocaba", "Bruno e Barreto"};
        
        for(int i = 1; i < 11; i++) {
            banda.put(bandas[(int)Math.floor(Math.random()*10)]);
            Thread.sleep(1000);
        }
     }
}
