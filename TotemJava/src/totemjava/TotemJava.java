package totemjava;

import apresentacao.*;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;

public class TotemJava {

    public static void main(String[] args) {
        
        FlatArcDarkOrangeIJTheme.setup();
        Iniciar iniciar = new Iniciar(null, true);
        iniciar.setVisible(true);
    }
    
}
