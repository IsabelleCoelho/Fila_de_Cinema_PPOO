public class Ingresso {
    //Atributos
    private String filme;
    private int numero;
    private int valor;
    private String sessao;

    //Construtor
    public Ingresso(String filme, int numero, int valor, String sessao){
        this.filme=filme;
        this.numero = numero;
        this.valor = valor;
        this.sessao = sessao;
    }

    //Getters
    public String getFilme(){
        return this.filme;
    }
    public int getNumero(){
        return this.numero;
    }
    public int getValor(){
        return this.valor;
    }
    public String getSessao(){
        return this.sessao;
    }

    //Setters
    public void setFilme(String novoFilme){
        this.filme=novoFilme;
    }
    public void setNumero(int novoNumero){
        this.numero=novoNumero;
    }
    public void setValor(int novoValor){
        this.valor=novoValor;
    }
    public void setSessao(String novaSessao){
        this.sessao=novaSessao;
    }
    
}