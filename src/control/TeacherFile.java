/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @since 21/11/2018
 * @version
 * @author Bruno Galeazzi Rech
 */
public class TeacherFile {

    private static RandomAccessFile teacherFile() {

        String diretorio = "arquivos";
        String endereco = diretorio + "\\teacher.dat";

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

    public static void writeTeacher(String nome, String centro, String classe, String regime, String titulacao, String departamento,
            String categoria) {
        RandomAccessFile arquivo = teacherFile();
        try {
            arquivo.seek(teacherFile().length());
            arquivo.writeChars(String.format("%1$35s", nome));
            arquivo.writeChars(String.format("%1$10s", centro));
            arquivo.writeChars(String.format("%1$15s", classe));
            arquivo.writeChars(String.format("%1$30s", regime));
            arquivo.writeChars(String.format("%1$10s", titulacao));
            arquivo.writeChars(String.format("%1$4s", departamento));
            arquivo.writeChars(String.format("%1$10s", categoria));

            readTeachers();
        } catch (Exception e) {
        }

    }

    public static void readTeachers() {
        //228 bytes
        RandomAccessFile arquivo = teacherFile();
        try {
            arquivo.seek(0);
            double aux = arquivo.length() / 228;
            for (double i = 0; i < aux; i++) {
                String nome, centro, classe, regime, titulacao, departamento, categoria;

                nome = readString(arquivo, 35);
                centro = readString(arquivo, 10);
                classe = readString(arquivo, 15);
                regime = readString(arquivo, 30);
                titulacao = readString(arquivo, 10);
                departamento = readString(arquivo, 4);
                categoria = readString(arquivo, 10);

                System.out.println(nome + " " + centro + " " + classe + " " + regime + " " + titulacao + " " + departamento + " " + categoria);
            }
        } catch (Exception e) {

        }

    }

    public static long findTeacher(String nome, String centro) {
        RandomAccessFile arquivo = teacherFile();
        try {
            long indice = 0;
            double aux = arquivo.length() / 228;
            for (double i = 0; i < aux; i++) {
                arquivo.seek(indice);
                String auxNome, auxCentro;
                auxNome = readString(arquivo, 35);
                auxCentro = readString(arquivo, 10);
                if (auxNome.equalsIgnoreCase(nome) && auxCentro.equalsIgnoreCase(centro)) {
                    return indice;
                }
                indice += 228;
            }
        } catch (Exception e) {
        }
        return -1;
    }

    public static void readPos(long pos) {
        String nome, centro, classe, regime, titulacao, departamento, categoria;
        RandomAccessFile arquivo = teacherFile();
        
        try {
            arquivo.seek(pos);
            nome = readString(arquivo, 35);
            centro = readString(arquivo, 10);
            classe = readString(arquivo, 15);
            regime = readString(arquivo, 30);
            titulacao = readString(arquivo, 10);
            departamento = readString(arquivo, 4);
            categoria = readString(arquivo, 10);
        } catch (Exception e) {
        }

    }

}
