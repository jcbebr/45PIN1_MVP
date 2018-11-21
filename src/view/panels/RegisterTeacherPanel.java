package view.panels;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Activitie;
import model.ActivitiesTypes;
import model.Category;
import model.Center;
import model.Clas;
import model.Departament;
import model.Teacher;
import model.Titulation;
import view.frames.MainFrame;

/**
 *
 * @author José Carlos
 */
public class RegisterTeacherPanel extends MenuPanel {

    private final MainFrame FRAME;
    private Teacher teacher;

    public RegisterTeacherPanel(MainFrame frame) {
        this.FRAME = frame;
        this.teacher = new Teacher();
        initComponents();

        setActivitiesEnabled();

        Combo_centro.setModel(new javax.swing.DefaultComboBoxModel<>(Center.getStringVetor()));
        Combo_classe.setModel(new javax.swing.DefaultComboBoxModel<>(Clas.getStringVetor()));
        Combo_titulacao.setModel(new javax.swing.DefaultComboBoxModel<>(Titulation.getStringVetor()));
        Combo_departamento.setModel(new javax.swing.DefaultComboBoxModel<>(Departament.getStringVetor()));
        Combo_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(Category.getStringVetor()));
        Combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(ActivitiesTypes.getStringVetor()));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Tf_regime = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tf_Nome = new javax.swing.JTextField();
        Combo_centro = new javax.swing.JComboBox<>();
        Combo_classe = new javax.swing.JComboBox<>();
        Combo_titulacao = new javax.swing.JComboBox<>();
        Combo_departamento = new javax.swing.JComboBox<>();
        Combo_categoria = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jbActNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>(model);
        jbActEdit = new javax.swing.JButton();
        jbActDelete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Combo_tipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        TF_cargaH = new javax.swing.JTextField();
        TF_nomeAtiv = new javax.swing.JTextField();
        jbActRegister = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbCadTeacher = new javax.swing.JButton();

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Nome:");

        jLabel2.setText("Centro:");

        jLabel3.setText("Classe:");

        jLabel4.setText("Regime:");

        jLabel5.setText("Titulação:");

        jLabel6.setText("Departamento:");

        jLabel7.setText("Categoria Funcional:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tf_Nome)
                    .addComponent(Tf_regime)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Combo_centro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Combo_classe, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Combo_titulacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Combo_departamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Combo_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combo_centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combo_classe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tf_regime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combo_titulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combo_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Atividades");

        jbActNew.setText("Nova Atividade");
        jbActNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActNewActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jbActEdit.setText("Editar Atividade");
        jbActEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActEditActionPerformed(evt);
            }
        });

        jbActDelete.setText("Excluir Ativiade");

        jLabel9.setText("Tipo:");

        jLabel10.setText("Nome:");

        jbActRegister.setText("Gravar Atividade");
        jbActRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActRegisterActionPerformed(evt);
            }
        });

        jLabel11.setText("Carga Horária:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_nomeAtiv)
                    .addComponent(jScrollPane1)
                    .addComponent(jbActRegister, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Combo_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_cargaH)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbActNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbActEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbActDelete))
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActNew)
                    .addComponent(jbActEdit)
                    .addComponent(jbActDelete))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_cargaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_nomeAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbActRegister)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbCadTeacher.setText("Cadastrar Professor");
        jbCadTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadTeacherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCadTeacher))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbCadTeacher))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cleanActivities() {
        Combo_tipo.setSelectedIndex(0);
        TF_cargaH.setText("");
        TF_nomeAtiv.setText("");
    }

    @Override
    public void cleanData() {
        Tf_Nome.setText("");
        Tf_regime.setText("");
        model.removeAllElements();
        cleanActivities();
    }

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        cleanData();
        FRAME.goToMainScreen();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbCadTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadTeacherActionPerformed
        control.TeacherFile.writeTeacher(Tf_Nome.getText(), Combo_centro.getSelectedItem().toString(), Combo_classe.getSelectedItem().toString(), Tf_regime.getText(), Combo_titulacao.getSelectedItem().toString(),
                Combo_departamento.getSelectedItem().toString(), Combo_categoria.getSelectedItem().toString());
        cleanData();
        JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbCadTeacherActionPerformed

    private void setActivitiesEnabled() {
        boolean check = true;
        if (jbActRegister.isEnabled()) {
            check = false;
        }
        jLabel9.setEnabled(check);
        jLabel10.setEnabled(check);
        jLabel11.setEnabled(check);
        Combo_tipo.setEnabled(check);
        TF_cargaH.setEnabled(check);
        TF_nomeAtiv.setEnabled(check);
        jbActRegister.setEnabled(check);
    }

    private void jbActNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActNewActionPerformed

        setActivitiesEnabled();
    }//GEN-LAST:event_jbActNewActionPerformed

    private void jbActEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActEditActionPerformed

        jList1.getSelectedIndex();

        setActivitiesEnabled();
    }//GEN-LAST:event_jbActEditActionPerformed

    private void jbActRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActRegisterActionPerformed

        try {
            String name = TF_nomeAtiv.getText();
            float hours = Float.parseFloat(TF_cargaH.getText());
            ActivitiesTypes activitieType = ActivitiesTypes.get(Combo_tipo.getSelectedIndex());
            Activitie activitie = new Activitie(name, activitieType, hours);

            ArrayList activities = teacher.getActivities();
            activities.add(activitie);

            model.addElement(activitie.getType().toString() + " - " + activitie.getName());

        } catch (NumberFormatException numberFormatException) {
            System.out.println(numberFormatException);
        }

        System.out.println(teacher.toString());

    }//GEN-LAST:event_jbActRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_categoria;
    private javax.swing.JComboBox<String> Combo_centro;
    private javax.swing.JComboBox<String> Combo_classe;
    private javax.swing.JComboBox<String> Combo_departamento;
    private javax.swing.JComboBox<String> Combo_tipo;
    private javax.swing.JComboBox<String> Combo_titulacao;
    private javax.swing.JTextField TF_cargaH;
    private javax.swing.JTextField TF_nomeAtiv;
    private javax.swing.JTextField Tf_Nome;
    private javax.swing.JTextField Tf_regime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private DefaultListModel<String> model = new DefaultListModel<>();
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbActDelete;
    private javax.swing.JButton jbActEdit;
    private javax.swing.JButton jbActNew;
    private javax.swing.JButton jbActRegister;
    private javax.swing.JButton jbCadTeacher;
    private javax.swing.JButton jbCancelar;
    // End of variables declaration//GEN-END:variables
}
