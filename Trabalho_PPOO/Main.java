public class Main {
    public static void main(String[] args){
        Cinema cinema = new Cinema("pao","13","13");
        Sessao sessao1 = new Sessao("2", "Aviador", "sala1", "Matine", 4, 15.0);
        Sessao sessao2 = new Sessao("3", "Avenger", "sala2", "Matine", 6, 15.0);
        cinema.adicionarSessao(sessao1);
        cinema.adicionarSessao(sessao2);
        Cliente cliente = new Cliente("RAFAEL1", 12, "123", 3, 0, 0);
        Estudante cliente2 = new Estudante("RAFAEL2", 13, "1234", "22");
        Cliente cliente3 = new Cliente("RAFAEL3", 14, "12314", 1, 0, 0);
        Cliente cliente4 = new Cliente("RAFAEL4", 12, "123", 3, 0, 0);
        Estudante cliente5 = new Estudante("RAFAEL5", 13, "1234", "22");
        Cliente cliente6 = new Cliente("RAFAEL6", 14, "12314", 1, 0, 0);
        Preferencial cliente7 = new Preferencial("RAFAEL7", 14, "12314", 1, "cadeirante");
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
        int atendGuiche1 = 0;
        int atendGuiche2 = 0;
        Cliente atual;
        Cliente atual2;
        for(int i=0; i < 20; i++){
            if(atendGuiche1==0){
                if(guiche1.getFuncionario() != null && atendGuiche1 == 0){
                    atual=cinema.retirarDaFila(cinema.getSessaoAtual());
                    atendGuiche1 = cinema.atendimento(atual, guiche1);
                    System.out.println(atual.getNome());
                }
            }
            if(atendGuiche2==0){
                if(guiche2.getFuncionario() != null && atendGuiche2 == 0){
                    atual2=cinema.retirarDaFila(cinema.getSessaoAtual());
                    atendGuiche2 = cinema.atendimento(atual2, guiche2);
                    System.out.println(atual2.getNome());
                }
            }
            atendGuiche1--;
            atendGuiche2--;
        }    
    }
}
