/**
 * Classe que representa um ingresso de determinada sessao que pertence ao cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public class Ingresso {
    //Atributos
    private int numero;
    private int valor;
    private String tipoIngresso;

    //Construtor
    public Ingresso(String filme, int numero, int valor, String tipoIngresso){
        this.numero = numero;
        this.valor = valor;
        this.tipoIngresso = tipoIngresso;
    }

    //Getters
    public int getNumero(){
        return numero;
    }
    public int getValor(){
        return valor;
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
}