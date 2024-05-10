package totemjava;

import apresentacao.Iniciar;
import com.formdev.flatlaf.FlatDarkLaf;

public class TotemJava {

    public static void main(String[] args) {
        
        FlatDarkLaf.setup();
        Iniciar iniciar = new Iniciar(null, true);
        iniciar.setVisible(true);
    }
    
}
