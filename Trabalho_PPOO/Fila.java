import java.util.LinkedList;
/**
 * Classe que representa a fila para comprar ingressos no cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

public class Fila {
    private static LinkedList<Cliente>clientes;
    private static Fila instanciaUnica;

    private Fila(){
        clientes = new LinkedList<Cliente>();
    }
    public static Fila getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new Fila();
        }
        return instanciaUnica;
    }

    public void adicionarNaFila(Cliente pessoa){
        clientes.add(pessoa);
    }
    public void removerDaFila(Cliente pessoa){
        clientes.remove(pessoa);
    }
}