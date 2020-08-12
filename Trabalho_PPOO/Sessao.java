/**
 * Classe que representa uma sessão de um filme do cinema.
 * COLOCAR O QUE FAZ (ex: permite realizar a compra do ingresso)
 */

import java.util.*;
public class Sessao {
    //Atributos
    private String horario;
    private String filme;
    private String sala;
    private String evento;
    private int lotacao;
    private double preco;
    private ArrayList<Ingresso> ingressos;

    public Sessao(String horario, String filme, String sala, String evento, int lotacao, double preco){
        this.horario=horario;
        this.filme=filme;
        this.sala=sala;
        this.evento=evento;
        this.lotacao=lotacao;
        this.preco=preco;
        ingressos=new ArrayList<Ingresso>();
    }

    //Getters
    public String getHorario(){
        return horario;
    }
    public String getFilme(){
        return filme;
    }
    public String getSala(){
        return sala;
    }
    public String getEvento(){
        return evento;
    }
    public int getLotacao(){
        return lotacao;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double novoPreco){
        this.preco=novoPreco;
    }
}