package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.LoginFrame;

/**
 *
 * @author José Carlos
 */
public class Main {

    public static void main(String[] args) {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException exc) {
            exc.printStackTrace();
        }
        //MainFrame main = new MainFrame();
        
        LoginFrame lf = new LoginFrame();
        
    }
    
}
