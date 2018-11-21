package view;

import view.frames.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Classe que define o menu principal para a aplicação
 *
 * @author José Carlos, Bruno Galeazzi Rech
 * @since 10/11/2018
 * @version 1.0
 */
public class MainMenu extends JMenuBar {

    private JMenu menuRegister;
    private JMenuItem itRegTeacher;
    private JMenuItem itRegChageOwnData;

    private JMenu menuOperations;
    private JMenuItem itOpeGenPTI;
    private JMenuItem itOpeSearch;

    private final MainFrame frame;

    public MainMenu(MainFrame frame) {
        super();
        this.frame = frame;

        initComponents();
        bulidMenu();
        addListeners();
    }

    private void initComponents() {
        menuRegister = new JMenu("Dados");
        menuOperations = new JMenu("Operações");

        itRegTeacher = new JMenuItem("Cadastro de Professores");
        itRegChageOwnData = new JMenuItem("Alteração de dados Próprios");
        itOpeSearch = new JMenuItem("Buscar Professores");
        itOpeGenPTI = new JMenuItem("Gerar PTI's");
    }

    private void bulidMenu() {
        menuRegister.add(itRegTeacher);
        menuRegister.add(itRegChageOwnData);
        menuOperations.add(itOpeSearch);
        menuOperations.add(itOpeGenPTI);

        super.add(menuRegister);
        super.add(menuOperations);
    }

    private void addListeners() {

        itRegTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.changeJPanel(0);
            }
        });

        itRegChageOwnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.changeJPanel(1);
            }
        });

        itOpeSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.changeJPanel(2);
            }
        });

        itOpeGenPTI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.changeJPanel(3);
            }
        });

    }

}
