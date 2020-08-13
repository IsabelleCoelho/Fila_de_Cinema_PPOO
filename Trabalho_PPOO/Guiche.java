/**
 * Classe que representa um guiche do cinema.
 */

public class Guiche {
    private Funcionario funcionario;

    /**
     * Construtor da classe Guiche
     */
    public Guiche(){
        this.funcionario = null;
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
     * Método que retorna o tempo de atendimento do funcionário
     * @return tempoAtendimento - o tempo de atendimento do funcionario
     */
    public int tempoAtendimento(){
        return funcionario.getTempoAtendendo();
    }
}