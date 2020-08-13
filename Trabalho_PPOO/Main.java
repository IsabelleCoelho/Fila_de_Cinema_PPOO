import java.util.*;
/**
 * Classe principal do projeto.
 */
public class Main {
    private static Cinema cinema;
    public static void main(String[] args){
        Arquivo arquivo = new Arquivo();
        try {
            arquivo.ler(cinema);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*Cinema cinema = new Cinema("pao","13","13");
        Guiche guiche1 = new Guiche();
        Guiche guiche2 = new Guiche();
        Guiche guiche3 = new Guiche();
        Guiche guiche4 = new Guiche();
        Guiche guiche5 = new Guiche();
        cinema.adicionarGuiche(guiche1);
        cinema.adicionarGuiche(guiche2);
        cinema.adicionarGuiche(guiche3);
        cinema.abrirGuiche();
        cinema.abrirGuiche();
        cinema.abrirGuiche();
        Evento evento1 = new Matine();
        Evento evento2 = new Regular();
        Evento evento3 = new Estreia();
        Sessao sessao1 = new Sessao("2", "Aviador", "sala1", evento1, 4);
        Sessao sessao2 = new Sessao("3", "Avenger", "sala2", evento2, 6);
        Sessao sessao3 = new Sessao("4", "cinderela", "sala3", evento3, 3);
        Cliente cliente = new Cliente("RAFAEL1", 12, "123");
        Estudante cliente2 = new Estudante("RAFAEL2", 13, "1234", "22");
        Cliente cliente3 = new Cliente("RAFAEL3", 14, "12314");
        Cliente cliente4 = new Cliente("RAFAEL4", 12, "123");
        Estudante cliente5 = new Estudante("RAFAEL5", 13, "1234", "22");
        Cliente cliente6 = new Cliente("RAFAEL6", 14, "12314");
        Preferencial cliente7 = new Preferencial("RAFAEL7", 14, "12314", "cadeirante");
        Funcionario funcionario1 = new Funcionario("Renato", 13, "123", 123, "13:45");
        Gerente funcionario2 = new Gerente("Isabelle", 14, "1443", 1234, "12:32", "setor1");
        Estagiario funcionario3 = new Estagiario("Carlos", 14, "123123", 12, "12:43", "atendimento");
        
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Sessao> sessoes = new ArrayList<Sessao>();
        clientes.add(cliente); //AQUI VAI TER QUE FAZER UM FOR 
                            //INSTANCIANDO O OBJETIVO CLIENTE COM O 
                            //QUE VIER DO ARQUIVO E ADICIONANDO NO 
                            //ARRAY DE CLIENTES CRIADO PARA ADIÇÃO FUTURA
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);
        sessoes.add(sessao1); //AQUI TAMBÉM VAI SER A MESMA LÓGICA DE CIMA SÓ QUE COM SESSÃO
        sessoes.add(sessao2);
        sessoes.add(sessao3);
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2); //AQUI TAMBÉM VAI SER A MESMA LÓGICA SEMPRE FAZENDO
                                        //funcionário atual = new atual(CONSTRUTOR DE FUNCIONÁRIO);
                                        //depois chama o funcionarios.add(atual);
                                        //por fim faremos um for para adicionar tudo em cinema;
        funcionarios.add(funcionario3);
        //OS FORS PRONTOS PARA ADICIONAR CLIENTES, SESSOES, FUNCIONARIOS E ETC
        for (int i = 0; i < 6; i++) {
            cinema.adicionarNaFila(clientes.get(i));
        }
        for (int i = 0; i < 3; i++) {
            cinema.adicionarSessao(sessoes.get(i));
        }
        for (int i = 0; i < 3; i++) {
            cinema.adicionarFuncionario(funcionarios.get(i));
        }*/
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
            System.out.println(atendAtual);
            atendAtual--;
        }
    }
}
