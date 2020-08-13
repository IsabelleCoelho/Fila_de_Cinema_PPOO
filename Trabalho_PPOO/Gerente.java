/**
 * Classe que representa um gerente do cinema.
 */

public class Gerente extends Funcionario{
    private String setor;
    /**
     * Construtor para a classe Gerente
     * @param String nome - o nome do gerente
     * @param int idade - a idade do gerente
     * @param String cpf - o cpf do gerente
     * @param int salario - o salario do gerente
     * @param String expediente - carga horária ou parte do dia que o gerente trabalha
     * @param int tempoAtendimento - tempo que o gerente leva para atender um cliente
     * @param String setor - indica o setor em que o gerente atua
     */
    public Gerente(String nome, int idade, String cpf, int salario, String expediente, String setor){
        super(nome, idade, cpf, salario, expediente, 1);
        this.setor=setor;
    }    
}