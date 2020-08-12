/**
 * Classe que representa um estudante que está frequentando o cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public class Estudante extends Pessoa{
    //Atributos
    private String documento;

    //Construtor
    public Estudante(String nome, String idade, String cpf, String documento){
        super(nome, idade, cpf);
        this.documento = documento;
    }

    //Getters
    public String getDocumento(){
        return documento;
    }

    //Setters
    public void setDocumento(String novoDocumento){
        documento=novoDocumento;
    }
    public String toString(){
        return "";
    }   
}