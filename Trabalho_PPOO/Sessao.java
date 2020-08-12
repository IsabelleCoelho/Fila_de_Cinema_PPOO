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
    private static Sessao instanciaUnica;
    private ArrayList<Ingresso> ingressos;

    private Sessao(String horario, String filme, String sala, String evento, int lotacao){
        this.horario=horario;
        this.filme=filme;
        this.sala=sala;
        this.evento=evento;
        this.lotacao=lotacao;
        ingressos=new ArrayList<Ingresso>();
    }

    public static Sessao getInstance(String horario, String filme, String sala, String evento, int lotacao){
        if(instanciaUnica == null){
            instanciaUnica = new Sessao(horario, filme, sala, evento, lotacao);
        }
        return instanciaUnica;
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
}