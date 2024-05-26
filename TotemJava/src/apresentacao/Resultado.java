package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;
import propriedades.*;

public class Resultado extends javax.swing.JDialog {
    
    public Resultado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtContagem.setText(Estaticos.resCorretas + " / 5"); // Configura o valor da label para mostrar a quantidade de respostas corretas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txtContagem = new javax.swing.JLabel();
        btnTabela = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Nasalization Rg", 0, 40)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 119, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("OBRIGADO POR JOGAR!");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, -1));

        txt2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt2.setForeground(new java.awt.Color(239, 236, 236));
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Total de acertos:");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 800, -1));

        txt4.setFont(new java.awt.Font("Nasalization Rg", 0, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(224, 77, 1));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setText("Tabela de Classificação");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 270, -1));

        txtContagem.setFont(new java.awt.Font("Nasalization Rg", 1, 60)); // NOI18N
        txtContagem.setForeground(new java.awt.Color(239, 236, 236));
        txtContagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContagem.setText("0");
        getContentPane().add(txtContagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 800, -1));

        btnTabela.setBackground(new java.awt.Color(224, 77, 1));
        btnTabela.setFont(new java.awt.Font("Nasalization Rg", 1, 40)); // NOI18N
        btnTabela.setForeground(new java.awt.Color(37, 29, 58));
        btnTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ranking.png"))); // NOI18N
        btnTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnTabela.setBorderPainted(false);
        btnTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTabela.setFocusPainted(false);
        btnTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTabelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTabelaMouseExited(evt);
            }
        });
        btnTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabelaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 150, 70));

        background.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        background.setMaximumSize(new java.awt.Dimension(800, 600));
        background.setMinimumSize(new java.awt.Dimension(800, 600));
        background.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTabelaMouseEntered
        btnTabela.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnTabelaMouseEntered

    private void btnTabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTabelaMouseExited
        btnTabela.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnTabelaMouseExited

    private void btnTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabelaActionPerformed
        new Tabela(null, true).setVisible(true); // Chama o próximo JDialog
        this.dispose();
    }//GEN-LAST:event_btnTabelaActionPerformed

    public static void main(String args[]) {
        
        FlatArcDarkOrangeIJTheme.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Resultado dialog = new Resultado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnTabela;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txtContagem;
    // End of variables declaration//GEN-END:variables
}
