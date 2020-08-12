public class Ingresso {
    //Atributos
    private int numero;
    private int valor;
    private String sessao;
    private String tipoIngresso;

    //Construtor
    public Ingresso(String filme, int numero, int valor, String sessao, String tipoIngresso){
        this.numero = numero;
        this.valor = valor;
        this.sessao = sessao;
        this.tipoIngresso = tipoIngresso;
    }

    //Getters
    public int getNumero(){
        return numero;
    }
    public int getValor(){
        return valor;
    }
    public String getSessao(){
        return sessao;
    }
    public String getTipoIngresso(){
        return tipoIngresso;
    }
    
    //Setters
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