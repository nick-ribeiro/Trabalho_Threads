package Entretenimento;

import java.util.concurrent.BlockingQueue;

public class Consumidor extends Thread{

    private BlockingQueue<String> banda;
    
    public Consumidor(BlockingQueue<String> banda) {
        this.banda = banda;
    }
    public void run() {
        try {
 //           while (true) {
                String bandas = banda.take();
                
                System.out.println(Thread.currentThread().getName() + " resultado: " + bandas);
   //         }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
