import java.util.*;
public class Cinema {
    //Atributos
    private String nome;
    private String cep;
    private String cnpj;
    private ArrayList<Guiche> guiches;
    private ArrayList<Funcionario> funcionarios;
    private Fila fila;

    //Construtor
    public Cinema(String nome, String cep, String cidade, String rua, int numero, String cnpj){
        this.nome=nome;
        this.cep=cep;
        this.cnpj=cnpj;
        funcionarios=new ArrayList<Funcionario>();
        guiches=new ArrayList<Guiche>();
        Fila fila = new Fila();
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

    //Metodos
    public void adicionarNaFila(Cliente pessoa){
        fila.adicionarNaFila(pessoa);
    }
    public void retirarDaFila(Cliente pessoa){
        fila.removerDaFila(pessoa);
    }
}