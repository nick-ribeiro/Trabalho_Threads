package Entretenimento;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Main {
    
    public static void main(String[] args){
        
//  ambos dos BlockingQueue são criados, irão inserir os dados na fila e passar para outras classes
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);
        BlockingQueue<Double> queue2 = new LinkedBlockingQueue<>(10);
        
//  São criadas as Threads tanto para banda quanto para valor e iniciadas.        
        new Thread(new Banda(queue)).start();
        new Thread(new Valor(queue2)).start();
        
//  É iniciado a Thread para os consumidores
        for (int j = 1; j < 11; j++) {
            new Thread(new Consumidor(queue, queue2)).start();
        }

    }
}