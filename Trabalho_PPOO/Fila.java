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
     * @return Fila instanciaUnica - se a fila já foi instanciada, retorna a própria fila. Senão, retorna null.
     */
    public static Fila getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new Fila();
        }
        return instanciaUnica;
    }

    /**
     * Método responsável por adicionar um cliente no final da fila.
     * @param Cliente pessoa - um objeto do tipo cliente que representa a pessoa a ser adicionada na fila.
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
     * @param Cliente pessoa - objeto do tipo cliente que será removido da fila
     */
    public void removerDaFila(Cliente pessoa){
        clientes.remove(pessoa);
    }

    /**
     * Método responsável por retornar o tamanho da fila naquele momento.
     * @return int tamanhoFila - tamanho da fila.
     */
    public int getTamanhoFila(){
        return clientes.size();
    }

    /**
     * Método responsável por organizar a fila de maneira que os clientes que são da classe Preferencial ocupem os primeiros lugares na fila.
     * Os clientes do tipo Preferencial são adicionados por ordem de chegada.
     * @param Cliente pessoa - objeto do tipo Cliente que representa um cliente do tipo Preferencial a ser adicionado na fila.
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
}