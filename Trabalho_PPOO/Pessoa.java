/**
 * Classe que representa uma pessoa que possui relação com o cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */


public class Pessoa {
    private String nome;
    private String idade;
    private String cpf;

    public Pessoa(String nome, String idade, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }

    public String getNome(){
        return nome;
    }
    public String getIdade(){
        return idade;
    }
    public String getCpf(){
        return cpf;
    }
}