package ersteAnzeige;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
    //    this.setPreferredSize(new Dimension(800, 600));

        this.setContentPane(new TicTacToeComponent());


        this.setTitle("Hallo Welt");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
}
