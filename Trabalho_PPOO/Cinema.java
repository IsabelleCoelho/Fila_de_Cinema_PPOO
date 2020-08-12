import java.util.*;
public class Cinema {
    //Atributos
    private String nome;
    private String cep;
    private String cnpj;
    private ArrayList<Guiche> bilheteria;
    private ArrayList<Funcionario> escala;
    private Sessao sessao;
    private Fila fila;

    //Construtor
    public Cinema(String nome, String cep, String cidade, String rua, int numero, String cnpj){
        this.nome=nome;
        this.cep=cep;
        this.cnpj=cnpj;
        escala=new ArrayList<Funcionario>();
        bilheteria=new ArrayList<Guiche>();
        fila = Fila.getInstance();
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
    public void adicionarNaFila(Cliente cliente){
        fila.adicionarNaFila(cliente);
    }
    public void retirarDaFila(Cliente cliente){
        fila.removerDaFila(cliente);
    }
    public void abrirGuiche(Guiche guiche, Funcionario funcionario){
        guiche.setFuncionario(funcionario);
        bilheteria.add(guiche);
    }
    public void abrirSessao(String horario, String filme, String sala, String evento, int lotacao, double preco){
        sessao = Sessao.getInstance(horario, filme, sala, evento, lotacao, preco);
    }
    public void fecharSessao(){
        
    }
}