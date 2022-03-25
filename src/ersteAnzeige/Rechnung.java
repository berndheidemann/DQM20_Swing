package ersteAnzeige;

import javax.swing.*;

public class Rechnung {
    private JTextField textFieldArtikel;
    private JTextField textFieldMenge;
    private JTextField textFieldPreis;
    private JButton ausgebenButton;
    private JTextField textFieldSumme;
    private JPanel panel;
    private JLabel imageFooter;

    public Rechnung() {
        this.ausgebenButton.addActionListener((e) -> ausgeben());
    }

    public JPanel getRootPanel() {
        return this.panel;
    }

    private void ausgeben() {
        System.out.println(textFieldArtikel.getText());
        System.out.println(textFieldMenge.getText());
        System.out.println(textFieldPreis.getText());

        int menge=Integer.parseInt(textFieldMenge.getText());
        double preis=Double.parseDouble(textFieldPreis.getText());
        this.textFieldSumme.setText(Double.toString(menge*preis));
    }

}
