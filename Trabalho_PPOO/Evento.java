/**
 * Classe que responsável por gerenciar os eventos do cinema.
 */

public abstract class Evento {
    /**
     * Método responsável por calcular o valor que o cliente deverá pagar na sessao em questao.
     * @return double - valor que o cliente deve pagar.
     */
    public double valorAPagar(Cliente cliente, double preco){
        return preco*cliente.getModificadorDesconto();
    }

}