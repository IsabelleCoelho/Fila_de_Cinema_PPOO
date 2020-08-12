/**
 * Classe que responsável por gerenciar os eventos do cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public abstract class Evento {

    public double valorAPagar(Cliente cliente, double preco){
        return preco*cliente.getModificadorDesconto();
    }

}