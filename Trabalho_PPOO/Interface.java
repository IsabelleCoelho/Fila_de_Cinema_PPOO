import javax.swing.JFrame;
/**
 * Classe que representa a interface do sistema.
 */
public class Interface {
    private JFrame janela;
    /**
     * Construtor da classe Interface.
     */
    public Interface() {
        this.janela = new JFrame("Cinema");
        this.montarJanela();
    }
    /**
     * Método responsável por montar a janela.
     */
    private void montarJanela() {
        
        this.janela.pack();
    }
    /**
     * Método responsável por exibir a interface.
     */
    public void exibir() {
        this.janela.setVisible(true);
    }
}