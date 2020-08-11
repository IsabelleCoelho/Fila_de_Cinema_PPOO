import java.util.*;
public class Sessao {
    //Atributos
    private String horario;
    private ArrayList<Ingresso> ingressos;

    public Sessao(String horario){
        this.horario=horario;
        ingressos=new ArrayList<Ingresso>();
    }

    //Getters
    public String getHorario(){
        return horario;
    }
}