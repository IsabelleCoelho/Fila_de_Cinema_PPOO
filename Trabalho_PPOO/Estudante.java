public class Estudante extends Pessoa{
    //Atributos
    private String documento;

    //Construtor
    public Estudante(String nome, int idade, String cpf, String documento){
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