/**
 * Classe que representa um ingresso de determinada sessao que pertence ao cinema.
 */

public class Ingresso {
    private int numero;
    private double valor;
    private String tipoIngresso;

    /**
     * Construtor da classe Ingresso.
     * @param filme - string que armazena o nome do filme
     * @param numero - inteiro que armazena o número do ingresso
     * @param valor - double que armazena o valor do ingresso
     * @param tipoIngresso - string que armazena o tipo de ingresso
     */
    public Ingresso(String filme, int numero, double valor, String tipoIngresso){
        this.numero = numero;
        this.valor = valor;
        this.tipoIngresso = tipoIngresso;
    }
    /**
     * Getter do número do ingresso.
     * @return int - codigo do ingresso.
     */
    public int getNumero(){
        return numero;
    }
    /**
     * Getter do valor do ingresso.
     * @return double - valor do ingresso
     */
    public double getValor(){
        return valor;
    }
    /**
     * Getter do tipo de ingresso.
     * @return String - tipo de ingresso.
     */
    public String getTipoIngresso(){
        return tipoIngresso;
    }
    /**
     * Setter do numero do ingresso.
     * @param novoNumero - inteiro que armazena o código do ingresso.
     */
    public void setNumero(int novoNumero){
        numero=novoNumero;
    }
    /**
     * Setter do valor do ingresso.
     * @param novoValor - inteiro que armazena o valor do ingresso.
     */
    public void setValor(int novoValor){
        valor=novoValor;
    }
}