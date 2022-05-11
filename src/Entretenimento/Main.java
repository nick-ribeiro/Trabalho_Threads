package Entretenimento;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    
    public static void main(String[] args){
        
            BlockingQueue<String> bq = new ArrayBlockingQueue<String>(5);
            BlockingQueue<String> bq2 = new ArrayBlockingQueue<String>(5);
            
            Produtor add = new Produtor(bq, bq2);
            
            new Thread(add).start();
    }
}