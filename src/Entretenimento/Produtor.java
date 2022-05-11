package Entretenimento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.BlockingQueue;

public class Produtor extends Thread{
    
    BlockingQueue<String> agente = null;
    BlockingQueue<String> banda = null;
    private double valor = 200.0;
    final Calendar data_show = Calendar.getInstance();
    private Integer quant[] = {2, 5, 7, 9, 3};
    
    public Produtor(BlockingQueue<String> queue, BlockingQueue<String> queue2){
        this.agente = queue;
        this.banda = queue2;
    }

    public void run() {
        try{
            final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            agente.put("Lucas");
            banda.put("Strike");
            System.out.println("O contrato foi realizado por: " + this.agente + ". Da banda: " + this.banda +
                    ". No valor de R$" + (this.valor * quant[(int)Math.floor(Math.random()*5)]) 
                + ". Realizado no dia: " + df.format(data_show.getTime()));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
