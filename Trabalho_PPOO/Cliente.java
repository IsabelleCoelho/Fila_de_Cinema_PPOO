/**
 * Classe que representa uma pessoa que consumirá um serviço do cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public class Cliente extends Pessoa{
    private int tempoDeAtencao;
    private int tempoNaFila;
    private double modificadorDesconto;
    
    /**
     * Construtor da classe Cliente.
     * Tal construtor será utilizado quando o objeto criado pertencer à classe "Preferencial" ou à classe "Estudante".
     * @param nome
     * @param idade
     * @param cpf
     * @param tempoDeAtencao
     * @param tempoNaFila
     * @param modificadorDesconto
     */
    public Cliente(String nome, String idade, String cpf, int tempoDeAtencao, int tempoNaFila, double modificadorDesconto){
        super(nome, idade, cpf);
        this.tempoDeAtencao=tempoDeAtencao;
        this.tempoNaFila=tempoNaFila;
        this.modificadorDesconto=modificadorDesconto;
    }

    /**
     * Construtor da classe Cliente.
     * Tal construtor será usado quando forem utilizado quando o cliente não pertencer à classe "Preferencial" ou à classe "Estudante".
     * @param nome
     * @param idade
     * @param cpf
     * @param tempoDeAtencao
     * @param tempoNaFila
     */
    public Cliente(String nome, String idade, String cpf, int tempoDeAtencao, int tempoNaFila){
        super(nome, idade, cpf);
        this.tempoDeAtencao=tempoDeAtencao;
        this.tempoNaFila=tempoNaFila;
        this.modificadorDesconto = 1;
    }

    public int getTempoDeAtencao(){
        return this.tempoDeAtencao;
    }
    public int getTempoNaFila(){
        return this.tempoNaFila;
    }
    public double getModificadorDesconto(){
        return this.modificadorDesconto;
    }
}