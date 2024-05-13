package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;
import totemjava.*;

public class Pergunta4 extends javax.swing.JDialog {
    
    private TecladoVirtual tecladoVirtual;
    int resCorretas = 0;
    
    public Pergunta4(java.awt.Frame parent, boolean modal, int resCorretaTotal) {
        super(parent, false);
        initComponents();
        txtContagem.setText("" + resCorretaTotal);
        tecladoVirtual = new TecladoVirtual();
        this.resCorretas = resCorretaTotal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txtContagem = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txfResposta = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnTeclado = new javax.swing.JButton();
        marte = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Nasalization Rg", 0, 30)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 119, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt1.setText("QUARTA PERGUNTA");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 350, -1));

        txt2.setFont(new java.awt.Font("Nasalization Rg", 0, 24)); // NOI18N
        txt2.setForeground(new java.awt.Color(224, 77, 1));
        txt2.setText("Acertos:");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        txtContagem.setFont(new java.awt.Font("Nasalization Rg", 1, 24)); // NOI18N
        txtContagem.setForeground(new java.awt.Color(224, 77, 1));
        txtContagem.setText("0");
        getContentPane().add(txtContagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 20, -1));

        txt3.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        txt3.setForeground(new java.awt.Color(239, 236, 236));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, -1));

        txt4.setFont(new java.awt.Font("OCR A Extended", 0, 20)); // NOI18N
        txt4.setForeground(new java.awt.Color(239, 236, 236));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setText("Opção 1    /    Opção 2    /    Opção 3");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 800, -1));

        txfResposta.setBackground(new java.awt.Color(37, 29, 58));
        txfResposta.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        txfResposta.setForeground(new java.awt.Color(140, 140, 140));
        txfResposta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfResposta.setText("Clique no botão de teclado para digitar sua resposta");
        txfResposta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 77, 1)));
        txfResposta.setFocusable(false);
        getContentPane().add(txfResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 600, 40));

        btnEnviar.setBackground(new java.awt.Color(224, 77, 1));
        btnEnviar.setFont(new java.awt.Font("Nasalization Rg", 0, 24)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(37, 29, 58));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnEnviar.setBorderPainted(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setFocusPainted(false);
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 100, 40));

        btnTeclado.setBackground(new java.awt.Color(224, 77, 1));
        btnTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teclado.png"))); // NOI18N
        btnTeclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnTeclado.setBorderPainted(false);
        btnTeclado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTeclado.setFocusPainted(false);
        btnTeclado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTecladoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTecladoMouseExited(evt);
            }
        });
        btnTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecladoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 100, 50));

        marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/marte2.png"))); // NOI18N
        getContentPane().add(marte, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, -1));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        background.setMaximumSize(new java.awt.Dimension(800, 600));
        background.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnTecladoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTecladoMouseEntered
        btnTeclado.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnTecladoMouseEntered

    private void btnTecladoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTecladoMouseExited
        btnTeclado.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnTecladoMouseExited

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
        tecladoVirtual.fechar();
        
        if (txfResposta.getText().trim().equals("OPÇAO 2")){
            resCorretas += 1;
            new Pergunta5(null, true, resCorretas).setVisible(true);
            this.dispose();
        }
        else if (txfResposta.getText().trim().equals("OPÇAO 3") || txfResposta.getText().trim().equals("OPÇAO 1")){
            new Pergunta5(null, true, resCorretas).setVisible(true);
            this.dispose();
        }
        else {
            new Erro(null, true).setVisible(true);
            txfResposta.setFocusable(false);
            txfResposta.setText("Clique no botão de teclado para digitar sua resposta");
            txfResposta.setForeground(new Color(140,140,140));
            txfResposta.setFont(new Font("OCR A Extended", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecladoActionPerformed

        txfResposta.setFocusable(true);
        txfResposta.setText("");
        txfResposta.setForeground(new Color(239,236,236));
        txfResposta.setFont(new Font("OCR A Extended", Font.BOLD, 24));
        tecladoVirtual.setTextFieldAtual(txfResposta);
        tecladoVirtual.mostrar();
    }//GEN-LAST:event_btnTecladoActionPerformed
  
    public static void main(String args[]) {
        
        FlatArcDarkOrangeIJTheme.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pergunta4 dialog = new Pergunta4(new javax.swing.JFrame(), true, 0);
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
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnTeclado;
    private javax.swing.JLabel marte;
    private javax.swing.JTextField txfResposta;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txtContagem;
    // End of variables declaration//GEN-END:variables
}
