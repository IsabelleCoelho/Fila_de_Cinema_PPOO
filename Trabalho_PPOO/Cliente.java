/**
 * Classe que representa uma pessoa que consumirá um serviço do cinema.
 */

public class Cliente extends Pessoa{
    private int tempoDeAtencao = 1;
    private int tempoNaFila = 0;
    
    /**
     * Construtor da classe Cliente para estudante ou preferencial.
     * @param nome
     * @param idade
     * @param cpf
     * @param tempoDeAtencao
     */
    public Cliente(String nome, int idade, String cpf, int tempoDeAtencao){
        super(nome, idade, cpf);
        this.tempoDeAtencao = tempoDeAtencao;
        this.tempoNaFila = 0;
        this.tempoDeAtencao = tempoDeAtencao;
    }

    /**
     * Construtor da classe Cliente para um cliente regular.
     * @param nome
     * @param idade
     * @param cpf
     */
    public Cliente(String nome, int idade, String cpf){
        super(nome, idade, cpf);
        this.tempoNaFila = 0;
        this.tempoDeAtencao = 1;
    }

    /**
     * Getter do tempo que o cliente precisa para ser atendido.
     * @return int - tempo que o cliente precisa para ser atendido
     */
    public int getTempoDeAtencao(){
        return this.tempoDeAtencao;
    }

    /**
     * Getter do tempo que o cliente ficou na fila
     * @return int - tempo que o cliente ficou na fila antes de ser atendido
     */
    public int getTempoNaFila(){
        return this.tempoNaFila;
    }
}