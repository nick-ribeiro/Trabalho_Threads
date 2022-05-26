package Entretenimento;

import java.util.concurrent.BlockingQueue;

public class Consumidor extends Thread{

    private BlockingQueue<String> banda;
    private BlockingQueue<Double> valor;
    
//    recebe um BlockingQueue da banda e do valor 
    public Consumidor(BlockingQueue<String> banda, BlockingQueue<Double> valor) {
        this.banda = banda;
        this.valor = valor;
    }
//    no metódo run é consumido os BlockQueue, assim é liberado espaço da fila.
    public void run() {
        try {
                String bandas = banda.take();
                Double valores = valor.take();
                Thread.sleep(1000);
                
                System.out.println("Banda contratada: " + bandas + ". No valor de R$" + valores);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
