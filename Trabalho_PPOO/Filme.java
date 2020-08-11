import java.util.*;
public class Filme {
    //Atributos
    private String nome;
    private ArrayList<Sessao> sessoes;

    //Construtor
    public Filme(String nome){
        this.nome=nome;
        sessoes=new ArrayList<Sessao>();
    }

    //Getters
    public String getNome(){
        return nome;
    }

}