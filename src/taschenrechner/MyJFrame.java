package taschenrechner;

import serien.MyFrame;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public MyJFrame() {
        setVisible(true);
        setPreferredSize(new Dimension(600, 400));

        MainComponent comp=new MainComponent();

        setContentPane(comp.getRootPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();


    }
}
