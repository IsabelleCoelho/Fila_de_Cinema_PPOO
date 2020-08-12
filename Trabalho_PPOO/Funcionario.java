import java.util.HashMap;
/**
 * Classe que representa um funcionário do cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public abstract class Funcionario extends Pessoa{
    //Atributos
    private int salario;
    private String expediente;
    private String tempoAtendendo;
    private HashMap<String, Integer> numAtendimentos;

    //Construtor
    public Funcionario(String nome, String idade, String cpf, int salario, String expediente, String tempoAtendendo){
        super(nome, idade, cpf);
        this.salario=salario;
        this.expediente=expediente;
        this.tempoAtendendo=tempoAtendendo;
        numAtendimentos = new HashMap<String, Integer>();
    }
    
    //Getters
    public int getSalario(){
        return salario;
    }
    public String getExpediente(){
        return expediente;
    }
    public String getTempoAtendendo(){
        return tempoAtendendo;
    }

    //Setters
    public void setSalario(int novoSalario){
        salario=novoSalario;
    }
    public void setExpediente(String novoExpediente){
        expediente=novoExpediente;
    }
    public void setTempoAtendendo(String novoTempoAtendendo){
        tempoAtendendo=novoTempoAtendendo;
    }
    public abstract String toString();   
}