/**
 * Classe que representa um evento Regular dentro do cinema.
 */
public class Regular extends Evento{
    /**
     * Método que calcula o valor a pagar de um cliente.
     * @param cliente - objeto do tipo Cliente
     * @param preco - double que representa o preço do ingresso
     * @return double - valor que o cliente deve pagar
     */
    @Override
    public double valorAPagar(Cliente cliente, double preco){
        if(cliente instanceof Estudante){
            return preco/2;
        }
        return preco;
    }
}