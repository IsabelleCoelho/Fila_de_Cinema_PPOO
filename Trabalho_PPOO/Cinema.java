import java.util.*;
public class Cinema {
    //Atributos
    private String nome;
    private String cep;
    private String cnpj;
    private ArrayList<Filme> filmes;
    private ArrayList<Pessoa> pessoas;

    //Construtor
    public Cinema(String nome, String cep, String cidade, String rua, int numero, String cnpj){
        this.nome=nome;
        this.cep=cep;
        this.cnpj=cnpj;
        pessoas=new ArrayList<Pessoa>();
        filmes=new ArrayList<Filme>();
    }

    //Getters
    public String getNome(){
        return nome;
    }
    public String getCep(){
        return cep;
    }
    public String getCnpj(){
        return cnpj;
    }

    //Setters
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public void setCep(String novoCep){
        cep = novoCep;
    }
    public void setCpnj(String novoCnpj){
        cnpj = novoCnpj;
    }
    public void gerarRelatorio(){
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
            System.out.println();
        }
    }
}