package taxi;

import rabattrechner2.AnzeigeComponent;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setVisible(true);
        setPreferredSize(new Dimension(710, 280));
        setTitle("Rabattrechner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AnzeigeComponent comp=new AnzeigeComponent();
        JPanel rootPanel=comp.getRootPanel();
        setContentPane(rootPanel);



        pack();
    }

}
