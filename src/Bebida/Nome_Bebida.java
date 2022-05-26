package Bebida;

import java.util.concurrent.BlockingQueue;

public class Nome_Bebida extends Thread{
    
    private BlockingQueue<String> nome_bebida;

//  recebe um BlockingQueue do tipo string para o nome da bidade    
    public Nome_Bebida(BlockingQueue<String> nome_bebida) {
        this.nome_bebida = nome_bebida;
    }
    public void run() {
        try {
//  chama a função            
            generateBebidas();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
//  nessa função é gerado aleatoriamente o nome da bebida e colocado no BlockingQueue    
    private void generateBebidas() throws InterruptedException {
        String bebidas[] = {"Cerveja", "Ice", "Caipirinha", "Caipirosca", "Cozumel", "Gin Tonica", "Whisky", "Whisky com Energetico", "Tequila", "Chopp",
            "Moscow Mule", "Champanhe", "Coca-Cola", "Guaraná", "Água com gás", "Energético", "Água", "Suco", "Cachaça", "Corote"};
        
        for(int i = 1; i < 21; i++) {
            nome_bebida.put(bebidas[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     }
}
