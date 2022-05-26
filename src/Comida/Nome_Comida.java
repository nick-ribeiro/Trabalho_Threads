package Comida;

import java.util.concurrent.BlockingQueue;

public class Nome_Comida extends Thread{

    static String comida;
    
//  recebe um BlockingQueue do tipo string para o nome da comida
    private BlockingQueue<String> nome_comida;
    
    public Nome_Comida(BlockingQueue<String> nome_comida) {
        this.nome_comida = nome_comida;
    }
    public void run() {
        try {
//  chama a função            
            generateComidas();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
//  nessa função é gerado aleatoriamente o noma da comida e colocado no BlockingQueue    
    private void generateComidas() throws InterruptedException {
        String comidas[] = {"Xis Salada", "Xis Calabresa", "Xis Strogonoff", "Xis Tudo", "Batata frita palito", "Batata frita rustica", "Polenta frita",
                            "Queijo frito", "Alcatra simples", "Coraçãozinho", "Onions rings", "Petit gateau", "Pastel de chocolate", "Hamburguer de cheddar", "Hamburguer duplo", 
                            "Pastel de presunto", "Pastel de frango", "Pastel de carne", "Pastel queijo", "Aipim frito"};
        
        for(int i = 1; i < 21; i++) {
            nome_comida.put(comidas[(int)Math.floor(Math.random()*20)]);
            Thread.sleep(1000);
        }
     }

}
