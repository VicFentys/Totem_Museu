package totemjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TecladoVirtual {
    
    JFrame frame;
    JTextField textFieldAtual;

    public TecladoVirtual() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(575,555,765,250);
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setLayout(new GridLayout(5, 1));

        String[][] keys = {
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "<--"},
            {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"},
            {"A", "S", "D", "F", "G", "H", "J", "K", "L", "Ç"},
            {"Z", "X", "C", "V", "B", "N", "M"},
            {"___"}
        };

        for (String[] row : keys) {
            
            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());
            
            for (String key : row) {
                
                JButton button = new JButton(key);
                button.setFont(new Font("Nasalization Rg", Font.BOLD, 22));
                
                if (key.equals("___")) {
                    button.setPreferredSize(new Dimension(250, 50)); // Aumenta o tamanho do botão ESPAÇO
                } else {
                    button.setPreferredSize(new Dimension(70, 50)); // Aumenta o tamanho dos outros botões
                }
                
                button.addActionListener(new ActionListener() { // funcionalidade dos botões
                    public void actionPerformed(ActionEvent e) {
                        String actionCommand = e.getActionCommand();
                        if (textFieldAtual != null) {

                            if ("<--".equals(actionCommand)) { // Remove a última letra
                                String text = textFieldAtual.getText();
                                if (!text.isEmpty()) {
                                    textFieldAtual.setText(text.substring(0, text.length() - 1));
                                }
                            } else if ("___".equals(actionCommand)) { // Adiciona um espaço
                                textFieldAtual.setText(textFieldAtual.getText() + " ");
                            } else {
                                textFieldAtual.setText(textFieldAtual.getText() + actionCommand);
                            }
                        }
                    }
                });
                panel.add(button);
            }
            frame.add(panel);
        }
        frame.pack();
    }
    
    public void setTextFieldAtual(JTextField textField) {
        this.textFieldAtual = textField;
    }

    public void mostrar() {
        frame.setVisible(true);
    }
    
    public void fechar() {
        frame.setVisible(false);
    }
}
