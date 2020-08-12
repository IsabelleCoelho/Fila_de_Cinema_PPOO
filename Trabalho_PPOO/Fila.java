import java.util.LinkedList;

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