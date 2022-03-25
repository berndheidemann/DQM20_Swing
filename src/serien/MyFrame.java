package serien;

import rabattrechner2.AnzeigeComponent;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setVisible(true);
        setPreferredSize(new Dimension(710, 280));
        setTitle("Rabattrechner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var comp=new MainComponent();
        var rootPanel=comp.getRootPanel();
        setContentPane(rootPanel);



        pack();
    }

}
