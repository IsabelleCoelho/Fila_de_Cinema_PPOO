/**
 * Classe que representa o evento estreia que ocorrera no cinema.
 */

public class Estreia extends Evento{
    private double precoExtra;
    public Estreia(double precoExtra){
        this.precoExtra = precoExtra;
    }
    public double valorAPagar(double preco){
        return preco*precoExtra;
    }
}