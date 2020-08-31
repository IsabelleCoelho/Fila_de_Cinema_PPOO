import java.util.*;
/**
 * Classe que representa o cinema.
 */
public class Cinema {
    private String nome;
    private String cep;
    private String cnpj;
    private ArrayList<Guiche> bilheteria;
    private ArrayList<Funcionario> escala;
    private ArrayList<Sessao> sessoes;
    private Fila fila;
    private Estatistica estatistica;
    private static int tempoUltimo;

    /**
     * Construtor da classe Cinema.
     * @param nome - string que representa o nome do cinema
     * @param cep - string que representa o cep do cinema
     * @param cnpj - string que representa cnpj do cinema
     */
    public Cinema(String nome, String cep, String cnpj){
        this.nome=nome;
        this.cep=cep;
        this.cnpj=cnpj;
        escala=new ArrayList<Funcionario>();
        bilheteria=new ArrayList<Guiche>();
        sessoes=new ArrayList<Sessao>();
        fila = Fila.getInstance();
        this.estatistica = Estatistica.getInstance();
    }

    /**
     * Getter para o nome
     * @return String - o nome do cinema
     */
    public String getNome(){
        return nome;
    }
    /**
     * Getter para o cep
     * @return String - o cep do cinema
     */
    public String getCep(){
        return cep;
    }
    /**
     * Getter para o cnpj
     * @return String - o cnpj do cinema
     */
    public String getCnpj(){
        return cnpj;
    }
    /**
     * Método responsável por adicionar uma sessão ao cinema.
     * @param sessao - um objeto do tipo Sessao
     */
    public void adicionarSessao(Sessao sessao){
        sessoes.add(sessao);
    }
    /**
     * Método responsável por adicionar um cliente na fila
     * @param cliente - um objeto do tipo Cliente
     */
    public void adicionarNaFila(Cliente cliente){
        fila.adicionarNaFila(cliente);
    }
    /**
     * Método responsável por retirar um cliente da fila.
     * @param sessaoAtual - a sessão no qual o cliente vai entrar
     * @return Cliente - cliente removido da fila.
     */
    public Cliente retirarDaFila(Sessao sessaoAtual, Guiche guiche){
        Cliente removido;
        if(sessaoAtual.getQuantIngresso()>0 && sessaoAtual.getEstado().equals("Aberta")){
            removido = fila.removerDaFila();
            sessaoAtual.venderIngresso();
        }
        else{
            fecharSessao(sessaoAtual);
            getSessaoAtual().venderIngresso();
            removido = fila.removerDaFila();
        }
        guiche.setAtendendo(atendimento(removido, guiche));
        if (fila.getTamanhoFila() == 0) {
            tempoUltimo = removido.getTempoNaFila()+atendimento(removido, guiche);
        }
        return removido;
    }
    /**
     * Método responsável por abrir um guiche no cinema.
     */
    public void abrirGuiche(){
        int i=0;
        while(i<quantGuiches()-1 && bilheteria.get(i).getFuncionario()!=null){
            i++;
        }
        int j=0;
        while(j<escala.size()-1 && escala.get(j).getEstado().equals("trabalhando")){
            j++;
        }
        bilheteria.get(i).setFuncionario(escala.get(j));
        escala.get(j).setEstado("trabalhando");
    }
    /**
     * Método responsável por fechar uma sessão
     * @param sessao - um objeto do tipo Sessao
     */
    public void fecharSessao(Sessao sessao){
        sessao.fecharSessao();
    }
    /**
     * Método responsável por atender um cliente.
     * @param cliente - objeto do tipo Cliente
     * @param guiche - objeto do tipo Guiche
     * @return int - tempo levado para atender o cliente.
     */
    public int atendimento(Cliente cliente, Guiche guiche){
        return cliente.getTempoDeAtencao()*guiche.tempoAtendimento();
    }
    /**
     * Getter da sessão atual.
     * @return  Sessao - sessão atual.
     */
    public Sessao getSessaoAtual(){
        int i=0;
        while(sessoes.get(i).getEstado().equals("Fechada")){
            i++;
        }
        return sessoes.get(i);
    }
    /**
     * Método responsável por adicionar um funcionário.
     * @param funcionario - objeto do tipo Funcionario
     */
    public void adicionarFuncionario(Funcionario funcionario){
        escala.add(funcionario);
    }
    /**
     * Método responsável por adicionar um guiche.
     * @param guiche - objeto do tipo Guiche.
     */
    public void adicionarGuiche(Guiche guiche){
        bilheteria.add(guiche);
    }
    /**
     * Método responsável por calcular o valor que o cliente deve pagar.
     * @param sessao - objeto do tipo Sessao
     * @param cliente - objeto do tipo Ciente 
     * @return double - valor que o cliente deve pagar.
     */
    public double valorAPagar(Sessao sessao, Cliente cliente){
        return sessao.valorAPagar(cliente);
    }
    /**
     * Método que retorna o guiche em determinada posição do ArrayList
     * @param i - inteiro que representa o índice do ArrayList
     * @return Guiche - o guiche que está na posição "i" do ArrayList
     */
    public Guiche guicheAtual(int i){
        return bilheteria.get(i);
    }
    /**
     * Método responsável por retornar a quantidade de guiches.
     * @return int - quantidade de guiches.
     */
    public int quantGuiches(){
        return bilheteria.size();
    }
    /**
     * Getter da quantidade de clientes que estão na fila.
     * @return int - quantidade de clientes na fila
     */
    public int getQuantCliente(){
        return fila.getTamanhoFila();
    }
    public void adicionarTempo(){
        fila.adicionarTempo();
    }
    public String gerarEstatistica() {
        String msg = "Tempo médio por funcionário:\n";
        for (Funcionario funcionario : escala) {
            estatistica.adicionarFuncionario(funcionario);
        }
        HashMap<Funcionario, Double> estatistic = estatistica.getEstatisticaFuncionario();
        Set<Funcionario> funcionarios = estatistic.keySet();
        for (Funcionario funcionario : funcionarios) {
            msg += funcionario.getNome()+' ';
            msg += estatistic.get(funcionario)+"\n";
        }
        msg += "Média geral: "+estatistica.mediaGeral();
        msg += "\n\nMaior tempo de espera na fila: "+tempoUltimo;
        return msg;
    }
}
