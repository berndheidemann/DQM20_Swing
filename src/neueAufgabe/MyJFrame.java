package neueAufgabe;

import taschenrechner.MainComponent;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public MyJFrame() {
        setVisible(true);
        setPreferredSize(new Dimension(600, 600));

        KalkulationComponent comp=new KalkulationComponent();

        setContentPane(comp.getRootPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();


    }
}
