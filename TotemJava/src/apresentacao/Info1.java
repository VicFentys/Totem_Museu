package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;

public class Info1 extends javax.swing.JDialog {
    
    public Info1(java.awt.Frame parent, boolean modal) {
        super(parent, false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        btnProxima = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Nasalization Rg", 0, 30)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 119, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt1.setText("RESPOSTA");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 330, -1));

        txt3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt3.setForeground(new java.awt.Color(239, 236, 236));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("<html>\n<div style= 'text-align: center'>\n<p>Qual rover explorador foi o primeiro a<br/>\n<p style='margin-top: 10'>aterrissar em Marte?\n");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, -1));

        txt4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(239, 236, 236));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setText("<html>\n<div style= 'text-align: center'>\n<p>Composta por um módulo de pouso (Lander), mais tarde batizado de\n<p style='margin-top: 10'>\"Carl Sagan Memorial Station\", e um pequeno robô, chamado <b>Sojourner,</b>\n<p style='margin-top: 10'>a Pathfinder foi lançada em 4 de dezembro de 1996,\n<p style='margin-top: 10'>e chegou em Marte sete meses depois, em 4 de julho de 1997.");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 800, -1));

        txt5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt5.setForeground(new java.awt.Color(239, 236, 236));
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5.setText("<html>\n<div style= 'text-align: center'>\n<p>Equipado com seis rodas, duas câmeras e alguns instrumentos científicos,\n<p style='margin-top: 10'>o <b>Sojourner</b> media 65 cm de comprimento, 48 cm de largura, 30 cm de\n<p style='margin-top: 10'>altura e pesava 11,5 Kg.");
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 800, -1));

        btnProxima.setBackground(new java.awt.Color(224, 77, 1));
        btnProxima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/direita.png"))); // NOI18N
        btnProxima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnProxima.setBorderPainted(false);
        btnProxima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProxima.setFocusPainted(false);
        btnProxima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProximaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProximaMouseExited(evt);
            }
        });
        btnProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaActionPerformed(evt);
            }
        });
        getContentPane().add(btnProxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 160, 80));

        background.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(800, 600));
        background.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProximaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximaMouseEntered
        btnProxima.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnProximaMouseEntered

    private void btnProximaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximaMouseExited
        btnProxima.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnProximaMouseExited

    private void btnProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaActionPerformed
        new Pergunta2(null, true).setVisible(true); // Chama o próximo JDialog
        this.dispose();
    }//GEN-LAST:event_btnProximaActionPerformed
  
    public static void main(String args[]) {
        
        FlatArcDarkOrangeIJTheme.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Info1 dialog = new Info1(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnProxima;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables
}
