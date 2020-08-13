/**
 * Classe que responsável por gerenciar os eventos do cinema.
 */
public abstract class Evento {
    /**
     * Método responsável por calcular o valor que o cliente deverá pagar na sessao em questao.
     * @param cliente - objeto do tipo Cliente
     * @param preco - double que representa o valor do ingresso
     * @return double - valor que o cliente deve pagar.
     */
    public abstract double valorAPagar(Cliente cliente, double preco);

}