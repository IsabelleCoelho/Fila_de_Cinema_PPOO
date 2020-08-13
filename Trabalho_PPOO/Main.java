public class Main {
    public void atendimento(){
        Cinema cinema = new Cinema("pao","13","13");
        Cliente cliente = new Cliente("vitu", 12, "123", 3, 0, 0);
        Sessao sessao1 = new Sessao("2", "Aviador", "sala1", "Matine", 1, 15.0);
        Estudante cliente2 = new Estudante("Rafael", 13, "1234", "22");
        cinema.adicionarNaFila(cliente);
        cinema.adicionarNaFila(cliente2);
        cinema.abrirSessao(sessao1);
        Guiche guiche1 = new Guiche();
        Guiche guiche2 = new Guiche();
        Funcionario funcionario1 = new Funcionario("Renato", 13, "123", 123, "13:45", 4);
        Funcionario funcionario2 = new Funcionario("Isabelle", 14, "1443", 1234, "12:32", 3);
        cinema.abrirGuiche(guiche1, funcionario1);
        cinema.abrirGuiche(guiche2, funcionario2);
        int atendGuiche1 = 0;
        int atendGuiche2 = 0;
        for(int i=0; i < 13; i++){
            if(atendGuiche1==0 || atendGuiche2==0){
                if(guiche1.getFuncionario() != null && atendGuiche1 == 0){
                    atendGuiche1 = cinema.atendimento(cliente, guiche1);
                }
                else{
                    atendGuiche2 = cinema.atendimento(cliente2, guiche2);
                }
            }
            else{
                atendGuiche1--;
                atendGuiche2--;
            }
        }
    }
}
