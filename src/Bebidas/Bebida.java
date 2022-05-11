package Bebidas;

public class Bebida extends Pessoa{
    
    private String nome_bebida;
    private double valor;
    private Pessoa pessoa;
    
    public Bebida() {
        
    }
    
    public void run() {
        try{
            pessoa.setNome("Elias");
            pessoa.setTipo("Barman");
            nome_bebida = "Cerveja";
            valor = 7.0;
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String getNome_bebida() {
        return nome_bebida;
    }

    public double getValor() {
        return valor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
