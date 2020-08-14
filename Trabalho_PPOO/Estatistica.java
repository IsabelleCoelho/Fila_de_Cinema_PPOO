import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
/**
 * Classe responsável por gerar a análise estatística dos atendimentos feitos no cinema.
 */

public class Estatistica {
    private static HashMap<Funcionario, Double> estatisticaFuncionario;
    private static Estatistica instanciaUnica;
    /**
     * Construtor da classe Estatistica
     */
    private Estatistica(){
        estatisticaFuncionario = new HashMap<Funcionario, Double>();
    }
    /**
     * Método responsável por verificar a unicidade do objeto da classe Estatistica
     * @return Estatistica - Valor de instanciaUnica
     */
    public static Estatistica getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new Estatistica();
        }
        return instanciaUnica;
    }
    /**
     * Método responsável por calcular a média dos tempos de atendimento de um funcionario
     * @param funcionario - Objeto do tipo Funcionario
     * @return double - média calculada
     */
    public double calcularMedia(Funcionario funcionario){
        double mediaAtendimentos = 0;
        ArrayList<Integer> tempos = funcionario.getTempoAtendimentos();
        for(int tempo : tempos){
            mediaAtendimentos += tempo;
        }
        return (mediaAtendimentos/(funcionario.getPessoasAtendidas()));
    }
    /**
     * Método responsável por adicionar um funcionario ao Hashmap estatisticaFuncionario
     * @param funcionario - Objeto do tipo Funcionario
     */
    public void adicionarFuncionario(Funcionario funcionario){
        double media = calcularMedia(funcionario);
        estatisticaFuncionario.put(funcionario, media);
    }
    /**
     * Método responsável por retornar o Hashmap estatisticaFuncionario
     * @return HashMap<Funcionario, Double> - Hashmap estatisticaFuncionario  
     */
    public HashMap<Funcionario, Double> getEstatisticaFuncionario(){
        return estatisticaFuncionario;
    }
    /**
     * Método responsável por calcular a média geral dos tempos de atendimento
     * @return double - média geral dos tempos de atendimento
     */
    public double mediaGeral(){
        double medias = 0;
        Set<Funcionario> funcionarios = estatisticaFuncionario.keySet();
        for (Funcionario funcionario : funcionarios) {
            medias += estatisticaFuncionario.get(funcionario);
        }
        return medias/(estatisticaFuncionario.size());
    }
}