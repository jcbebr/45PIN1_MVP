package view.panels;

import javax.swing.JOptionPane;

/**
 *
 * @author José Carlos
 */
public class SearchPanel extends MenuPanel {

    public SearchPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tf_nome = new javax.swing.JTextField();
        Tf_centro = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();

        jLabel1.setText("Nome:");

        jLabel2.setText("Centro:");

        Tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_nomeActionPerformed(evt);
            }
        });

        Tf_centro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_centroActionPerformed(evt);
            }
        });

        btn_search.setText("Procurar");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Tf_centro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Tf_nome, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tf_centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btn_search)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_nomeActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        long pos = control.TeacherFile.findTeacher(Tf_nome.getText(), Tf_centro.getText());
        if (pos == -1){
            JOptionPane.showMessageDialog(null, "Professor não encontrado!", "Nada encontrado", JOptionPane.ERROR_MESSAGE);
        }else{
            cleanData();
            control.TeacherFile.readPos(pos);//pegar os valores e jogar em alguma tela
            /*
            pegar a pos do professor e pegar os dados dele e preencher na outra tela
            pegar o nome e retirar o array de atividades dele e preencher na outra tela
            */
                
        }
        cleanData();
        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void Tf_centroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_centroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_centroActionPerformed

    @Override
    public void cleanData() {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tf_centro;
    private javax.swing.JTextField Tf_nome;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
