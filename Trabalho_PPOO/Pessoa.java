public class Pessoa{
    //Atributos
    private String nome;
    private int idade;
    private String cpf;

    //Construtor
    public Pessoa(String nome, int idade, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }

    //Getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCpf(){
        return cpf;
    }

    //Setters
    public void setNome(String novoNome){
        this.nome=novoNome;
    }
    public void setIdade(int novaIdade){
        this.idade=novaIdade;
    }
    public void setCpf(String novoCpf){
        this.cpf=novoCpf;
    }
}