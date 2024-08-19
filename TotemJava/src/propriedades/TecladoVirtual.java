package propriedades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TecladoVirtual {
    
    JFrame frame;
    JTextField textFieldAtual; // Cria um campo de texto provisório global para ser definido em cada pergunta
    JTextArea textAreaAtual; // Campo de texto para a seção de comentários

    public TecladoVirtual() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(575,555,0,0);
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setLayout(new GridLayout(5, 1)); // layout a ser usado

        String[][] keys = { // Define uma array para cada linha, ficando com o layout desejado
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "<--"},
            {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"},
            {"A", "S", "D", "F", "G", "H", "J", "K", "L", "Ç"},
            {"Z", "X", "C", "V", "B", "N", "M"},
            {",", "___", "."}
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
                                textFieldAtual.setText(textFieldAtual.getText() + actionCommand.toLowerCase());
                            }
                        }
                        if (textAreaAtual != null) {
                            if ("<--".equals(actionCommand)) { // Remove a última letra
                                String text = textAreaAtual.getText();
                                if (!text.isEmpty()) {
                                    textAreaAtual.setText(text.substring(0, text.length() - 1));
                                }
                            } else if ("___".equals(actionCommand)) { // Adiciona um espaço
                                textAreaAtual.setText(textAreaAtual.getText() + " ");
                            } else {
                                textAreaAtual.setText(textAreaAtual.getText() + actionCommand.toLowerCase());
                            }
                        }
                    }
                });
                panel.add(button); // Adiciona os botões ao painel
            }
            frame.add(panel); // Adiciona o painel ao JFrame
        }
        frame.pack(); // Configura o JFrame para usar seu tamanho mínimo
    }
    
    public void setTextFieldAtual(JTextField textField) { // Cria o método que será usado no nome
        this.textFieldAtual = textField;
    }
    
    public void setTextAreaAtual(JTextArea textArea) { // Cria o método que será usado na pergunta de satisfação
        this.textAreaAtual = textArea;
    }

    public void mostrar() {
        frame.setVisible(true);
    }
    
    public void fechar() {
        frame.setVisible(false);
    }
}
