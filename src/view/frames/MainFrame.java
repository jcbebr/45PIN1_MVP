package view.frames;

import view.panels.ChangeOwnDataPanel;
import view.panels.RegisterTeacherPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import model.ActivitiesTypes;
import view.MainMenu;
import view.panels.GeneratePTIsPanel;
import view.panels.MenuPanel;
import view.panels.SearchPanel;

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

    private MenuPanel[] menuPanels;

    /**
     * Construtor da classe Frame Sistema.
     */
    public MainFrame() {
        super();

        mainDimension = new Dimension(650, 500); // imagem 665 , 545
        initComponents();

        super.setTitle("Sistema gerenciador de PTIs");
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
        //mainPanel.setBackground(Color.GREEN);

        //Pega o painel da JFrame
        contentPane = super.getContentPane();
        contentPane.setBackground(Color.BLACK);
        //Adiciona o desktopPanel no container da JFrame
        contentPane.add(mainPanel, BorderLayout.CENTER);
        //adiciona a barra de menu na tela principal
        mainMenu = new MainMenu(this);
        super.setJMenuBar(mainMenu);

        menuPanels = new MenuPanel[4];
        initMenuPanel(new RegisterTeacherPanel(this), 0);
        initMenuPanel(new ChangeOwnDataPanel(this), 1);
        initMenuPanel(new SearchPanel(), 2);
        initMenuPanel(new GeneratePTIsPanel(), 3);
        
        

    }

    private void initMenuPanel(MenuPanel jpanel, int i) {
        menuPanels[i] = jpanel;
        //jps[i].setBackground(Color.BLACK);
        mainPanel.add(menuPanels[i]);
        menuPanels[i].setSize(mainDimension);
        menuPanels[i].setLocation(0, 0);
        menuPanels[i].setVisible(false);
        menuPanels[i].setEnabled(false);
    }

    public void goToMainScreen() {
        for (int i = 0; i < menuPanels.length; i++) {
            menuPanels[i].setVisible(false);
            menuPanels[i].setEnabled(false);
            menuPanels[i].cleanData();
        }

    }

    public void changeJPanel(int i) {
        goToMainScreen();
        menuPanels[i].setVisible(true);
        menuPanels[i].setEnabled(true);
    }

}
