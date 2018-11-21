/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ActivitiesTypes;
import model.Activity;

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

    private static String readString(RandomAccessFile arquivo, int chars) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars; i++) {
            sb.append(arquivo.readChar());
        }
        return sb.toString().trim();
    }

    public static void writeActivities(String nomeProfessor, String nomeAtividade, String horas, String tipo) {
        RandomAccessFile arquivo = activityFile();
        try {
            arquivo.writeChars(String.format("%1$35s", nomeProfessor));
            arquivo.writeChars(String.format("%1$35s", nomeAtividade));
            arquivo.writeChars(String.format("%1$5s", horas));
            arquivo.writeChars(String.format("%1$30s", tipo));
        } catch (Exception e) {
        }

    }

    public static void readActivities() {
        // 210 bytes
        RandomAccessFile arquivo = activityFile();
        try {
            arquivo.seek(0);
            double aux = arquivo.length() / 210;
            for (double i = 0; i < aux; i++) {
                String nome, atividade, tipo;
                String horas;
                nome = readString(arquivo, 35);
                atividade = readString(arquivo, 35);
                horas = readString(arquivo, 5);
                tipo = readString(arquivo, 30);

                System.out.println(nome + " " + atividade + " " + horas + " " + tipo);
            }
        } catch (Exception e) {

        }
    }

    public static ArrayList findActivities(String nomeprofessor) {
        RandomAccessFile arquivo = activityFile();
        ArrayList atividades = new ArrayList();
        try {
            long indice = 0;
            double aux = arquivo.length() / 210;
            for (double i = 0; i < aux; i++) {
                arquivo.seek(indice + 70);
                String auxNome;
                auxNome = readString(arquivo, 35);
                if (auxNome.equalsIgnoreCase(nomeprofessor)) {
                    String atividade, tipo;
                    String horas;
                    atividade = readString(arquivo, 35);
                    horas = readString(arquivo, 5);
                    tipo = readString(arquivo, 30);
                    model.Activity ativ = new Activity(atividade, tipo, horas);
                    atividades.add(ativ);
                }
                indice += 210;
            }
        } catch (Exception e) {
        }
        return atividades;
    }

}
