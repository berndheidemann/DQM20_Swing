package beispiel;

import javax.swing.*;
import java.awt.*;

// JFrame ist ein Fenster
public class ErstesBeispielFenster extends JFrame {

    public ErstesBeispielFenster()  {
        // sichtbar machen
        setVisible(true);
        // Größe setzen
        setPreferredSize(new Dimension(800, 600));

        // Titel setzen
        setTitle("Erstes Beispiel Fenster");

        // Close on Exit, d.h. Programm beenden wenn oben rechts X gedrückt wird
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // jetzt kommt: Inhalt!

        // Objekt vom Typ FensterComponent erstellen
        FensterComponent inhaltComponent=new FensterComponent();

        // Zugriff auf das RootPanel in der inhaltComponent
        // und setzen als ContentPane (als Inhalt)
        setContentPane(inhaltComponent.getRootPanel());

        // Pack immer ganz unten
        pack();



    }
}
