package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;
import propriedades.*;
import javax.swing.JOptionPane;

public class Nome extends javax.swing.JDialog {
    
    private TecladoVirtual tecladoVirtual; // Define o objeto teclado virtual
    
    public Nome(java.awt.Frame parent, boolean modal) {
        super(parent, false);
        initComponents();
        tecladoVirtual = new TecladoVirtual(); // Chama a classe construtora do teclado virtual
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txfResposta = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnTeclado = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Nasalization Rg", 0, 30)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 119, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("MUSEU DE SOROCABA - QUIZ GAME");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, -1));

        txt2.setFont(new java.awt.Font("OCR A Extended", 1, 26)); // NOI18N
        txt2.setForeground(new java.awt.Color(239, 236, 236));
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Digite seu nome para começar");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 800, -1));

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

        background.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
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
        
        if (txfResposta.getText().isEmpty() || txfResposta.getText().equals("Clique no botão de teclado para digitar sua resposta")) {            
            JOptionPane.showMessageDialog(null, "Digite um valor válido no campo", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            txfResposta.setFocusable(false);
            txfResposta.setText("Clique no botão de teclado para digitar sua resposta");
            txfResposta.setForeground(new Color(140,140,140));
            txfResposta.setFont(new Font("OCR A Extended", Font.PLAIN, 18));
        }
        else {
            Estaticos.nome = txfResposta.getText();
            new Pergunta1(null, true).setVisible(true); // Chama o próximo JDialog
            this.dispose();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecladoActionPerformed

        txfResposta.setFocusable(true);
        txfResposta.setText("");
        txfResposta.setForeground(new Color(239,236,236));
        txfResposta.setFont(new Font("OCR A Extended", Font.BOLD, 24));
        tecladoVirtual.setTextFieldAtual(txfResposta); // Define o campo de texto como o atual
        tecladoVirtual.mostrar(); // Abre o teclado virtual
    }//GEN-LAST:event_btnTecladoActionPerformed
  
    public static void main(String args[]) {
        
        FlatArcDarkOrangeIJTheme.setup(); // Tema padrão definido para a aplicação

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Nome dialog = new Nome(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField txfResposta;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables
}
