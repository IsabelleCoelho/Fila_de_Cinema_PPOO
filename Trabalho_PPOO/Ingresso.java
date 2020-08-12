public class Ingresso {
    //Atributos
    private int numero;
    private int valor;
    private Sessao sessao;
    private String tipoIngresso;

    //Construtor
    public Ingresso(String filme, int numero, int valor, Sessao sessao, String tipoIngresso){
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
    public Sessao getSessao(){
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
    public void setSessao(Sessao novaSessao){
        sessao=novaSessao;
    }
    
}