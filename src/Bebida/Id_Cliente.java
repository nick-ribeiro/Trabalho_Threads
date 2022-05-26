package Bebida;

import java.util.concurrent.BlockingQueue;

public class Id_Cliente extends Thread{
    
    private BlockingQueue<Integer> id;

//  recebe um BlockingQueue do tipo integer para o ID do cliente    
    public Id_Cliente(BlockingQueue<Integer> id) {
        this.id = id;
    }
    public void run() {
        try {
//  chama a função            
            generateIds();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
//  nessa função é gerado um valor para o ID começando com 1 até seu limite e colocado no BlockingQueue        
    private void generateIds() throws InterruptedException {
        
        for(int i = 1; i < 21; i++) {
            id.put(i);
            Thread.sleep(1000);
     }
    }
}
