package Comida;

import java.util.concurrent.BlockingQueue;

public class Nome_Cliente extends Thread{
    
    private BlockingQueue<String> nome_cliente;
    
//  recebe um BlockingQueue do tipo string para o nome do cliente
    public Nome_Cliente(BlockingQueue<String> nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public void run() {
        try {
//  chama a função            
            generateNomes();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

//  nessa função é gerado aleatoriamente o nome do cliente e colocado no BlockingQueue    
    private void generateNomes() throws InterruptedException {
        String nomes[] = {"Elias", "Lucas", "Roberto", "Vitoria", "Camila", "Dariãn", "Huriel", "Daniel", "Darlan", "Jake", "Diulia", "Ana",
                          "Igor", "Arthur", "Roberta", "Victor", "Andrei", "Pedro", "Maria", "Nicolas"};
        
        for(int i = 1; i < 21; i++) {
            nome_cliente.put(nomes[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     }
}