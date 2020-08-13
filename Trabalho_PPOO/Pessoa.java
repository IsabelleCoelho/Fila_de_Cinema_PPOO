/**
 * Classe que representa uma pessoa que possui relação com o cinema.
 */

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    /**
     * Construtor da classe Pessoa
     * @param String nome - o nome da pessoa
     * @param int idade - a idade da pessoa
     * @param String cpf - o cpf da pessoa
     */
    public Pessoa(String nome, int idade, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }

    /**
     * Getter para o nome
     * @return String nome - o nome da pessoa
     */
    public String getNome(){
        return nome;
    }
    /**
     * Getter para a idade
     * @return int idade - a idade da pessoa
     */
    public int getIdade(){
        return idade;
    }
    /**
     * Getter para o cpf
     * @return String cpf - o cpf da pessoa
     */
    public String getCpf(){
        return cpf;
    }
}