package apresentacao;

import java.awt.*;
import javax.swing.*;

public class Iniciar extends javax.swing.JDialog {

    public Iniciar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("ROG Fonts", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 119, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Museu de Sorocaba - Quiz game");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, -1));

        txt2.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        txt2.setForeground(new java.awt.Color(239, 236, 236));
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Seja Bem-Vindo!");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 800, -1));

        txt3.setFont(new java.awt.Font("OCR A Extended", 0, 20)); // NOI18N
        txt3.setForeground(new java.awt.Color(239, 236, 236));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("<html>\n<div style= 'text-align: center'>\n<p>Clique no botão abaixo para realizar o quiz interativo <br/>\n<p style='margin-top: 20'> baseado em nossa exposição.\n</div>");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 800, -1));

        btnIniciar.setBackground(new java.awt.Color(224, 77, 1));
        btnIniciar.setFont(new java.awt.Font("Nasalization Rg", 1, 40)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(37, 29, 58));
        btnIniciar.setText("Iniciar");
        btnIniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnIniciar.setBorderPainted(false);
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setFocusPainted(false);
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 180, 60));

        btnSair.setBackground(new java.awt.Color(224, 77, 1));
        btnSair.setFont(new java.awt.Font("Nasalization Rg", 1, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(37, 29, 58));
        btnSair.setText("SAIR");
        btnSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSair.setBorderPainted(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusPainted(false);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 100, 30));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\vihug\\OneDrive\\Documentos\\Unip\\APS\\JavaTotem\\src\\main\\java\\imagens\\background.jpg")); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(800, 600));
        background.setMinimumSize(new java.awt.Dimension(800, 600));
        background.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Pergunta1 pergunta = new Pergunta1(null, true);
        pergunta.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnIniciarMouseExited

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnSairMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Iniciar dialog = new Iniciar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables
}
