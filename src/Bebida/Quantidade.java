package Bebida;

import java.util.concurrent.BlockingQueue;

public class Quantidade extends Thread{
    
    private BlockingQueue<Integer> quant;
    
//  recebe um BlockingQueue do tipo integer para a quantidade    
    public Quantidade(BlockingQueue<Integer> quant) {
        this.quant = quant;
    }
    public void run() {
        try {
//  chama a função            
            generateQuantidade();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
//  nessa função é gerado aleatoriamente a quantidade de bebida e colocado no BlockingQueue    
    private void generateQuantidade() throws InterruptedException {
        
        Integer quantidades[] = {5, 6, 9, 15, 10, 20, 7, 2, 3, 1, 4, 8, 11, 12, 18, 13, 25, 17, 16, 14};
 
        for(int i = 1; i < 21; i++) {
            quant.put(quantidades[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     }
}
