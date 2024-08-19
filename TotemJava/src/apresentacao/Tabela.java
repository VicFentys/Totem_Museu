package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import propriedades.*;

public class Tabela extends javax.swing.JDialog {
        
    public Tabela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addLinha();
    }
    
    public ArrayList Lista() { // Cria uma lista para cada jogador
        ArrayList<Jogador> list = new  ArrayList<>();
        Jogador j1 = new Jogador("fernando", 2, 7);
        Jogador j2 = new Jogador("maria", 3, 9);
        Jogador j3 = new Jogador("douglas", 5, 6);
        Jogador j4 = new Jogador(Estaticos.nome, Estaticos.resCorretas, Estaticos.AVALIACAO);
        list.add(j1);
        list.add(j2);
        list.add(j3);
        list.add(j4);
        return list;
    }
    
    public void addLinha() { // Adiciona as linhas na tabela
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        ArrayList<Jogador> list = Lista();
        Object rowData[] = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getNome();
            rowData[1] = list.get(i).getTotal();
            rowData[2] = list.get(i).getAva();
            modelo.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnInicio = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Nasalization Rg", 0, 40)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 119, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("TABELA DE CLASSIFICAÇÃO");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, -1));

        jScrollPane3.setBackground(new java.awt.Color(7, 15, 43));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 77, 1)));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tabela.setAutoCreateRowSorter(true);
        tabela.setBackground(new java.awt.Color(7, 15, 43));
        tabela.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        tabela.setForeground(new java.awt.Color(239, 236, 236));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Acertos", "Avaliação"
            }
        ));
        tabela.setFocusable(false);
        tabela.setRequestFocusEnabled(false);
        tabela.setRowHeight(40);
        tabela.setSelectionBackground(new java.awt.Color(7, 15, 43));
        tabela.setSelectionForeground(new java.awt.Color(239, 236, 236));
        tabela.setShowGrid(true);
        tabela.getTableHeader().setResizingAllowed(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMaxWidth(1000);
            tabela.getColumnModel().getColumn(1).setMaxWidth(100);
            tabela.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 580, 330));

        btnInicio.setBackground(new java.awt.Color(224, 77, 1));
        btnInicio.setFont(new java.awt.Font("Nasalization Rg", 1, 40)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(37, 29, 58));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esquerda.png"))); // NOI18N
        btnInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnInicio.setBorderPainted(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 150, -1));

        txt2.setFont(new java.awt.Font("Nasalization Rg", 0, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(224, 77, 1));
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Voltar ao Início");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 210, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/marte1.png"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, -1));

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

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        btnInicio.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        btnInicio.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        new Iniciar(null, true).setVisible(true); // Reinicia o quiz
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    public static void main(String args[]) {
        
        FlatArcDarkOrangeIJTheme.setup(); // Tema padrão definido para a aplicação
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tabela dialog = new Tabela(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables
}
