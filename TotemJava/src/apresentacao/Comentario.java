package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;
import propriedades.*;

public class Comentario extends javax.swing.JDialog {
    
    private TecladoVirtual tecladoVirtual; // Define o objeto do teclado virtual
    
    public Comentario(java.awt.Frame parent, boolean modal) {
        super(parent, false);
        initComponents();
        tecladoVirtual = new TecladoVirtual(); // Chama a classe construtora teclado virtual
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txfResposta = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnTeclado = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Nasalization Rg", 0, 30)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 119, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("SUGESTÕES & COMENTÁRIOS");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, -1));

        txt3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt3.setForeground(new java.awt.Color(239, 236, 236));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("<html>\n<div style= 'text-align: center'>\n<p>Caso tenha alguma observação, ou gostaria de apontar<br/>\n<p style='margin-top: 8'>possíveis mudanças referente a nossa exposição, \n<p style='margin-top: 8'>digite no campo abaixo. Agradecemos seu tempo!");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, -1));

        txt4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 204, 0));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 170, -1));

        btnVoltar.setBackground(new java.awt.Color(224, 77, 1));
        btnVoltar.setFont(new java.awt.Font("Nasalization Rg", 1, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(37, 29, 58));
        btnVoltar.setText("Próximo");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnVoltar.setBorderPainted(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusPainted(false);
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarMouseExited(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 120, 40));

        jScrollPane1.setBorder(null);

        txfResposta.setBackground(new java.awt.Color(37, 29, 58));
        txfResposta.setColumns(20);
        txfResposta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfResposta.setForeground(new java.awt.Color(140, 140, 140));
        txfResposta.setLineWrap(true);
        txfResposta.setRows(3);
        txfResposta.setText("Clique no botão de teclado para digitar sua resposta");
        txfResposta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 77, 1)));
        txfResposta.setFocusable(false);
        jScrollPane1.setViewportView(txfResposta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 600, 90));

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

        background.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        background.setMaximumSize(new java.awt.Dimension(800, 600));
        background.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        tecladoVirtual.fechar();
        
        if (txfResposta.getText().equals("") || 
            txfResposta.getText().equals("Clique no botão de teclado para digitar sua resposta")) { // Mensagem de texto
            
            txt4.setForeground(new Color(255,0,0));
            txt4.setText("<html>\n" +
                         "<div style= 'text-align: center'>\n" +
                         "<p>Nenhum valor<br/>\n" +
                         "<p style='margin-top: 8'>digitado");
        }
        else {
            txt4.setForeground(new Color(0,204,0));
            txt4.setText("<html>\n" +
                         "<div style= 'text-align: center'>\n" +
                         "<p>Comentário enviado,<br/>\n" +
                         "<p style='margin-top: 8'>obrigado!");
        }
        
        txfResposta.setFocusable(false);
        txfResposta.setText("Clique no botão de teclado para digitar sua resposta");
        txfResposta.setForeground(new Color(140,140,140));
        txfResposta.setFont(new Font("Segoe UI", Font.PLAIN, 18));
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecladoActionPerformed

        txt4.setText("");
        txfResposta.setFocusable(true);
        txfResposta.setText("");
        txfResposta.setForeground(new Color(239,236,236));
        txfResposta.setFont(new Font("Segoe UI", Font.BOLD, 20));
        tecladoVirtual.setTextAreaAtual(txfResposta); // Define o campo de texto como o atual
        tecladoVirtual.mostrar(); // Abre o teclado virtual
    }//GEN-LAST:event_btnTecladoActionPerformed

    private void btnTecladoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTecladoMouseExited
        btnTeclado.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnTecladoMouseExited

    private void btnTecladoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTecladoMouseEntered
        btnTeclado.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnTecladoMouseEntered

    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseEntered
        btnVoltar.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnVoltarMouseEntered

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited
        btnVoltar.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnVoltarMouseExited

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Resultado(null, true).setVisible(true); // Chama o próximo JDialog
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
  
    public static void main(String args[]) {
        
        FlatArcDarkOrangeIJTheme.setup(); // Tema padrão definido para a aplicação

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Comentario dialog = new Comentario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txfResposta;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    // End of variables declaration//GEN-END:variables
}
