public abstract class Funcionario extends Pessoa{
    //Atributos
    private int salario;
    private String expediente;
    private String tempoAtendendo;
    private String cargo;
    //private String cargo;

    //Construtor
    public Funcionario(String nome, int idade, String cpf, int salario, String expediente, String tempoAtendendo, String cargo){
        super(nome, idade, cpf);
        this.salario=salario;
        this.expediente=expediente;
        this.tempoAtendendo=tempoAtendendo;
        this.cargo= cargo;
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
    public String getCargo(){
        return cargo;
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
    public void setCargo(String novoCargo){
        cargo=novoCargo;
    }
    public abstract String toString();   
}