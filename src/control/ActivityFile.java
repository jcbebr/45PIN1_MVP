/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @since 21/11/2018
 * @version
 * @author Bruno Galeazzi Rech
 */
public class ActivityFile {

    private static RandomAccessFile activityFile() {

        String diretorio = "arquivos";
        String endereco = diretorio + "\\activity.dat";

        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(endereco, "rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return file;
    }
}
