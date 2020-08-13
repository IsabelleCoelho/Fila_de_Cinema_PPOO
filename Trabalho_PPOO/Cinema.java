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

    /**
     * Construtor da classe Cinema.
     * @param String nome - nome do cinema
     * @param String cep - cep do cinema
     * @param String cnpj - cnpj do cinema
     */
    public Cinema(String nome, String cep, String cnpj){
        this.nome=nome;
        this.cep=cep;
        this.cnpj=cnpj;
        escala=new ArrayList<Funcionario>();
        bilheteria=new ArrayList<Guiche>();
        sessoes=new ArrayList<Sessao>();
        fila = Fila.getInstance();
    }

    /**
     * Getter para o nome
     * @return String nome - o nome do cinema
     */
    public String getNome(){
        return nome;
    }
    /**
     * Getter para o cep
     * @return String cep - o cep do cinema
     */
    public String getCep(){
        return cep;
    }
    /**
     * Getter para o cnpj
     * @return String cnpj - o cnpj do cinema
     */
    public String getCnpj(){
        return cnpj;
    }

    /**
     * Setter para o nome
     * @param String novoNome - o novo nome do cinema
     */
    public void setNome(String novoNome){
        nome = novoNome;
    }
    /**
     * Setter para o cep
     * @param String novoCep - o novo cep do cinema
     */
    public void setCep(String novoCep){
        cep = novoCep;
    }
    /**
     * Setter para o cnpj
     * @param String novoCnpj - o novo cnpj do cinema
     */
    public void setCnpj(String novoCnpj){
        cnpj = novoCnpj;
    }

    /**
     * Método responsável por adicionar uma sessão ao cinema.
     * @param Sessao sessao - uma sessão do cinema
     */
    public void adicionarSessao(Sessao sessao){
        sessoes.add(sessao);
    }
    /**
     * Método responsável por adicionar um cliente na fila
     * @param Cliente cliente - um cliente para entrar na fila
     */
    public void adicionarNaFila(Cliente cliente){
        fila.adicionarNaFila(cliente);
    }
    /**
     * Método responsável por retirar um cliente da fila
     * @param cliente - um cliente para sair da fila
     * @param sessaoAtual - a sessão no qual o cliente vai entrar
     */
    public Cliente retirarDaFila(Sessao sessaoAtual){
        Cliente removido;
        if(sessaoAtual.getLotacao()>0 && sessaoAtual.getEstado().equals("Aberta")){
            removido = fila.removerDaFila();
            sessaoAtual.venderIngresso();
            sessaoAtual.setLotacao();
        }
        else{
            fecharSessao(sessaoAtual);
            System.out.println(getSessaoAtual().getFilme());
            getSessaoAtual().venderIngresso();
            removido = fila.removerDaFila();
            getSessaoAtual().setLotacao();
        }
        System.out.println(getSessaoAtual().getQuantIngresso());
        return removido;
    }
    /**
     * Método responsável por abrir um guiche no cinema
     * @param guiche - o guiche que será aberto
     * @param funcionario - o funcionário que trabalhará no guiche
     */
    public void abrirGuiche(){
        int i=0;
        while(bilheteria.get(i).getFuncionario()!=null){
            i++;
        }
        int j=0;
        while(escala.get(j).getEstado().equals("trabalhando")){
            j++;
        }
        bilheteria.get(i).setFuncionario(escala.get(j));
        escala.get(j).setEstado("trabalhando");
    }
    /**
     * Método responsável por fechar uma sessão
     * @param sessao - a sessão que será fechada
     */
    public void fecharSessao(Sessao sessao){
        sessao.fecharSessao();
    }
    /**
     * Método responsável por atender um cliente.
     */
    public int atendimento(Cliente cliente, Guiche guiche){
        return cliente.getTempoDeAtencao()*guiche.tempoAtendimento();
    }
    public Sessao getSessaoAtual(){
        int i=0;
        while(sessoes.get(i).getEstado().equals("Fechada")){
            i++;
        }
        return sessoes.get(i);
    }
    public void adicionarFuncionario(Funcionario funcionario){
        escala.add(funcionario);
    }
    public void adicionarGuiche(Guiche guiche){
        bilheteria.add(guiche);
    }
}
