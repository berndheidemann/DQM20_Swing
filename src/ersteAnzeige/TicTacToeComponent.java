package ersteAnzeige;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TicTacToeComponent extends JPanel {


    private boolean xIstDran=true;

    public TicTacToeComponent() {

        this.setLayout(new GridLayout(3,3));

        for(int i=0;i<9;i++) {
            JLabel jl=new JLabel();
            jl.setPreferredSize(new Dimension(200, 200));
            jl.setBackground(Color.BLACK);
            jl.setForeground(Color.WHITE);
            jl.setOpaque(true);
            jl.setBorder(new LineBorder(Color.WHITE, 5));
            jl.setFont(new Font("Arial", 1, 150));
            jl.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(jl);
            jl.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    JLabel source=(JLabel)e.getSource();
                    if(xIstDran) {
                        source.setText("X");

                    } else {
                        source.setText("O");
                    }
                    xIstDran=!xIstDran;

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
        }


    }





}
