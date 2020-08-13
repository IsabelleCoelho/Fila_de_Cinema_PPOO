/**
 * Classe que representa uma sessão de um filme do cinema.
 */

import java.util.*;
public class Sessao {
    private String horario;
    private String filme;
    private String sala;
    private String evento;
    private int lotacao;
    private double preco;
    private String estado;
    private LinkedList<Ingresso> ingressos;

    /**
     * Construtor para a classe Sessao
     * @param String horario - o horario da sessão
     * @param String filme - o filme que estará passando na sessão
     * @param String sala - a sala em que ocorrerá a sessão
     * @param String evento - o tipo de evento da sessão
     * @param int lotacao - a capacidade máxima de pessoas que a sessão pode comportar
     * @param double preco - o preço do ingresso para a sessão
     */
    public Sessao(String horario, String filme, String sala, String evento, int lotacao, double preco){
        this.horario=horario;
        this.filme=filme;
        this.sala=sala;
        this.evento=evento;
        this.lotacao=lotacao;
        this.preco=preco;
        estado = "Aberta";
        ingressos=new LinkedList<Ingresso>();
        for (int i = 0; i < this.lotacao; i++) {
            Ingresso ingresso = new Ingresso(getFilme(), i, 20, "integral");
            ingressos.add(ingresso);
        }
    }

    /**
     * Getter para o horario
     * @return String horario - o horário em que a sessão se inicia
     */
    public String getHorario(){
        return horario;
    }
    /**
     * Getter para o filme
     * @return String filme - o filme que vai passar na sessão
     */
    public String getFilme(){
        return filme;
    }
    /**
     * Getter para a sala
     * @return String sala - a sala em que ocorrerá a sessão
     */
    public String getSala(){
        return sala;
    }
    /**
     * Getter para o evento
     * @return String evento - o evento que ocorre na sessão
     */
    public String getEvento(){
        return evento;
    }
    /**
     * Getter para a lotação
     * @return String lotacao - a capacidade máxima que uma sessão pode comportar
     */
    public int getLotacao(){
        return lotacao;
    }
    /**
     * Getter para o preço
     * @return double preco - o valor do ingresso para a sessão
     */
    public double getPreco(){
        return this.preco;
    }
    /**
     * Getter para a situação da sessão
     * @return String estado - indica o estado da sessão (aberto ou fechado)
     */
    public String getEstado(){
        return estado;
    }
    /**
     * Setter para o preço
     * @param double novoPreco - o novo preço do ingresso da sessão
     */
    public void setPreco(double novoPreco){
        this.preco=novoPreco;
    }
    /**
     * Setter para a situação da sessão
     * @param String estado - o novo estado em que a sessão se encontra (aberto ou fechado)
     */
    public void setEstado(String estado){
        this.estado = estado;
    }
    /**
     * Fecha uma sessão
     */
    public void fecharSessao(){
        setEstado("Fechada");
    }
    public int getQuantIngresso(){
        return ingressos.size();
    }
    public void setLotacao(){
        lotacao--;
    }
    public void venderIngresso(){
        ingressos.remove();
    }
}