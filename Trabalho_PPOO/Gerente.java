/**
 * Classe que representa um gerente do cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */


public class Gerente extends Funcionario{
    //Construtor
    public Gerente(String nome, String idade, String cpf, int salario, String expediente, String tempoAtendendo, String cargo){
        super(nome, idade, cpf, salario, expediente, tempoAtendendo);
    }
    public String toString(){
        return "";
    }
}