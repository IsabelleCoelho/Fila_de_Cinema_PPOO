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
        return this.documento;
    }

    //Setters
    public void setDocumento(String novoDocumento){
        this.documento=novoDocumento;
    }
}