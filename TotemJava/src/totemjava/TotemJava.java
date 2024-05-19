package totemjava;

import apresentacao.*;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;

public class TotemJava {

    public static void main(String[] args) {
        
        FlatArcDarkOrangeIJTheme.setup(); // Tema padrão definido para a aplicação
        new Fundo(null, false).setVisible(true); // Background
        new Iniciar(null, false).setVisible(true); // Abre a tela de início
    }
    
}
