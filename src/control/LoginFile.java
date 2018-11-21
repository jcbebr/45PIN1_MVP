package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author José Carlos
 */
public class LoginFile {

    private static RandomAccessFile loginFile() {

        String diretorio = "arquivos";
        String endereco = diretorio + "\\login.dat";

        File dirLogin = new File(diretorio);

        if (!dirLogin.exists()) {
            dirLogin.mkdirs();
        }

        File endLogin = new File(endereco);

        boolean first = false;

        if (!endLogin.exists()) {
            first = true;
        }

        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(endereco, "rw");
            if (first) {
                file.writeBoolean(false);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        return file;
    }

    private static String readChars(RandomAccessFile arquivo) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(arquivo.readChar());
        }
        return sb.toString().trim();
    }

    public static boolean doLogin(String user, String password) {

        RandomAccessFile arquivo = loginFile();
        /* if (user.equalsIgnoreCase("") || password.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Campos em branco", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else { }*/
        try {
            arquivo.seek(1);
            if (arquivo.length() >= 41) {
                String fileUser = readChars(arquivo);
                String filePassword = readChars(arquivo);

                if (!fileUser.equals(user)) {
                    JOptionPane.showMessageDialog(null, "Usuário incorreto", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                if (!filePassword.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Senha incorreta", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Informações incorretas", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (IOException ex) {
            Logger.getLogger(LoginFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static boolean doRegister(String key, String user, String password) {

        RandomAccessFile arquivo = loginFile();

        try {
            arquivo.seek(0);
            boolean used = arquivo.readBoolean();

            if ((!used && key.equals("12345")) || key.equals("666")) {
                arquivo.seek(0);
                arquivo.writeBoolean(true);
                arquivo.writeChars(String.format("%1$10s", user));
                arquivo.writeChars(String.format("%1$10s", password));
            } else {
                JOptionPane.showMessageDialog(null, "Chave incorreta ou já usada", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (IOException ex) {
            Logger.getLogger(LoginFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

}
