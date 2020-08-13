/**
 * Classe que representa um estudante que está frequentando o cinema.
 */
public class Estudante extends Cliente{
    private String documento;

    /**
     * Construtor da classe Estudante
     * @param nome - o nome do estudante
     * @param idade - a idade do estudante
     * @param cpf - o cpf do estudante
     * @param tempoDeAtencao - o tempo que o estudante precisa de atenção no atendimento
     * @param tempoNaFila - o tempo que o estudante passou na fila de espera
     * @param documento - o documento do estudante
     */
    public Estudante(String nome, int idade, String cpf, String documento){
        super(nome, idade, cpf, 2, 0, 0.5);
        this.documento = documento;
    }

    /**
     * Getter para o documento
     * @return documento - o documento do estudante
     */
    public String getDocumento(){
        return documento;
    }

    /**
     * Setter para o documento
     * @param novoDocumento - o novo documento do estudante
     */
    public void setDocumento(String novoDocumento){
        documento=novoDocumento;
    }  
}