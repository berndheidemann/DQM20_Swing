package beispiel;

import javax.swing.*;

public class FensterComponent {


    private JPanel rootPanel;
    private JTextField textField1;
    private JButton button1;


    public FensterComponent() {
        // clickBtn wird "registiert" für einen Klick auf button1
        button1.addActionListener((e) -> clickBtn());
    }

    private void clickBtn() {
        String text=textField1.getText();
        System.out.println(text);

    }

    // getter um auf das Rootpanel zuzugreifen
    public JPanel getRootPanel() {
        return rootPanel;
    }
}
