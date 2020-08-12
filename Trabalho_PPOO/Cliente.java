/**
 * Classe que representa uma pessoa que consumirá um serviço do cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public class Cliente extends Pessoa{
    private int tempoDeAtencao;
    private int tempoNaFila;
    private double modificadorDesconto;
    
    public Cliente(String nome, String idade, String cpf, int tempoDeAtencao, int tempoNaFila, double modificadorDesconto){
        super(nome, idade, cpf);
        this.tempoDeAtencao=tempoDeAtencao;
        this.tempoNaFila=tempoNaFila;
        this.modificadorDesconto=modificadorDesconto;
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