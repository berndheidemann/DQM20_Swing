package rabattrechner2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class AnzeigeComponent {
    private JPanel rootPanel;
    private JTextField textFieldEingabe;
    private JButton rabattBerechnenButton;
    private JTextField textFieldRabatt;
    private JTextField textFieldEndsumme;
    private JLabel labelRabattText;
    private JTable table1;
    private JTree tree1;
    private JSlider slider1;

    public AnzeigeComponent() {
        this.rabattBerechnenButton.addActionListener(e -> click());
    }

    public void click() {
        String betragAsString=textFieldEingabe.getText();
        int betrag=Integer.parseInt(betragAsString);

        if(betrag>=1000) {
            int rabatt=betrag*5/100;
            textFieldRabatt.setText(Integer.toString(rabatt));
            labelRabattText.setText("sie erhalten Rabatt von 5%");
            textFieldEndsumme.setText(Integer.toString(betrag-rabatt));
        } else {
            textFieldEndsumme.setText(Integer.toString(betrag));
            textFieldRabatt.setText("");
            labelRabattText.setText("<html>Sie erhalten erst ab<br/> einem Betrag von 1000€ Rabatt!</html>");
        }
    }

    public JPanel getRootPanel() {
        return this.rootPanel;
    }
}
