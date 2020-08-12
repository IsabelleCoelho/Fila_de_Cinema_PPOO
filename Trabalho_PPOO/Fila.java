import java.util.LinkedList;
/**
 * Classe que representa a fila para comprar ingressos no cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public class Fila {
    private LinkedList<Cliente>clientes;

    public Fila(){
        clientes = new LinkedList<Cliente>();
    }

    public void adicionarNaFila(Cliente pessoa){
        clientes.add(pessoa);
    }
    public void removerDaFila(Cliente pessoa){
        clientes.remove(pessoa);
    }
}