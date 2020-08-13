//import org.jfree.chart.*;
/**
 * Classe principal do projeto.
 */
public class Main {
    public static void main(String[] args){
        Cinema cinema = new Cinema("pao","13","13");
        Evento evento1 = new Matine();
        Evento evento2 = new Regular();
        Evento evento3 = new Estreia();
        Sessao sessao1 = new Sessao("2", "Aviador", "sala1", evento1, 4);
        Sessao sessao2 = new Sessao("3", "Avenger", "sala2", evento2, 6);
        Sessao sessao3 = new Sessao("4", "cinderela", "sala3", evento3, 3);
        cinema.adicionarSessao(sessao1);
        cinema.adicionarSessao(sessao2);
        cinema.adicionarSessao(sessao3);
        Cliente cliente = new Cliente("RAFAEL1", 12, "123");
        Estudante cliente2 = new Estudante("RAFAEL2", 13, "1234", "22");
        Cliente cliente3 = new Cliente("RAFAEL3", 14, "12314");
        Cliente cliente4 = new Cliente("RAFAEL4", 12, "123");
        Estudante cliente5 = new Estudante("RAFAEL5", 13, "1234", "22");
        Cliente cliente6 = new Cliente("RAFAEL6", 14, "12314");
        Preferencial cliente7 = new Preferencial("RAFAEL7", 14, "12314", "cadeirante");
        cinema.adicionarNaFila(cliente);
        cinema.adicionarNaFila(cliente2);
        cinema.adicionarNaFila(cliente3);
        cinema.adicionarNaFila(cliente4);
        cinema.adicionarNaFila(cliente5);
        cinema.adicionarNaFila(cliente6);
        cinema.adicionarNaFila(cliente7);
        Guiche guiche1 = new Guiche();
        Guiche guiche2 = new Guiche();
        Funcionario funcionario1 = new Funcionario("Renato", 13, "123", 123, "13:45", 4);
        Funcionario funcionario2 = new Funcionario("Isabelle", 14, "1443", 1234, "12:32", 3);
        cinema.adicionarFuncionario(funcionario1);
        cinema.adicionarFuncionario(funcionario2);
        cinema.adicionarGuiche(guiche1);
        cinema.adicionarGuiche(guiche2);
        cinema.abrirGuiche();
        cinema.abrirGuiche();
        Cliente atual;
        int atendAtual=1;
        while(atendAtual>0){
            while(cinema.getQuantCliente()>0){
                for (int j = 0; j < cinema.quantGuiches() && cinema.getQuantCliente()>0; j++) {
                    Guiche guicheAtual=cinema.guicheAtual(j);
                    if(guicheAtual.getAtendendo()==0){
                        if(guicheAtual.getFuncionario() != null){
                            atual=cinema.retirarDaFila(cinema.getSessaoAtual(), guicheAtual);
                            System.out.println(atual.getNome());
                            atendAtual = guicheAtual.getAtendendo();
                            System.out.println("AQUI " + atendAtual);
                        }
                    }
                    guicheAtual.atendido();
                }
            }
            System.out.println(atendAtual);
            atendAtual--;
        }
    }
}
