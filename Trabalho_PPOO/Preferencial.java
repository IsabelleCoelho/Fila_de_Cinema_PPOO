/**
 * Classe que representa um cliente com atendimento preferencial no cinema.
 */

public class Preferencial extends Cliente{
    private String tipo;

    /**
     * Construtor para a classe Preferencial
     * @param String nome - o nome do cliente com atendimento preferencial
     * @param int idade - a idade do cliente com atendimento preferencial
     * @param String cpf - o cpf do cliente com atendimento preferencial
     * @param int tempoDeAtencao - a quantidade de tempo que o cliente com atendimento preferencial leva para ser atendido
     * @param int tempoNaFila - a quantidade de tempo que o com atendimento preferencial fica na fila para o atendimento
     * @param String tipo - o tipo de necessidade especial do cliente
     */
    public Preferencial(String nome, int idade, String cpf, int tempoNaFila, String tipo){
        super(nome, idade, cpf, 3, tempoNaFila);
        this.tipo = tipo;
    }

    /**
     * Getter para o tipo de cliente preferencial
     * @return String tipo - o tipo de situação preferencial do cliente
     */
    public String getTipo(){
        return this.tipo;
    }

    /**
     * Setter para o tipo de cliente preferencial
     * @param String novoTipo - o novo tipo de situação preferencial do cliente
     */
    public void setTipo(String novoTipo){
        this.tipo = novoTipo;
    }

    @Override
    public String toString(){
        return "";
    }
}