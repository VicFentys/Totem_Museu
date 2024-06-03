package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;

public class Erro2 extends javax.swing.JDialog {

    public Erro2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        marte = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RESPOSTA INVÁLIDA");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(320, 150));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(239, 236, 236));
        txt1.setText("<html> <div style= 'text-align: center'> <p>Digite um valor <br/> <p style='margin-top: 10'>válido");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rover.png"))); // NOI18N
        getContentPane().add(marte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        btnOk.setBackground(new java.awt.Color(224, 77, 1));
        btnOk.setFont(new java.awt.Font("Nasalization Rg", 1, 18)); // NOI18N
        btnOk.setForeground(new java.awt.Color(37, 29, 58));
        btnOk.setText("OK");
        btnOk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnOk.setBorderPainted(false);
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.setFocusPainted(false);
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOkMouseExited(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 70, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(320, 150));
        background.setMinimumSize(new java.awt.Dimension(320, 150));
        background.setPreferredSize(new java.awt.Dimension(320, 150));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseEntered
        btnOk.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnOkMouseEntered

    private void btnOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseExited
        btnOk.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnOkMouseExited

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    public static void main(String args[]) {

        FlatArcDarkOrangeIJTheme.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Erro2 dialog = new Erro2(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel marte;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
