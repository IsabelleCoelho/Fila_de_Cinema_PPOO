public class Cliente extends Pessoa{
    private int tempoDeAtencao;
    private int tempoNaFila;
    
    public Cliente(String nome, String idade, String cpf, int tempoDeAtencao, int tempoNaFila){
        super(nome, idade, cpf);
        this.tempoDeAtencao=tempoDeAtencao;
        this.tempoNaFila=tempoNaFila;
    }

    public int getTempoDeAtencao(){
        return tempoDeAtencao;
    }
    public int getTempoNaFila(){
        return tempoNaFila;
    }
}