import java.util.ArrayList;
/**
 * Classe que representa um funcionário do cinema.
 */

public class Funcionario extends Pessoa{
    private int salario;
    private String expediente;
    private int tempoAtendimento;
    private String estado;
    private int pessoasAtendidas;
    private ArrayList<Integer> tempoAtendimentos;

    /**
     * Construtor da classe Funcionario.
     * Usado quando o Funcionario em questão não pertence à classe Gerente nem à classe Estagiário.
     * @param nome - nome do funcionário
     * @param idade - nome do funcionário
     * @param cpf - cpf do funcionário
     * @param salario - salario do funcionário
     * @param expediente - carga horária ou parte do dia que o funcionário trabalha
     */
    public Funcionario(String nome, int idade, String cpf, int salario, String expediente){
        super(nome, idade, cpf);
        this.salario=salario;
        this.expediente=expediente;
        this.tempoAtendimento=2;
        this.estado="descansando";
        this.pessoasAtendidas = 0;
        tempoAtendimentos = new ArrayList<Integer>();
    }
    /**
     * Construtor da classe Funcionario.
     * Usado quando o Funcionario em questão pertence à classe Gerente ou à classe Estagiário.
     * @param nome - String que representa o nome do funcionário
     * @param idade - inteiro que representa o nome do funcionário
     * @param cpf - String que representa cpf do funcionário
     * @param salario - inteiro que representa o salario do funcionário
     * @param expediente - String que representa a carga horária ou parte do dia que o funcionário trabalha
     * @param tempoAtendimento - inteiro que representa o tempo que um funcionário leva para atender um cliente.
     */
    public Funcionario(String nome, int idade, String cpf, int salario, String expediente, int tempoAtendimento){
        super(nome, idade, cpf);
        this.salario=salario;
        this.expediente=expediente;
        this.tempoAtendimento=tempoAtendimento;
        this.estado="descansando";
        this.pessoasAtendidas = 0;
        tempoAtendimentos = new ArrayList<Integer>();
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
     * @return tempoAtendimento - o tempo que o funcionário gasta para atender um cliente
     */
    public int gettempoAtendimento(){
        return tempoAtendimento;
    }
    public String getEstado(){
        return estado;
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
    public void settempoAtendimento(int novotempoAtendimento){
        tempoAtendimento = novotempoAtendimento;
    }
    public void setEstado(String estado){
        this.estado=estado;
    } 
    /**
     * Setter para a quantidade de pessoas atendidas
     */
    public void setPessoasAtendidas(){
        ++pessoasAtendidas;
    }
    /**
     * Getter para as pessoas que foram atendidas até o momento.
     */
    public int getPessoasAtendidas(){
        return pessoasAtendidas;
    }
    /**
     * Método responsável por adicionar o tempo de atendimento de um cliente.
     * @param tempo - inteiro que representa o tempo de atendimento de um cliente.
     */
    public void adicionarTempoAtendimento(int tempo){
        tempoAtendimentos.add(tempo);
    }
    /**
     * Getter dos tempos de atendimentos.
     * @return ArrayList - retorna os tempos de todos os atendimentos feitos até o momento.
     */
    public ArrayList<Integer> getTempoAtendimentos(){
        return tempoAtendimentos;
    }
}