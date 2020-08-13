/**
 * Classe que representa uma sessão de um filme do cinema.
 */

import java.util.*;
public class Sessao {
    private String horario;
    private String filme;
    private String sala;
    private Evento evento;
    private int lotacao;
    private double preco;
    private String estado;
    private LinkedList<Ingresso> ingressos;

    /**
     * Construtor para a classe Sessao
     * @param horario - string contendo horario da sessão
     * @param filme - string contendo filme que estará passando na sessão
     * @param sala - string contendo a sala em que ocorrerá a sessão
     * @param evento - objeto do tipo Evento
     * @param lotacao - inteiro contendo a capacidade máxima de pessoas que a sessão pode comportar
     * @param preco - double contendo preço do ingresso para a sessão
     */
    public Sessao(String horario, String filme, String sala, Evento evento, int lotacao){
        this.horario=horario;
        this.filme=filme;
        this.sala=sala;
        this.lotacao=lotacao;
        this.preco=20;
        estado = "Aberta";
        ingressos=new LinkedList<Ingresso>();
        for (int i = 0; i < this.lotacao; i++) {
            Ingresso ingresso = new Ingresso(getFilme(), i, 20, "integral");
            ingressos.add(ingresso);
        }
        this.evento=evento;
    }

    /**
     * Getter para o horario
     * @return String - o horário em que a sessão se inicia
     */
    public String getHorario(){
        return horario;
    }
    /**
     * Getter para o filme
     * @return String - o filme que vai passar na sessão
     */
    public String getFilme(){
        return filme;
    }
    /**
     * Getter para a sala
     * @return String - a sala em que ocorrerá a sessão
     */
    public String getSala(){
        return sala;
    }
    /**
     * Getter para a lotação
     * @return String - a capacidade máxima que uma sessão pode comportar
     */
    public int getLotacao(){
        return lotacao;
    }
    /**
     * Getter para o preço
     * @return double - o valor do ingresso para a sessão
     */
    public double getPreco(){
        return this.preco;
    }
    /**
     * Getter para a situação da sessão
     * @return String - indica o estado da sessão (aberto ou fechado)
     */
    public String getEstado(){
        return estado;
    }
    /**
     * Setter para o preço
     * @param novoPreco - o novo preço do ingresso da sessão
     */
    public void setPreco(double novoPreco){
        this.preco=novoPreco;
    }
    /**
     * Setter para a situação da sessão
     * @param estado - o novo estado em que a sessão se encontra (aberto ou fechado)
     */
    public void setEstado(String estado){
        this.estado = estado;
    }
    /**
     * Método responsável por fechar uma sessão
     */
    public void fecharSessao(){
        setEstado("Fechada");
    }
    /**
     * Método responsável por retornar a quantidade de ingressos que ainda não foram vendidos.
     * @return int - quantidade de ingrssos que não foram vendidos
     */
    public int getQuantIngresso(){
        return ingressos.size();
    }
    /**
     * Método responsável por atualizar a lotação da sessão.
     */
    public void setLotacao(){
        lotacao--;
    }
    /**
     * Método responsável por remover um ingresso da lista de ingressos.
     */
    public void venderIngresso(){
        ingressos.remove();
    }
    /**
     * Método responsável por calcular o valor a ser pago pelo cliente.
     * @param cliente - objeto do tipo Cliente.
     * @return double - valor a ser pago pelo cliente.
     */
    public double valorAPagar(Cliente cliente){
        return evento.valorAPagar(cliente, preco);
    }
}