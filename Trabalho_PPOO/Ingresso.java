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
        return filme;
    }
    public int getNumero(){
        return numero;
    }
    public int getValor(){
        return valor;
    }
    public String getSessao(){
        return sessao;
    }

    //Setters
    public void setFilme(String novoFilme){
        filme=novoFilme;
    }
    public void setNumero(int novoNumero){
        numero=novoNumero;
    }
    public void setValor(int novoValor){
        valor=novoValor;
    }
    public void setSessao(String novaSessao){
        sessao=novaSessao;
    }
    
}