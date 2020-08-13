import java.util.LinkedList;
/**
 * Classe que representa a fila para comprar ingressos no cinema.
 */

public class Fila {
    private static LinkedList<Cliente>clientes;
    private static Fila instanciaUnica;

    /**
     * Construtor da Classe Fila.
     */
    private Fila(){
        clientes = new LinkedList<Cliente>();
    }
    /**
     * Método responsável pela verificação de unicidade do objeto da classe Fila.
     * @return Fila - se a fila já foi instanciada, retorna a própria fila. Senão, retorna null.
     */
    public static Fila getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new Fila();
        }
        return instanciaUnica;
    }
    /**
     * Método responsável por adicionar um cliente no final da fila.
     * @param pessoa - um objeto do tipo Cliente que representa a pessoa a ser adicionada na fila.
     */
    public void adicionarNaFila(Cliente pessoa){
        if(pessoa instanceof Preferencial){
            adicionarPreferencia(pessoa);
        }
        else{
            clientes.add(pessoa);
        } 
    }
    /**
     * Método responsável por revomer um cliente da fila
     * @param pessoa - objeto do tipo Cliente que será removido da fila
     */
    public Cliente removerDaFila(){
        Cliente removido = clientes.getFirst();
        clientes.remove(clientes.getFirst());
        return removido;
    }
    /**
     * Método responsável por retornar o tamanho da fila naquele momento.
     * @return int - tamanho da fila.
     */
    public int getTamanhoFila(){
        return clientes.size();
    }
    /**
     * Método responsável por organizar a fila de maneira que os clientes que são da classe Preferencial ocupem os primeiros lugares na fila.
     * Os clientes do tipo Preferencial são adicionados por ordem de chegada.
     * @param Cliente - objeto do tipo Cliente que representa um cliente do tipo Preferencial a ser adicionado na fila.
     */
    public void adicionarPreferencia(Cliente pessoa){
        int i=0;
            boolean verificador = false;
            while(i < clientes.size() && verificador == false){
                if(clientes.get(i) instanceof Preferencial){
                    i++;
                }
                else{
                    verificador = true;
                }
            }
            clientes.add(i, pessoa);
    }
    public void adicionarTempo(){
        for (Cliente cliente : clientes) {
            cliente.addTempoNaFila();
        }
    }
}