package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 * Tela principal do sistema
 *
 * @author José Carlos, Felipe Rohr, Gabriela Rodrigues, Gabriel Felipe
 * @since 19/04/2018
 * @version 1.0
 */
public class MainFrame extends JFrame {

    private static Dimension mainDimension;
    private JPanel mainPanel;
    private Container contentPane;
    private JMenuBar mainMenu;

    private JPanel[] jps;

    /**
     * Construtor da classe Frame Sistema.
     */
    public MainFrame() {
        super();

        mainDimension = new Dimension(750, 550); // imagem 665 , 545
        initComponents();

        super.setTitle("Sistema gerenciador do cartão fidelidade");
        super.setSize(mainDimension);
        super.setVisible(true);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Método responsável por criar o DesktopPanel da aplicação, onde serão inseridas as telas internas da aplicação
     */
    private void initComponents() {
        //Instancia o painel princpal da aplicação, onde as telas internas serão exibidas
        mainPanel = new JPanel(null);
        mainPanel.setSize(mainDimension);
        mainPanel.setBackground(Color.GREEN);

        //Pega o painel da JFrame
        contentPane = super.getContentPane();
        contentPane.setBackground(Color.BLACK);
        //Adiciona o desktopPanel no container da JFrame
        contentPane.add(mainPanel, BorderLayout.CENTER);
        //adiciona a barra de menu na tela principal
        mainMenu = new MainMenu(this);
        super.setJMenuBar(mainMenu);

        jps = new JPanel[4];

        jps[0] = new RegisterTeacherPanel(this);
        //jps[0].setBackground(Color.red);
        mainPanel.add(jps[0]);
        jps[0].setSize(mainDimension);
        jps[0].setLocation(0, 0);
        jps[0].setVisible(false);
        jps[0].setEnabled(false);

        jps[1] = new JPanel();
        jps[1].setBackground(Color.ORANGE);
        mainPanel.add(jps[1]);
        jps[1].setSize(mainDimension);
        jps[1].setLocation(0, 0);
        jps[1].setVisible(false);
        jps[1].setEnabled(false);

        jps[2] = new JPanel();
        jps[2].setBackground(Color.DARK_GRAY);
        mainPanel.add(jps[2]);
        jps[2].setSize(mainDimension);
        jps[2].setLocation(0, 0);
        jps[2].setVisible(false);
        jps[2].setEnabled(false);

        jps[3] = new JPanel();
        jps[3].setBackground(Color.BLACK);
        mainPanel.add(jps[3]);
        jps[3].setSize(mainDimension);
        jps[3].setLocation(0, 0);
        jps[3].setVisible(false);
        jps[3].setEnabled(false);

    }

    public void goToMainScreen() {
        for (int j = 0; j < jps.length; j++) {
            jps[j].setVisible(false);
            jps[j].setEnabled(false);
        }
    }

    public void changeJPanel(int i) {
        goToMainScreen();
        jps[i].setVisible(true);
        jps[i].setEnabled(true);
    }

}
