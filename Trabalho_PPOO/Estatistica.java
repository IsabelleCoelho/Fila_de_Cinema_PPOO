import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
/**
 * Classe responsável por gerar a análise estatística dos atendimentos feitos no cinema.
 */

public class Estatistica {
    private static HashMap<Funcionario, Double> estatisticaFuncionario;
    private static double estatisticaGeral;
    private static Estatistica instanciaUnica;

    private Estatistica(){
        estatisticaFuncionario = new HashMap<Funcionario, Double>();
        estatisticaGeral = 0;
    }

    public static Estatistica getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new Estatistica();
        }
        return instanciaUnica;
    }

    public double calcularMedia(Funcionario funcionario){
        double mediaAtendimentos = 0;
        ArrayList<Integer> tempos = funcionario.getTempoAtendimentos();
        for(int tempo : tempos){
            mediaAtendimentos += tempo;
        }
        return (mediaAtendimentos/(funcionario.getPessoasAtendidas()));
    }

    public void adicionarFuncionario(Funcionario funcionario){
        double media = calcularMedia(funcionario);
        estatisticaFuncionario.put(funcionario, media);
    }

    public HashMap<Funcionario, Double> getEstatisticaFuncionario(){
        return estatisticaFuncionario;
    }

    public double mediaGeral(){
        double medias = 0;
        Set<Funcionario> funcionarios = estatisticaFuncionario.keySet();
        for (Funcionario funcionario : funcionarios) {
            medias += estatisticaFuncionario.get(funcionario);
        }
        return medias/(estatisticaFuncionario.size());
    }
}