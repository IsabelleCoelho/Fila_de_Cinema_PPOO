/**
 * Classe que representa um estagiário que trabalha no cinema.
 */

public class Estagiario extends Funcionario{
    /**
     * Construtor da classe Estagiario.
     * @param String nome - o nome do estagiário
     * @param int idade - a idade do estagiário
     * @param String cpf - o cpf do estagiário
     * @param int salario - o salário do estagiário
     * @param String expediente - a carga horária ou parte do dia que o estagiário trabalha
     * @param int tempoAtendimento - o tempo que o estagiário leva para atender um cliente
     */
    public Estagiario(String nome, int idade, String cpf, int salario, String expediente, int tempoAtendendo){
        super(nome, idade, cpf, salario, expediente, tempoAtendendo);
    }
    @Override
    public String toString(){
        return "";
    }
    
}