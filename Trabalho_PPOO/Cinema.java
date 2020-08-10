import java.util.*;
public class Cinema {
    //Atributos
    private String nome;
    private String cep;
    private String cidade;
    private String rua;
    private int numero;
    private String cnpj;
    private List<Pessoa> pessoas;

    //Construtor
    public Cinema(String nome, String cep, String cidade, String rua, int numero, String cnpj){
        this.nome=nome;
        this.cep=cep;
        this.cidade=cidade;
        this.rua=rua;
        this.numero=numero;
        this.cnpj=cnpj;
        pessoas=new ArrayList<Pessoa>();
    }

    //Getters
    public String getNome(){
        return this.nome;
    }
    public String getCep(){
        return this.cep;
    }
    public String getCidade(){
        return this.cidade;
    }
    public String getRua(){
        return this.rua;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getCnpj(){
        return this.cnpj;
    }

    //Setters
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setCep(String novoCep){
        this.cep = novoCep;
    }
    public void setCidade(String novaCidade){
        this.cidade = novaCidade;
    }
    public void setRua(String novaRua){
        this.rua = novaRua;
    }
    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }
    public void setCpnj(String novoCnpj){
        this.cnpj = novoCnpj;
    }

}