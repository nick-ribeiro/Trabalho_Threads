package Entretenimento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.BlockingQueue;

public class Consumidor extends Thread{

    BlockingQueue<String> bandas = null;
    final Calendar data_show = Calendar.getInstance();
    
    public Consumidor(BlockingQueue<String> queue) {
        this.bandas = queue;
    }
    
    public void run() {
        try{
            final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

            String elemento = this.bandas.take();
            System.out.println("A banda: " + elemento + " ira tocar no dia: " + df.format(data_show.getTime()));
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
