package taschenrechner;

import javax.swing.*;
import java.util.HashMap;
import java.util.function.BiFunction;

public class MainComponent {
    private JPanel rootPanel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton buttonMal;
    private JButton buttonGeteilt;
    private JButton buttonMinus;
    private JTextField display;
    private JButton buttonPlus;
    private JButton buttonGleich;
    private double numberCache =0;
    private char calcSignCache =' ';

//    private HashMap<Character, BiFunction<Integer, Integer, Integer>> operators;


    public MainComponent() {
        a0Button.addActionListener(e -> numberPress(0));
        a1Button.addActionListener(e -> numberPress(1));
        a2Button.addActionListener(e -> numberPress(2));
        a3Button.addActionListener(e -> numberPress(3));
        a4Button.addActionListener(e -> numberPress(4));
        a5Button.addActionListener(e -> numberPress(5));
        a6Button.addActionListener(e -> numberPress(6));
        a7Button.addActionListener(e -> numberPress(7));
        a8Button.addActionListener(e -> numberPress(8));
        a9Button.addActionListener(e -> numberPress(9));
        buttonPlus.addActionListener(e -> calcSignPress('+'));
        buttonMinus.addActionListener(e -> calcSignPress('-'));
        buttonGeteilt.addActionListener(e -> calcSignPress('/'));
        buttonMal.addActionListener(e -> calcSignPress('*'));
        buttonGleich.addActionListener(e -> gleich());


//        operators=new HashMap<>();

//        operators.put('+', (Integer a, Integer b) -> { return a+b; } );
//        operators.put('*', (Integer a, Integer b) -> { return a*b; } );
//        operators.put('-', (Integer a, Integer b) -> { return a-b; } );
//        operators.put('/', (Integer a, Integer b) -> { return a/b; } );

    }

    private void gleich() {
        double number=Double.parseDouble(this.display.getText());

        double solution=0;

        if (calcSignCache == '+') {
            solution=this.numberCache +number;
        } else if(calcSignCache=='-') {
            solution=this.numberCache -number;
        }else if(calcSignCache=='*') {
            solution=this.numberCache *number;
        }else if(calcSignCache=='/') {
            solution=this.numberCache /number;
        }

//        solution=operators.get(this.calcSignCache).apply( this.numberCache, number);
        this.numberCache=0;
        this.display.setText(Double.toString(solution));
    }

    private void calcSignPress(char calcSign) {
        this.numberCache =Double.parseDouble(this.display.getText());
        this.display.setText("");
        this.calcSignCache =calcSign;
    }

    private void numberPress(int i) {
        String currentDisplay=this.display.getText();
        display.setText(currentDisplay+Integer.toString(i));
    }

    public JPanel getRootPanel() {
        return this.rootPanel;
    }
}