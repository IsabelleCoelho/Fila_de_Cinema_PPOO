/**
 * Classe que representa um cliente com atendimento preferencial no cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */
public class Preferencial extends Cliente{
    //Atributos
    private String tipo;

    //Construtor
    public Preferencial(String nome, String idade, String cpf, int tempoDeAtencao, int tempoNaFila, String tipo){
        super(nome, idade, cpf, tempoDeAtencao, tempoNaFila);
        this.tipo = tipo;
    }

    //Getters
    public String getTipo(){
        return this.tipo;
    }

    //Setters
    public void setTipo(String novoTipo){
        this.tipo=novoTipo;
    }
    public String toString(){
        return "";
    }
}