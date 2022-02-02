package Rabattrechner;

import javax.swing.*;

public class AnzeigeComponent {
    private JPanel rootPanel;
    private JTextField textFieldEingabe;
    private JButton rabattBerechnenButton;
    private JTextField textFieldRabatt;
    private JTextField textFieldEndbetrag;
    private JLabel labelRabatt;


    public AnzeigeComponent() {
        rabattBerechnenButton.addActionListener((e) -> rabattBerechnen());
    }

    private void rabattBerechnen() {
        // Text holen
        String eingabe=textFieldEingabe.getText();
        // umwandeln von Text in Zahl
        int betrag=Integer.parseInt(eingabe);

        if(betrag>=1000) {
            int rabatt=betrag*5/100;
            betrag=betrag-rabatt;
            labelRabatt.setText("Sie erhalten einen Rabatt von 5%");
            textFieldRabatt.setText(Integer.toString(rabatt));
        } else {
            labelRabatt.setText("<html>Sie erhalten erst<br/> ab einem Rechnungsbetrag<br/> von 1000 € Rabatt</html>");
        }
        // Text in Textfeld schreiben
        textFieldEndbetrag.setText(Integer.toString(betrag));
    }

    public JPanel getRootPanel() {
        return this.rootPanel;
    }
}
