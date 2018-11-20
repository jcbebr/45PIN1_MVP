package view;

import control.Files;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author José Carlos
 */
public class LoginFrame extends JFrame {

    private JPanel mainPanel;

    private JLabel jlUser;
    private JLabel jlPassword;
    private JLabel jlRegKey;
    private JLabel jlRegUser;
    private JLabel jlRegPassword;

    private JTextField jtUser;
    private JPasswordField jtPassword;
    private JTextField jtRegKey;
    private JTextField jtRegUser;
    private JPasswordField jtRegPassword;

    private JButton jbLogin;
    private JButton jbRegister;
    private JButton jbConfirm;

    public LoginFrame() {
        super();
        super.setTitle("Login");
        super.setVisible(true);
        super.setSize(new Dimension(235, 280));
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        addComponents();
        addListeners();
        setRegisterEnabled();
    }

    private void initComponents() {
        mainPanel = new JPanel(null);
        super.setContentPane(mainPanel);

        jlUser = new JLabel("User:");
        jlPassword = new JLabel("Password:");
        jlRegKey = new JLabel("Key:");
        jlRegUser = new JLabel("User:");
        jlRegPassword = new JLabel("Password:");

        jtUser = new JTextField();
        jtPassword = new JPasswordField();
        jtRegKey = new JTextField();
        jtRegUser = new JTextField();
        jtRegPassword = new JPasswordField();

        jbLogin = new JButton("Login");
        jbRegister = new JButton("Register");
        jbConfirm = new JButton("Confirm");

    }

    private void addComponents() {

        Dimension dimJL = new Dimension(70, 22);
        Dimension dimJT = new Dimension(130, 22);

        mainPanel.add(jlUser);
        jlUser.setSize(dimJL);
        jlUser.setLocation(10, 10);

        mainPanel.add(jtUser);
        jtUser.setSize(dimJT);
        jtUser.setLocation(90, 10);

        mainPanel.add(jlPassword);
        jlPassword.setSize(dimJL);
        jlPassword.setLocation(10, 40);

        mainPanel.add(jtPassword);
        jtPassword.setSize(dimJT);
        jtPassword.setLocation(90, 40);

        mainPanel.add(jbLogin);
        jbLogin.setSize(210, 22);
        jbLogin.setLocation(10, 70);

        mainPanel.add(jbRegister);
        jbRegister.setSize(210, 22);
        jbRegister.setLocation(10, 100);

        mainPanel.add(jlRegKey);
        jlRegKey.setSize(dimJL);
        jlRegKey.setLocation(10, 130);

        mainPanel.add(jtRegKey);
        jtRegKey.setSize(dimJT);
        jtRegKey.setLocation(90, 130);

        mainPanel.add(jlRegUser);
        jlRegUser.setSize(dimJL);
        jlRegUser.setLocation(10, 160);

        mainPanel.add(jtRegUser);
        jtRegUser.setSize(dimJT);
        jtRegUser.setLocation(90, 160);

        mainPanel.add(jlRegPassword);
        jlRegPassword.setSize(dimJL);
        jlRegPassword.setLocation(10, 190);
        jlRegPassword.setEnabled(false);

        mainPanel.add(jtRegPassword);
        jtRegPassword.setSize(dimJT);
        jtRegPassword.setLocation(90, 190);

        mainPanel.add(jbConfirm);
        jbConfirm.setSize(210, 22);
        jbConfirm.setLocation(10, 220);

    }

    private void setLoginEnabled() {
        boolean check = true;
        if (jbLogin.isEnabled()) {
            check = false;
        }
        jlUser.setEnabled(check);
        jtUser.setEnabled(check);
        jlPassword.setEnabled(check);
        jtPassword.setEnabled(check);
        jbLogin.setEnabled(check);
        jtUser.setText("");
        jtPassword.setText("");
    }

    private void setRegisterEnabled() {
        boolean check = true;
        if (jbConfirm.isEnabled()) {
            check = false;
        }
        jlRegKey.setEnabled(check);
        jtRegKey.setEnabled(check);
        jlRegUser.setEnabled(check);
        jtRegUser.setEnabled(check);
        jtRegPassword.setEnabled(check);
        jbConfirm.setEnabled(check);
        jtRegKey.setText("");
        jtRegPassword.setText("");
        jtRegUser.setText("");
    }

    private void addListeners() {

        jbLogin.addMouseListener(new ClickListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Files.doLogin(jtUser.getText(), jtPassword.getText())) {
                    MainFrame main = new MainFrame();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Informações incorretas", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        jbRegister.addMouseListener(new ClickListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setLoginEnabled();
                setRegisterEnabled();
            }
        });

        jbConfirm.addMouseListener(new ClickListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //SE INFORMACOES CORRETAS LIMPA CAMPOS E EXECUTA COMANDOS
                if (Files.doRegister(jtRegKey.getText(), jtRegUser.getText(), jtRegPassword.getText())) {
                    setLoginEnabled();
                    setRegisterEnabled();
                } else {
                    JOptionPane.showMessageDialog(null, "Chave incorreta ou já cadastrada", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

}
