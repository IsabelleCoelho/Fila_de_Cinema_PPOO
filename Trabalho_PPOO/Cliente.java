/**
 * Classe que representa uma pessoa que consumirá um serviço do cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public class Cliente extends Pessoa{
    private int tempoDeAtencao = 1;
    private int tempoNaFila = 0;
    private double modificadorDesconto;
    
    /**
     * Construtor da classe Cliente.
     * Tal construtor será utilizado quando o objeto criado pertencer à classe "Estudante".
     * @param nome
     * @param idade
     * @param cpf
     * @param tempoDeAtencao
     * @param tempoNaFila
     * @param modificadorDesconto
     */
    public Cliente(String nome, int idade, String cpf, int tempoDeAtencao, int tempoNaFila, double modificadorDesconto){
        super(nome, idade, cpf);
        this.tempoDeAtencao = tempoDeAtencao;
        this.tempoNaFila = tempoNaFila;
        this.modificadorDesconto = modificadorDesconto;
    }

    /**
     * Construtor da classe Cliente.
     * Tal construtor será usado quando quando o cliente não pertencer à classe "Estudante".
     * @param nome
     * @param idade
     * @param cpf
     * @param tempoDeAtencao
     * @param tempoNaFila
     */
    public Cliente(String nome, int idade, String cpf, int tempoDeAtencao, int tempoNaFila){
        super(nome, idade, cpf);
        this.tempoDeAtencao = tempoDeAtencao;
        this.tempoNaFila = tempoNaFila;
        this.modificadorDesconto = 1;
    }

    /**
     * Getter do tempo que o cliente precisa para ser atendido.
     * @return int tempoDeAtencao - tempo que o cliente precisa para ser atendido
     */
    public int getTempoDeAtencao(){
        return this.tempoDeAtencao;
    }

    /**
     * Getter do tempo que o cliente ficou na fila
     * @return int tempoNaFila - tempo que o cliente ficou na fila antes de ser atendido
     */
    public int getTempoNaFila(){
        return this.tempoNaFila;
    }

    /**
     * Getter do modificador de desconto do cliente
     * @return double modificadorDesconto - valor do modificador de desconto do cliente
     */
    public double getModificadorDesconto(){
        return this.modificadorDesconto;
    }
}