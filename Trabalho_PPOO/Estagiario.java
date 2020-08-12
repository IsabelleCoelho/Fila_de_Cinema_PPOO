/**
 * Classe que representa um estagiário que trabalha no cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public class Estagiario extends Funcionario{
    //Construtor
    public Estagiario(String nome, String idade, String cpf, int salario, String expediente, String tempoAtendendo){
        super(nome, idade, cpf, salario, expediente, tempoAtendendo);
    }
    public String toString(){
        return "";
    }
}