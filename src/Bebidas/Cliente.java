package Bebidas;

public class Cliente extends Thread{
    
    private String nome_cliente[] = {"Luan", "Felipe", "Ana", "Carla", "Julia", "Pedro", "Bernardo"};
    private Integer id;
    private double valorTotal;
    private Integer quant;
    Bebida bebida;
    
    public Cliente(Integer id, Integer quant) {
        this.id = id;
        this.quant = quant;
    }
    
    public void run() {
        try{
            valorTotal = quant * bebida.getValor();
            System.out.println("ID: " + this.id + ", Cliente: " + nome_cliente[(int)Math.floor(Math.random()*(6 + 1))]  + ", foi atendido por: " 
                        + bebida.getNome() + ", bebeu a bebida: " + bebida.getNome_bebida() + ", o valor total foi de R$" + this.valorTotal);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
