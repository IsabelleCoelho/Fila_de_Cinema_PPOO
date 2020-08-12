public class Estudante extends Cliente{
    //Atributos
    private String documento;

    //Construtor
    public Estudante(String nome, String idade, String cpf, int tempoDeAtencao, int tempoNaFila, String documento){
        super(nome, idade, cpf, tempoDeAtencao, tempoNaFila);
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