public class Preferencial extends Pessoa{
    //Atributos
    private String tipo;

    //Construtor
    public Preferencial(String nome, String idade, String cpf, String tipo){
        super(nome, idade, cpf);
        this.tipo = tipo;
    }

    //Getters
    public String getTipo(){
        return this.tipo;
    }

    //Setters
    public void setTipo(String novoTipo){
        this.tipo=novoTipo;
    }
    public String toString(){
        return "";
    }
}