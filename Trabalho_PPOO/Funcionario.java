public class Funcionario extends Pessoa{
    //Atributos
    private int salario;
    private String expediente;
    private String tempoAtendendo;
    private String cargo;

    //Construtor
    public Funcionario(String nome, int idade, String cpf, int salario, String expediente, String tempoAtendendo, String cargo){
        super(nome, idade, cpf);
        this.salario=salario;
        this.expediente=expediente;
        this.tempoAtendendo=tempoAtendendo;
    }

    //Getters
    public int getSalario(){
        return this.salario;
    }
    public String getExpediente(){
        return this.expediente;
    }
    public String getTempoAtendendo(){
        return this.tempoAtendendo;
    }
    public String getCargo(){
        return this.cargo;
    }

    //Setters
    public void setSalario(int novoSalario){
        this.salario=novoSalario;
    }
    public void setExpediente(String novoExpediente){
        this.expediente=novoExpediente;
    }
    public void setTempoAtendendo(String novoTempoAtendendo){
        this.tempoAtendendo=novoTempoAtendendo;
    }
    public void setCargo(String novoCargo){
        this.cargo=novoCargo;
    }


    
}