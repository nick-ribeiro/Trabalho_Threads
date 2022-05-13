package Entretenimento;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Main {
    
    public static void main(String[] args){
        
        int N_Consumidores = Runtime.getRuntime().availableProcessors();

        BlockingQueue<String> queue = new LinkedBlockingQueue<>(6);
        
        new Thread(new Banda(queue)).start();
       
        for (int j = 0; j < N_Consumidores; j++) {
            new Thread(new Consumidor(queue)).start();
        }

    }
}