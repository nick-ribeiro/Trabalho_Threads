package Entretenimento;

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
    
//  nessa função é gerado aleatoriamente o valor do show e colocado no BlockingQueue
    private void generateValores() throws InterruptedException {
        Double valores[] = {200.0, 400.0, 500.0, 600.0, 1000.0, 700.0, 900.0, 300.0, 450.50, 1200.0};
 
        for(int i = 1; i < 11; i++) {
            valor.put(valores[(int)Math.floor(Math.random()*10)]);
            Thread.sleep(1000);
        }
     }
}
