/**
 * Classe que representa o evento matinê que ocorrerá no cinema.
 */
public class Matine extends Evento{
    /**
     * Método responsável por calcular o valor do ingresso.
     * Como se trata de Matinê, todos os clientes pagam metade do valor.
     * @param double - valor do ingresso inteiro
     * @return double - valor que o cliente deve pagar
     */
    @Override
    public double valorAPagar(Cliente cliente, double preco){
        return preco/2;
    }
}