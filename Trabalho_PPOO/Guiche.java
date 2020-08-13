/**
 * Classe que representa um guiche do cinema.
 */

public class Guiche {
    private Funcionario funcionario;
    private int atendendo;
    /**
     * Construtor da classe Guiche.
     */
    public Guiche(){
        this.funcionario = null;
        this.atendendo = 0;
    }
    /**
     * Setter para o funcionario
     * @param funcionario - o funcionário que será alocado no guiche
     */
    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }
    /**
     * Getter para o funcionário
     * @return funcionario - o funcionário do guiche
     */
    public Funcionario getFuncionario(){
        return funcionario;
    }
    /**
     * Método responsável por retornar o tempo que falta para acabar o atendimento do cliente.
     * @return int - valor do atributo "atendendo".
     */
    public int getAtendendo(){
        return this.atendendo;
    }
    /**
     * Método que retorna o tempo de atendimento do funcionário
     * @return int - o tempo de atendimento do funcionario
     */
    public int tempoAtendimento(){
        return funcionario.gettempoAtendimento();
    }
    /**
     * Método responsável por atribuir novo valor ao atributo "atendendo".
     * @param novoAtendendo - inteiro que armazena o tempo de atendimento.
     */
    public void setAtendendo(int novoAtendendo){
        this.atendendo=novoAtendendo;
        funcionario.adicionarTempoAtendimento(novoAtendendo);
        funcionario.setPessoasAtendidas();
    }
    /**
     * Método responsável por decrementar o valor de atendendo.
     */
    public void atendido(){
        this.atendendo--;
    }
}