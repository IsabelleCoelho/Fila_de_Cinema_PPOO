import java.util.*;
/**
 * Classe principal do projeto.
 */
public class Main {
    private static Cinema cinema;
    public static void main(String[] args){
        Arquivo arquivo = new Arquivo();
        try {
            cinema = arquivo.ler();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Cliente atual;
        int atendAtual=1;
        while(atendAtual>0){
            while(cinema.getQuantCliente()>0){
                for (int j = 0; j < cinema.quantGuiches() && cinema.getQuantCliente()>0; j++) {
                    Guiche guicheAtual=cinema.guicheAtual(j);
                    if(guicheAtual.getAtendendo()==0){
                        if(guicheAtual.getFuncionario() != null){
                            atual=cinema.retirarDaFila(cinema.getSessaoAtual(), guicheAtual);
                            if(atendAtual<guicheAtual.getAtendendo()){
                                atendAtual = guicheAtual.getAtendendo();
                            }
                        }
                    }
                    guicheAtual.atendido();
                }
                cinema.adicionarTempo();
            }
            atendAtual--;
        }
        try {
            arquivo.escrever(cinema.gerarEstatistica());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
