import java.util.HashMap;
/**
 * Classe que representa um funcionário do cinema.
 */

public class Funcionario extends Pessoa{
    private int salario;
    private String expediente;
    private int tempoAtendendo;
    private HashMap<String, Integer> numAtendimentos;

    /**
     * Construtor da classe Funcionario
     * @param nome - nome do funcionário
     * @param idade - nome do funcionário
     * @param cpf - cpf do funcionário
     * @param salario - salario do funcionário
     * @param expediente - carga horária ou parte do dia que o funcionário trabalha
     * @param tempoAtendimento - tempo que o funcionário leva para atender um cliente
     */
    public Funcionario(String nome, int idade, String cpf, int salario, String expediente, int tempoAtendendo){
        super(nome, idade, cpf);
        this.salario=salario;
        this.expediente=expediente;
        this.tempoAtendendo=tempoAtendendo;
        numAtendimentos = new HashMap<String, Integer>();
    }
    
    /**
     * Getter para o salario
     * @return salario - o salario que o funcionário recebe
     */
    public int getSalario(){
        return salario;
    }
    /**
     * Getter para o expediente
     * @return expediente - o tempo de expedição no cinema
     */
    public String getExpediente(){
        return expediente;
    }
    /** 
     * Getter para o tempo de atendimento
     * @return tempoAtendendo - o tempo que o funcionário gastou para atender um cliente
     */
    public int getTempoAtendendo(){
        return tempoAtendendo;
    }

    /**
     * Setter para o salario
     * @param novoSalario - o novo salário do funcionário
     */
    public void setSalario(int novoSalario){
        salario = novoSalario;
    }
    /**
     * Setter para o expediente
     * @param novoExpediente - o novo expediente do funcionário
     */
    public void setExpediente(String novoExpediente){
        expediente = novoExpediente;
    }
    /**
     * Setter para o tempo de atendimento
     * @param novoTempoAtendimento - o novo tempo que o funcionário leva para atender um cliente
     */
    public void setTempoAtendendo(int novoTempoAtendendo){
        tempoAtendendo = novoTempoAtendendo;
    }   
}