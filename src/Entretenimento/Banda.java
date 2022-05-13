package Entretenimento;

import java.util.concurrent.BlockingQueue;

public class Banda extends Thread{
    
    private BlockingQueue<String> banda;
    
    public Banda(BlockingQueue<String> banda) {
        this.banda = banda;
    }
    public void run() {
        try {
            generateBandas();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    private void generateBandas() throws InterruptedException {
        String bandas[] = {"Luan Santana", "Felipe Amorim", "Matue", "Henrique e Juliano", "Anitta", "L7NNON"};
        // System.out.println("Bandas: " + bandas[(int)Math.floor(Math.random()*6)]);
        
        for(int i = 0; i < 6; i++) {
            banda.put(bandas[(int)Math.floor(Math.random()*6)]);
            System.out.println("Produtor: " + banda);
        }
     }
}
