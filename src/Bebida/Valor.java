package Bebida;

import java.util.concurrent.BlockingQueue;

public class Valor extends Thread{
    
    private BlockingQueue<Double> valor;
    
//  recebe um BlockingQueue do tipo double para o valor    
    public Valor(BlockingQueue<Double> valor) {
        this.valor = valor;
    }
    public void run() {
        try {
//  chama a função            
            generateValores();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
//  nessa função é gerado aleatoriamente o valor para a bibida e colocado no BlockingQueue
    private void generateValores() throws InterruptedException {
        
        Double valores[] = {18.0, 17.0, 20.5, 45.0, 15.5, 22.5, 25.5, 19.0, 10.0, 25.5, 50.0, 5.5, 21.5, 7.5, 11.0, 12.0, 29.5, 35.0, 35.5, 32.5};
 
        for(int i = 1; i < 21; i++) {
            valor.put(valores[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     }
}
