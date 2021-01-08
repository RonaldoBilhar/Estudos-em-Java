package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        //exibe data e hora
        Date relogio = new Date();
        System.out.println(relogio.toString());
        //exibe idioma do sistema
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage());
        //exibe resolução do monitor
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);
    }
    
}
