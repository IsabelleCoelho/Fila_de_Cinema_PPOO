/**
 * Classe a qual realizará o tratamento dos arquivos do projeto.
 */
import java.io.*;

public class Arquivo {
    public void ler(Cinema cinema){
        try (BufferedReader arquivo = new BufferedReader(new FileReader("dadosEntrada.txt"))) {
            String linha = arquivo.readLine();
            String[] campos = linha.split(",");
            cinema = new Cinema(campos[0], campos[1], campos[2]);
            linha = arquivo.readLine();
            for (int i = 0; i < Integer.parseInt(linha); ++i) {
                linha = arquivo.readLine();
                campos = linha.split(",");
                Evento evento;
                switch (campos[3]) {
                    case "matine":
                        evento = new Matine();
                        break;
                    case "regular":
                        evento = new Regular();
                        break;
                    case "estreia":
                        evento = new Estreia();
                        break;
                    default:
                        throw new Exception("Formato inválido para o cadastro das sessões.");
                        break;
                }
                cinema.adicionarSessao(new Sessao(campos[0], campos[1], campos[2], evento, Integer.parseInt(campos[4])));
            }
            linha = arquivo.readLine();
            for (int i = 0; i < Integer.parseInt(linha); ++i) {
                cinema.adicionarGuiche(new Guiche());
                cinema.abrirGuiche();
            }
            linha = arquivo.readLine();
            for (int i = 0; i < Integer.parseInt(linha); ++i) {
                String tipoFuncionario = arquivo.readLine();
                campos = arquivo.readLine().split(",");
                switch (tipoFuncionario) {
                    case "regular":
                        Funcionario funcionario = new Funcionario(campos[0], Integer.parseInt(campos[1]), campos[2], Integer.parseInt(campos[3]), campos[4]);
                        break;
                    case "gerente":
                        Gerente gerente = new Gerente(campos[0], Integer.parseInt(campos[1]), campos[2], Integer.parseInt(campos[3]), campos[4], campos[5]);
                        break;
                    case "estagiario":
                        Estagiario estagiario = new Estagiario(campos[0], Integer.parseInt(campos[1]), campos[2], Integer.parseInt(campos[3]), campos[4], campos[5]);
                        break;
                    default:
                        throw new Exception("Formato inválido para os funcionários!");
                        break;
                }
            }
            linha = arquivo.readLine();
            for (int i = 0; i < Integer.parseInt(linha); ++i) {
                String tipoCliente = arquivo.readLine();
                campos = arquivo.readLine().split(",");
                switch (tipoCliente) {
                    case "regular":
                        Cliente cliente = new Cliente(campos[0], Integer.parseInt(campos[1]), campos[2]);
                        cinema.adicionarNaFila(cliente);
                        break;
                    case "estudante":
                        Estudante estudante = new Estudante(campos[0], Integer.parseInt(campos[1]), campos[2], campos[3]);
                        cinema.adicionarNaFila(estudante);
                        break;
                    case "preferencial":
                        Preferencial preferencial = new Preferencial(campos[0], Integer.parseInt(campos[1]), campos[2], campos[3]);
                        cinema.adicionarNaFila(preferencial);
                        break;
                    default:
                        throw new Exception("Formato inválido para os clientes!");
                        break;
                }
            }
        } catch(IOException e) {
            throw new Exception(e.getMessage());
        }
    }

    public void escrever() {
        try(FileWriter arquivo = new FileWriter("dadosEntrada.txt")) {
            
        } catch(IOException e) {
            
        }
    }
        try(FileWriter arquivo = new FileWriter("dadosEntrada.txt")) {
            
        } catch(IOException e) {
            
        }
    }
        try(FileWriter arquivo = new FileWriter("dadosEntrada.txt")) {
            
        } catch(IOException e) {
            
        }
    }
        try(FileWriter arquivo = new FileWriter("dadosEntrada.txt")) {
            
        } catch(IOException e) {
            
        }
    }
}