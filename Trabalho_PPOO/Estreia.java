/**
 * Classe que representa o evento estreia que ocorrera no cinema.
 */
public class Estreia extends Evento{
    private double precoExtra;
    /**
     * Método responsável por calcular o valor que o cliente deve pagar
     * @param cliente - objeto do tipo Cliente 
     * @return double - valor a ser pago pelo cliente
     */
    @Override
    public double valorAPagar(Cliente cliente, double preco){
        if(cliente instanceof Estudante){
            return (preco+precoExtra)/2;    
        }
        return preco+precoExtra;
    }
}